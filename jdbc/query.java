/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;
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
public class query {
    koneksi konek = new koneksi();
    
    //======================QUERY INSERT================//
    public void insert (String NIM, String nama, String alamat, String gender)
            
    { konek.jalankanKoneksi();
        String insertquery = "INSERT INTO `identitas` (`NIM`, `nama`, `alamat`, `gender`) VALUES (?, ?, ?, ?)";
    
    try {
    PreparedStatement st = konek.conn.prepareStatement(insertquery);
    st.setString(1, NIM);
    st.setString(2, nama);
    st.setString(3, alamat);
    st.setString(4, gender);
    
    //EKSEKUSI QUERY
    int rowsInserted = st.executeUpdate();
    if(rowsInserted>0){
        JOptionPane.showMessageDialog(null,"BERHASIL SIMPAN");
        
        //System.out.println("BERHASIL INSERT");
           }
    else {
        JOptionPane.showMessageDialog(null,"GAGAL SIMPAN");
        //System.out.println("GAGAL INSERT");
             
    }
    }catch (SQLException ex) {
        //Logger.getLogger(query.class.getName()).log (Level.SEVERE, null, ex);
        System.out.println("TERJADI KESALAHAN SIMPAN " + ex);
    }
    
}


    //============QUERY DELETE BERDASAR NIM=====================//
    public void hapus (String NIM)
    
    {
    try{konek.jalankanKoneksi();
            Statement st = konek.conn.createStatement();
             String deleteQuery = "DELETE FROM `identitas` where NIM = '" + NIM + "'";   
               st.executeUpdate(deleteQuery);
               st.close();
  
        JOptionPane.showMessageDialog(null,"BERHASIL DIHAPUS");
        
       
    }catch (Exception ex)
    {    JOptionPane.showMessageDialog(null,"TERJADI KESALAHAN HAPUS");}
    
    }

 
 /*public void hapusSemua(){
        String deleteAll= "DELETE FROM `identitas`";
         try{         
            PreparedStatement st= konek.conn.prepareStatement(deleteAll);
            
            //EKSEKUSI QUERY
            int eksekusi=st.executeUpdate();
            
            //SIMPAN
            if(eksekusi>0)
            {JOptionPane.showMessageDialog(null,"Berhasil Dihapus Semua");} 
            
            else {JOptionPane.showMessageDialog(null,"Gagal Dihapus Semua");};
         
        }
        catch (Exception ex){
            //Logger.getLogger(query.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null,"TERJADI KESALAHAN HAPUS SEMUA");
        }
        
    }
    
    public void load(){
        
    }
    */
    public void update (String NIM, String nama, String alamat, String gender)
    {
        try{
          konek.jalankanKoneksi();
          Statement st = konek.conn.createStatement();
          String update_nama="update identitas set nama='" + nama + "'where nim='" +NIM+"'";
          String update_alamat="update identitas set alamat='" + alamat + "'where nim='" +NIM+"'";
          String update_gender="update identitas set gender='" + gender + "'where nim='" +NIM+"'";

          st.executeUpdate(update_nama);
          st.executeUpdate(update_alamat);
          st.executeUpdate(update_gender);
          st.close();
          
          JOptionPane.showMessageDialog(null, "BERHHASIL DIUBAH");
        }catch (Exception ex)
        {JOptionPane.showMessageDialog(null, ex);
        }
    }

}