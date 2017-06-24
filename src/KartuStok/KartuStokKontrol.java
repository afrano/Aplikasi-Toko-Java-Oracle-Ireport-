/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KartuStok;

import Barang.barang;
import Barang.Kontrol_barang;
import Koneksi.koneksiOracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Awenk
 */
public class KartuStokKontrol {

    private Connection conn;

    public KartuStokKontrol(Connection koneksi) {
        this.conn = koneksi;
    }

    public KartuStokKontrol() {
    }

    public static KartuStokKontrol getkoneksikartustok() throws SQLException {
        koneksiOracle k = new koneksiOracle();
        KartuStokKontrol kon = new KartuStokKontrol(k.getKoneksiOracleDB());
        return kon;
    }

    public void tambahkartustok(KartuStok stock) throws SQLException {
        PreparedStatement psmt = null;
        conn.setAutoCommit(false);
        java.util.Date tanggal = stock.getTanggal();
        String sql = "insert into kartustok (tanggal,nobukti,kodebarang,keterangan,masuk,keluar) values(?,?,?,?,?,?)";
        psmt = conn.prepareStatement(sql);
        psmt.setDate(1, new java.sql.Date(tanggal.getTime()));
        psmt.setString(2, stock.getNobukti());
        psmt.setString(3, stock.getKodebarang().getKode());
        psmt.setString(4, stock.getKeterangan());
        psmt.setInt(5, stock.getMasuk());
        psmt.setInt(6, stock.getKeluar());
        psmt.executeUpdate();
        psmt.close();
        conn.commit();
        conn.close();
    }

    public void updateKartustok(KartuStok stock) throws SQLException {
        PreparedStatement psmt = null;
        conn.setAutoCommit(false);
        barang kodebarang = stock.getKodebarang();
        String kode = kodebarang.getKode();
        java.util.Date tanggal = stock.getTanggal();
        String sql = "update kartustok set tanggal =?,kodebarang=?, keterangan=?,masuk=?,keluar=? where nobukti=?";
        psmt = conn.prepareStatement(sql);
        psmt.setDate(1, new java.sql.Date(tanggal.getTime()));
        psmt.setString(2, stock.getKodebarang().getKode());
        psmt.setString(3, stock.getKeterangan());
        psmt.setInt(4, stock.getMasuk());
        psmt.setInt(5, stock.getKeluar());
        psmt.setString(6, stock.getNobukti());
        psmt.executeUpdate();
        psmt.close();
        conn.commit();
        conn.close();

    }

    public List<KartuStok> getAllStok(String kode) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String sql = "select * from kartustok where kodebarang like ? order by tanggal, nobukti desc";
        psmt = conn.prepareStatement(sql);
        psmt.setString(1, kode);
        rset = psmt.executeQuery();
        List<KartuStok> st = new ArrayList<KartuStok>();
        int saldostok = 0;
        int saldostokKeluar = 0;
        while (rset.next()) {
            KartuStok stok = new KartuStok();
            stok.setNobukti(rset.getString(1));
            stok.setTanggal(rset.getDate(2));
            barang brg = new barang();
            brg.setKode(rset.getString(3));
            barang b = Kontrol_barang.getKoneksi().carikodebarang(rset.getString(3));
            brg.setNamabarang(b.getNamabarang());
            stok.setKodebarang(brg);
            stok.setKeterangan(rset.getString(4));
            stok.setMasuk(rset.getInt(5));
            stok.setKeluar(rset.getInt(6));
            saldostok += rset.getInt(5);
            saldostokKeluar += rset.getInt(6);
            stok.setSaldoStok(saldostok - saldostokKeluar);
            st.add(stok);
        }
        psmt.close();
        conn.commit();
        conn.close();
        return st;
    }

    public KartuStok SatuStok(String kode) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String sql = "select * from kartustok where nobukti like ?";
        psmt = conn.prepareStatement(sql);
        psmt.setString(1, kode);
        rset = psmt.executeQuery();
        KartuStok stok = new KartuStok();
        int saldostok = 0;
        while (rset.next()) {
            stok.setNobukti(rset.getString(1));
            stok.setTanggal(rset.getDate(2));
            barang brg = new barang();
            brg.setKode(rset.getString(3));
            barang b = Kontrol_barang.getKoneksi().carikodebarang(rset.getString(3));
            brg.setNamabarang(b.getNamabarang());
            stok.setKodebarang(brg);
            stok.setKeterangan(rset.getString(4));
            stok.setMasuk(rset.getInt(5));
            stok.setKeluar(rset.getInt(6));
            stok.setSaldoStok(rset.getInt(5) - rset.getInt(6));

        }
        psmt.close();
        conn.commit();
        conn.close();
        return stok;
    }

    public void DeleteStok(String nobukti) throws SQLException {//menghapus data kategori
        PreparedStatement psmt = null;
        ResultSet rset = null;
        String sql = "delete from kartustok where nobukti=?";
        Statement stat = conn.prepareStatement(sql);
        psmt = conn.prepareStatement(sql);
        psmt.setString(1, nobukti);
        rset = psmt.executeQuery();
        psmt.close();
        conn.close();
    }

    public int kodeOtomatisMasuk() throws SQLException {
        ResultSet rset = null;
        int kode = 0;
        String sql = "select substr(max(nobukti),12) from kartustok where nobukti like 'M%'";
        Statement stat = conn.createStatement();
        rset = stat.executeQuery(sql);
        while (rset.next()) {
            kode = rset.getInt(1);
        }
        conn.close();
        return kode;
    }

    public int kodeOtomatisKELUAR() throws SQLException {
        ResultSet rset = null;
        int kode = 0;
        String sql = "select substr(max(nobukti),12) from kartustok where nobukti like 'K%'";
        Statement stat = conn.createStatement();
        rset = stat.executeQuery(sql);
        while (rset.next()) {
            kode = rset.getInt(1);
        }
        conn.close();
        return kode;
    }
}
