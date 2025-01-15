/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class querydelete {
    koneksiuas konek = new koneksiuas();
    
    
     //==============QUERY DELETE BERDASAR NIM=====================//
    public void hapus (String NOMOR)
    
    {
    try{konek.RunKoneksi();
            Statement st = konek.conn.createStatement();
             String querydel = "DELETE FROM `isi` where NOMOR = '" + NOMOR + "'";   
               st.executeUpdate(querydel);
               st.close();
  
        JOptionPane.showMessageDialog(null,"BERHASIL DIHAPUS");
        
       
    }catch (Exception ex)
    {    JOptionPane.showMessageDialog(null,"TERJADI KESALAHAN HAPUS");}
    
    }
    
}
