/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel_qlap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PY7
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getkoneksi() {
        try{
            String driver="com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://172.11.8.56/db_bengkel";
            String username = "root";
            String password = "";            
            koneksi = (Connection)DriverManager.getConnection(url, username, password);
            System.out.println("Berhasil");
        }catch (SQLException e){
            System.out.println(e);
        }
        return koneksi;
    }
}
