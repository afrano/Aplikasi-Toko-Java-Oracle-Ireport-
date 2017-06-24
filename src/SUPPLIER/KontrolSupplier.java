/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SUPPLIER;

import Koneksi.koneksiOracle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Aweng
 */
public class KontrolSupplier {

    private Connection conn;

    public KontrolSupplier(Connection koneksi) {
        this.conn = koneksi;
    }

    public static KontrolSupplier getkoneksiSupplier() throws SQLException {
        koneksiOracle k=new koneksiOracle();
        KontrolSupplier kon=new KontrolSupplier(k.getKoneksiOracleDB());
            return kon;
    }

    public void tambahSupplier(Supplier sup) throws SQLException {
        //Silahkan lengkapi
        conn.setAutoCommit(false);
        //......
        String sql = "insert into supplier(id_supplier,nama_supplier,alamat,telepon) values(?,?,?,?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        //.......
        statement.setString(1, sup.getIdSuplier());
        statement.setString(2, sup.getNamaSupplier());
        statement.setString(3, sup.getAlamatSupplier());
        statement.setString(4, sup.getTelp());
        statement.executeUpdate();
        statement.close();
        conn.commit();
        conn.close();
    }

    public boolean cekIDSupplier(String ID) throws SQLException {
        //Silahkan Lengkapi
        conn.setAutoCommit(false);
        //.........
        String sql = "select * from supplier where id_supplier=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, ID);
        ResultSet result = statement.executeQuery();
        boolean bantu = false;
        while (result.next()) {
            if (ID.equals(result.getString(1))) {
                bantu = true;
            }
        }
        statement.close();
        conn.commit();
        conn.close();
        return bantu;
    }

    public List<Supplier> LihatSemuaSupplier() throws SQLException {
        //Silahkan Lengkapi
        conn.setAutoCommit(false);
        //......
        String sql = "select * from supplier";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet result = statement.executeQuery();
        List<Supplier> sp = new ArrayList<Supplier>();
        while (result.next()) {
            Supplier sup = new Supplier();
            //.............
            sup.setIdSuplier(result.getString(1));
            sup.setNamaSupplier(result.getString(2));
            sup.setAlamatSupplier(result.getString(3));
            sup.setTelp(result.getString(4));
            sp.add(sup); //penting untuk memasukkan kedalam array list
        }
        statement.close();
        conn.commit();
        conn.close();
        return sp;
    }

    public void UpdateSupplier(Supplier sup) throws SQLException {
        //Silahkan Lengkapi
        conn.setAutoCommit(false);
        //..............
        String sql = "update supplier set nama_supplier=?,alamat=?,telepon=? where id_supplier=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        //..................
        
        statement.setString(1, sup.getNamaSupplier());
        statement.setString(2, sup.getAlamatSupplier());
        statement.setString(3, sup.getTelp());
        statement.setString(4, sup.getIdSuplier()); // urutan pada tanda '?' harus disamakan antara query dan coding
        statement.executeUpdate();
        statement.close();
        conn.commit();
        conn.close();
    }

    public void HapusSupplier(String idSupplier) throws SQLException {
        //Silahkan Lengkapi
        conn.setAutoCommit(false);
        //.................
        String sql = "delete from supplier where id_supplier=?";
        PreparedStatement statement = conn.prepareStatement(sql);
        //...............
        statement.setString(1, idSupplier);
        statement.executeUpdate();
        statement.close();
        conn.commit();
        conn.close();
    }
}
