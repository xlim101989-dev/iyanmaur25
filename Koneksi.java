/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jual_mobil1;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author labkomputersph
 */
public class Koneksi {
    private final String url="jdbc:mysql://localhost/penjualanmobil";
    private final String username="root";
    private final String password="";
    private Connection con;
     public void connect() {
         try{
             con = DriverManager.getConnection(url,username,password);
             System.out.println("Koneksi berhasil");
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
    public Connection getCon() {
        return con;
    }   
}
