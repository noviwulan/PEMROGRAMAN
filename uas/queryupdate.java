/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class queryupdate {
     koneksiuas konek = new koneksiuas(); // Menghubungkan ke koneksi database
     
        //======================QUERY SELECT================//
     public void updateData(String NOMOR, String OPERATOR, String NOMINAL, String HARGA, String LAYANAN) {
     konek.RunKoneksi(); // Membuka koneksi
     
        try{
          konek.RunKoneksi();
          Statement st = konek.conn.createStatement();
          String update_operator="update isi set operator='" + OPERATOR + "'where nomor='" +NOMOR+"'";
          String update_nominal="update isi set nominal='" + NOMINAL + "'where nomor='" +NOMOR+"'";
          String update_harga="update isi set harga='" + HARGA + "'where nomor='" +NOMOR+"'";
          String update_layanan="update isi set layanan='" + LAYANAN + "'where nomor"
                  + "='" +NOMOR+"'";

          st.executeUpdate(update_operator);
          st.executeUpdate(update_nominal);
          st.executeUpdate(update_harga);
          st.executeUpdate(update_layanan);
          st.close();
          
          JOptionPane.showMessageDialog(null, "BERHHASIL DIUBAH");
        }catch (Exception ex)
        {JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    
}
