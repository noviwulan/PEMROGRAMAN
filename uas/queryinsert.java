/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 *
 * @author WINDOWS 10
 */
public class queryinsert {
    koneksiuas konek = new koneksiuas();
    
    //======================QUERY INSERT================//
    public void insert (String NOMOR, String OPERATOR, String NOMINAL,
            String HARGA, String LAYANAN)
            
    { konek.RunKoneksi();
    String insertquery = "INSERT INTO `isi` (`NOMOR`, `OPERATOR`, `NOMINAL`, `HARGA`, `LAYANAN` ) VALUES (?, ?, ?, ?, ?)";
    
    try {
    PreparedStatement st = konek.conn.prepareStatement(insertquery);
    st.setString(1, NOMOR);
    st.setString(2, OPERATOR);
    st.setString(3, NOMINAL);
    st.setString(4, HARGA);  
    st.setString(5, LAYANAN);
    
    //EKSEKUSI QUERY
    int rowsInserted = st.executeUpdate();
    if(rowsInserted>0)
    {JOptionPane.showMessageDialog(null,"BERHASIL SIMPAN");}
        //System.out.println("BERHASIL INSERT")
    else {
        JOptionPane.showMessageDialog(null,"GAGAL SIMPAN");
        //System.out.println("GAGAL INSERT");
             
    }
    
    }catch(SQLException ex) {
        System.out.println("TERJADI KESALAHAN SIMPAN " + ex);}
    

    

    }}