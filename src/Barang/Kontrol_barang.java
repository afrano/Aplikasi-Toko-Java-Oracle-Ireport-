/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

import Kategori.KategoriBrng;
import Kategori.Kontrol_Kategori;
import Koneksi.koneksiOracle;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author basisb09
 */
public class Kontrol_barang {

    private Connection conn;

    public Kontrol_barang() {
    }

    public Kontrol_barang(Connection conn) {
        this.conn = conn;
    }

    public static Kontrol_barang getKoneksi() throws SQLException {
        Kontrol_barang kon = new Kontrol_barang(new koneksiOracle().getKoneksiOracleDB());
        return kon;
    }

    public int kodeBarangOtomatis(String kode) throws SQLException {
        ResultSet rset = null;
        String sql = "select substr(kode,4) from barang where kode like'" + kode + "%'" + "order by kode asc";
        Statement st = conn.createStatement();
        rset = st.executeQuery(sql);

        ResultSet rset1 = null;
        String sql1 = "select substr(max(kode),4) from barang where kode like'" + kode + "%'" + "order by kode asc";
        Statement st1 = conn.createStatement();
        rset1 = st1.executeQuery(sql1);

        int kodeBrg = 0;
        int bantu = 1;
        boolean x = false;
        while (rset.next()) {
            if (bantu != rset.getInt(1)) {
                x = true;
                break;
            }
            bantu++;
        }
        if (x == false) {
            kodeBrg = 0;
            while (rset.next()) {
                kodeBrg = rset1.getInt(1);
            }
        }
        conn.close();
        return kodeBrg;
    }

    public void tambahBarang(barang brg) throws SQLException {

        conn.setAutoCommit(false);
        String sql = "insert into barang(kode,barcode,namabarang,kategori,satuan,"
                + "qtymax,qtymin,hargajual,hargajualppn,hargabeli,hargabelippn,gambar) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, brg.getKode());
        st.setString(2, brg.getBarcode());
        st.setString(3, brg.getNamabarang());
        st.setString(4, brg.getKategori().getKode());
        st.setString(5, brg.getSatuan());
        st.setInt(6, brg.getQtymax());
        st.setInt(7, brg.getQtymin());
        st.setDouble(8, brg.getHargajual());
        st.setDouble(9, brg.getHargajualppn());
        st.setDouble(10, brg.getHargabeli());
        st.setDouble(11, brg.getHargabelippn());
        st.setString(12, brg.getGambar());
        st.executeUpdate();
        st.close();
        conn.commit();
        conn.close();

    }

    public List<barang> tampilBarang() throws SQLException {

        conn.setAutoCommit(false);
        String sql = "select * from barang";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet res = st.executeQuery();
        List<barang> brg = new ArrayList<barang>();
        while (res.next()) {
            barang br = new barang();
            br.setKode(res.getString(1));
            br.setBarcode(res.getString(2));
            br.setNamabarang(res.getString(3));

            KategoriBrng kat = new KategoriBrng();
            kat.setKode(res.getString(4));
            br.setKategori(kat);


            br.setSatuan(res.getString(5));
            br.setQtymax(res.getInt(6));
            br.setQtymin(res.getInt(7));
            br.setHargajual(res.getDouble(8));
            br.setHargajualppn(res.getDouble(9));
            br.setHargabeli(res.getDouble(10));
            br.setHargabelippn(res.getDouble(11));
            br.setGambar(res.getString(12));
            brg.add(br);
        }

        st.close();
        conn.commit();
        conn.close();
        return brg;
    }

    public void updateBarang(barang brg, String kode) throws SQLException {

        conn.setAutoCommit(false);
        String sql = "update barang set barcode=?,namabarang=?,kategori=?,"
                + "satuan=?,qtymax=?,qtymin=?,hargajual=?,hargajualppn=?,hargabeli=?"
                + ",hargabelippn=?,gambar=? where kode=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, brg.getBarcode());
        st.setString(2, brg.getNamabarang());
        st.setString(3, brg.getKategori().getKode());
        st.setString(4, brg.getSatuan());
        st.setInt(5, brg.getQtymax());
        st.setInt(6, brg.getQtymin());
        st.setDouble(7, brg.getHargajual());
        st.setDouble(8, brg.getHargajualppn());
        st.setDouble(9, brg.getHargabeli());
        st.setDouble(10, brg.getHargabelippn());
        st.setString(11, brg.getGambar());
        st.setString(12, kode);
        st.executeUpdate();
        st.close();
        conn.commit();
        conn.close();

    }

    public void hapusBarang(String kode) throws SQLException {

        conn.setAutoCommit(false);
        String sql = "delete from barang where kode=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, kode);
        st.executeUpdate();
        st.close();
        conn.commit();
        conn.close();

    }

    public barang carikodebarang(String kode) throws SQLException {

        conn.setAutoCommit(false);
        String sql = "select b.*,k.kategori from barang b,kategoribarang k "
                + " where b.kategori=k.kode and b.kode=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, kode);
        ResultSet res = st.executeQuery();
        barang br = new barang();
        while (res.next()) {

            br.setKode(res.getString(1));
            br.setBarcode(res.getString(2));
            br.setNamabarang(res.getString(3));

            KategoriBrng kat = new KategoriBrng();
            kat.setKode(res.getString(4));
            kat.setKategori(res.getString(13));//set nama kategori
            br.setKategori(kat);


            br.setSatuan(res.getString(5));
            br.setQtymax(res.getInt(6));
            br.setQtymin(res.getInt(7));
            br.setHargajual(res.getDouble(8));
            br.setHargajualppn(res.getDouble(9));
            br.setHargabeli(res.getDouble(10));
            br.setHargabelippn(res.getDouble(11));
            br.setGambar(res.getString(12));

        }


        st.close();
        conn.commit();
        conn.close();
        return br;
    }
}
