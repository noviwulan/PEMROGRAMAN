/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

// import bumbu-bumbu yang diperlukan
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

// bisa juga diimpor sekaligus seperti ini:
// import java.sql.*

/**
 *
 * @author WINDOWS 10
 */
public class koneksiuas {
    
        // Menyiapkan parameter JDBC untuk koneksi ke database
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/sypulsa";
    static final String USER = "root";
    static final String PASS = "";
    
        // Menyiapkan objek yang diperlukan untuk mengelola database
    public Connection conn;
    public Statement stmt;
    
    static void setText(String statuskoneksi) {}
    String statuskoneksi =" ";
    
    public String RunKoneksi() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            statuskoneksi = "konksi DATABASE berhasil";
        } catch (Exception e) {
            statuskoneksi = "gagal terkoneksi karena " + e;
        }
        return statuskoneksi;
    }
}
