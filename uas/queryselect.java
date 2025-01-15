/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class queryselect  extends DataSYpulsa {
    koneksiuas konek = new koneksiuas();
    
    private javax.swing.JTable tblisi;//VARIABEL UTK MENYIMPAN REFERENSI TABEL 
    public queryselect()//CONSTRUKTOR DG PARAMETER TABEL
    { this.tblisi = tblisi;}//SIMPAN REFERENSI TABEL
        
      //======================QUERY SELECT================//
    Statement pst ;
    ResultSet rs;
    
    public void select (javax.swing.JTable tblisi) 
    
    { konek.RunKoneksi();
    try{
    String insertquery =  "select *from isi";
    Statement pst = konek.conn.createStatement();
    pst = (Statement) konek.conn.prepareStatement(insertquery);
    rs = pst.executeQuery(insertquery);
    
    //MENAMPILKAN HASIL QUERY PD TABEL
    tblisi.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
    
}}
