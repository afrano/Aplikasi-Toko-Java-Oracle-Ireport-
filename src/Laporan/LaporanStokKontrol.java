/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan;

import Barang.barang;
import KartuStok.KartuStok;
import Koneksi.koneksiOracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Awenk
 */
public class LaporanStokKontrol {

    private Connection conn;

    public LaporanStokKontrol(Connection koneksi) {
        this.conn = koneksi;
    }

    public LaporanStokKontrol() {
    }

    public static LaporanStokKontrol getkoneksikartustock() throws SQLException {//koneksi data kategori
        koneksiOracle k = new koneksiOracle();
        LaporanStokKontrol kon = new LaporanStokKontrol(k.getKoneksiOracleDB());
        return kon;
    }

    public List<KartuStok> getAllLaporanStock(Date tgl1, Date tgl2) throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String sql = "SELECT k.kodebarang, b.namabarang, SUM(k.masuk-k.keluar),b.hargabelippn FROM kartustok k LEFT JOIN barang b ON k.kodebarang=b.kode WHERE b.kode IN( SELECT kodebarang FROM kartustok WHERE tanggal BETWEEN ?AND ? )GROUP BY k.kodebarang,b.namabarang,b.hargabelippn ";
        psmt = conn.prepareStatement(sql);
        psmt.setDate(1, new java.sql.Date(tgl1.getTime()));
        psmt.setDate(2, new java.sql.Date(tgl2.getTime()));
        rset = psmt.executeQuery();
        List<KartuStok> st = new ArrayList<KartuStok>();
        while (rset.next()) {
            KartuStok stok = new KartuStok();
            barang brg = new barang();
            brg.setKode(rset.getString(1));
            brg.setNamabarang(rset.getString(2));
            brg.setHargajualppn(rset.getDouble(4));
            stok.setKodebarang(brg);
            stok.setSaldoStok(rset.getInt(3));
            stok.setNilaiPersedian(rset.getInt(3) * rset.getInt(4));
            st.add(stok);          
        }
        conn.commit();
        conn.close();
        return st;
    }
}
