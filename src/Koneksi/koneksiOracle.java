/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Yoren
 */
public class koneksiOracle {
    String jdbcUrl = "jdbc:oracle:thin:@172.23.9.185:1521:ORCL";
    String userid = "MHS145314005";
    String password = "nano";
    Connection conn;
    public koneksiOracle(){
        
    }
    public Connection getKoneksiOracleDB() {
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn=ds.getConnection(userid,password);
            System.out.println("Koneksi berhasil");
        }
        catch (SQLException ex ){
            System.out.println("Masih belum terkonek");
        }
        return conn;
    }
    public void close() {
        try {
            conn.close();
        }
        catch (SQLException ex ){
            System.out.println("Tidak bisa tutup koneksi");
        }
        
    }
    public static void main(String[] args){
        koneksiOracle c = new koneksiOracle();
        c.getKoneksiOracleDB();
//        c.LihatEmployees();
//        c.UpdateEmployees();//38
    }
    
    public void LihatEmployees(){
        try {
            conn.setAutoCommit(true);
            String sql = "select * from employees where employee_id=100";
            PreparedStatement st = conn.prepareStatement(sql) ;
                ResultSet rs= st.executeQuery();
                while(rs.next()){
                    System.out.println(rs.getString(2));
                }
                st.close();
                 conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(koneksiOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
               
    }
     public void UpdateEmployees(){
        try {
            conn.setAutoCommit(true);
            String sql = "update employees set first_name=? where employee_id=100";
            PreparedStatement st = conn.prepareStatement(sql) ;
               st.setString(1,"yoren");
               System.out.println("Berhasil diupdate");
               st.executeUpdate();
               st.close();
                 conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(koneksiOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}//bastinge123

