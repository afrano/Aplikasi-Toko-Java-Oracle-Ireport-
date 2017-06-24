/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kategori;

import Koneksi.koneksiOracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basisb21la
 */
public class Kontrol_Kategori {
    private Connection conn;

    public Kontrol_Kategori() {
    }

    public Kontrol_Kategori(Connection conn) {
        this.conn = conn;
    }
    
    public static Kontrol_Kategori getKoneksi() throws SQLException{
            Kontrol_Kategori kon=new Kontrol_Kategori(new koneksiOracle().getKoneksiOracleDB());
            return kon;
}
    public void tambahKategori(KategoriBrng kat) throws SQLException{
        
        conn.setAutoCommit(false);
        String sql = "insert into kategoribarang(kode,kategori) values (?,?)";
        PreparedStatement st = conn.prepareStatement(sql) ;
        st.setString(1,kat.getKode());
        st.setString(2,kat.getKategori());
        st.executeUpdate();
        st.close();
        conn.commit();
        conn.close();
        
     }
    public List<KategoriBrng> tampilKategori() throws SQLException{
        
        conn.setAutoCommit(false);
        String sql = "select * from kategoribarang";
        PreparedStatement st = conn.prepareStatement(sql) ;
        ResultSet res=st.executeQuery();
        List<KategoriBrng> kat=new ArrayList<KategoriBrng>();
        while (res.next()){
            KategoriBrng kate=new KategoriBrng();
            kate.setKode(res.getString(1));
            kate.setKategori(res.getString(2));
            kat.add(kate);
        }
        
        st.close();
        conn.commit();
        conn.close();
        return kat;
     }
    public void updateKategori(KategoriBrng kat,String kode) throws SQLException{
        
        conn.setAutoCommit(false);
        String sql = "update kategoribarang set kode=?,kategori=? where kode=?";
        PreparedStatement st = conn.prepareStatement(sql) ;
        st.setString(1,kat.getKode());
        st.setString(2,kat.getKategori());
        st.setString(3,kode);
        st.executeUpdate();
        st.close();
       
        conn.close();
        
     }
    public void hapusKategori(String kode) throws SQLException{
        
        conn.setAutoCommit(false);
        String sql = "delete from kategoribarang where kode=?";
        PreparedStatement st = conn.prepareStatement(sql) ;
        st.setString(1,kode);
        st.executeUpdate();
        st.close();
       conn.commit();
        conn.close();
        
     }
    
    public KategoriBrng carikodeKategori(String kode) throws SQLException{
        
        conn.setAutoCommit(false);
        String sql = "select * from kategoribarang where kode=?";
        PreparedStatement st = conn.prepareStatement(sql) ;
        st.setString(1,kode);
        ResultSet res=st.executeQuery();
      KategoriBrng kate=new KategoriBrng();
        while (res.next()){
            kate.setKode(res.getString(1));
            kate.setKategori(res.getString(2));
        }
        
        st.close();
        conn.commit();
        conn.close();
        return kate;
     }
}