/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc;

import java.sql.Statement;
//import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author WINDOWS 10
 */
public class DataMahasiswaIlkom extends javax.swing.JFrame {

    /**
     * Creates new form DataMahasiswaIlkom
     */
    public DataMahasiswaIlkom() {
        //MEMANGGIL KELAS
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Aplikasi Data Mahasiswa");
        
        koneksi k = new koneksi();
        //query q = new query();
        
        k.jalankanKoneksi();
        txstatus.setText(k.statuskoneksi);
       
        
        ButtonGroup bG = new ButtonGroup ();
        bG.add (rdlakilaki);
        bG.add (rdperempuan);
        
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    Statement pst ;
    ResultSet rs;

 public void table()
    { koneksi k = new koneksi();
    k.jalankanKoneksi();
     try {
   String sql = "select *from identitas";
            Statement pst = k.conn.createStatement();
            pst = (Statement) k.conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tblidentitas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txnama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblnim = new javax.swing.JLabel();
        lblnama = new javax.swing.JLabel();
        lblalamat = new javax.swing.JLabel();
        rdlakilaki = new javax.swing.JRadioButton();
        rdperempuan = new javax.swing.JRadioButton();
        btnsubmit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblidentitas = new javax.swing.JTable();
        lblidentitas = new javax.swing.JLabel();
        btnedit = new javax.swing.JButton();
        btnriset = new javax.swing.JButton();
        btndelete1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txalamat = new javax.swing.JTextArea();
        btnstatus = new javax.swing.JButton();
        txstatus = new javax.swing.JTextField();
        txnim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DATA MAHASISWA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 360, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnamaActionPerformed(evt);
            }
        });
        jPanel2.add(txnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lblgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblgender.setForeground(new java.awt.Color(255, 255, 255));
        lblgender.setText("Masukkan Gender");
        jPanel2.add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 20));

        lblnim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnim.setForeground(new java.awt.Color(255, 255, 255));
        lblnim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnim.setText("Masukkan NIM");
        jPanel2.add(lblnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        lblnama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblnama.setForeground(new java.awt.Color(255, 255, 255));
        lblnama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnama.setText("Masukkan Nama");
        jPanel2.add(lblnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 20));

        lblalamat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblalamat.setForeground(new java.awt.Color(255, 255, 255));
        lblalamat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblalamat.setText("Masukkan Alamat");
        jPanel2.add(lblalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 20));

        rdlakilaki.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdlakilaki.setForeground(new java.awt.Color(255, 255, 255));
        rdlakilaki.setText("LAKI-LAKI");
        jPanel2.add(rdlakilaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        rdperempuan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdperempuan.setForeground(new java.awt.Color(255, 255, 255));
        rdperempuan.setText("PEREMPUAN");
        jPanel2.add(rdperempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnsubmit.setBackground(new java.awt.Color(0, 204, 102));
        btnsubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblidentitas.setBackground(new java.awt.Color(153, 153, 153));
        tblidentitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "NAMA", "ALAMAT", "GENDER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblidentitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblidentitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblidentitas);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 400, 180));

        lblidentitas.setBackground(new java.awt.Color(255, 255, 255));
        lblidentitas.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblidentitas.setForeground(new java.awt.Color(255, 255, 255));
        lblidentitas.setText("IDENTITAS MAHASISWA");
        jPanel3.add(lblidentitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnedit.setBackground(new java.awt.Color(0, 153, 153));
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel3.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        btnriset.setBackground(new java.awt.Color(0, 153, 153));
        btnriset.setText("RESET");
        btnriset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrisetActionPerformed(evt);
            }
        });
        jPanel3.add(btnriset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        btndelete1.setBackground(new java.awt.Color(0, 153, 153));
        btndelete1.setText("DELETE");
        btndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete1ActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 420, 260));

        txalamat.setColumns(20);
        txalamat.setRows(5);
        jScrollPane2.setViewportView(txalamat);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 50));

        btnstatus.setBackground(new java.awt.Color(0, 153, 153));
        btnstatus.setText("STATUS");
        btnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatusActionPerformed(evt);
            }
        });
        jPanel2.add(btnstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 80, 30));

        txstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txstatusActionPerformed(evt);
            }
        });
        jPanel2.add(txstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 290, 30));

        txnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnimActionPerformed(evt);
            }
        });
        jPanel2.add(txnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 580, 330));

        jLabel3.setBackground(new java.awt.Color(204, 255, 102));
        jLabel3.setFont(new java.awt.Font("Impact", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Universitas Nahdlatul Ulama Blitar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 460, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\WINDOWS 10\\Pictures\\LOGOUNU.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnamaActionPerformed

    private void txnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnimActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        String gender =  "";
        if (rdlakilaki.isSelected())
        {gender = "L";}
        else if (rdperempuan.isSelected())
        {gender = "P";}
        //membuat class baru dari query insert
        query in = new query ();
        
        String NIM = txnim.getText();
        String nama = txnama.getText();
        String alamat = txalamat.getText();
        
        in.insert(NIM, nama, alamat, gender);
        table();
//        
//       // MENAMPILKAN KE TABEL
//        DefaultTableModel model=(DefaultTableModel)tblidentitas.getModel();
//        model.addRow(new Object[]{txnim.getText(),txnama.getText(), 
//            txalamat.getText(), rdlakilaki.isSelected(), rdperempuan.isSelected()});
       
        




    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnstatusActionPerformed

    private void txstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txstatusActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        
        koneksi k = new koneksi();
        k.jalankanKoneksi();
        
        query ubah  = new query();
        String NIM = txnim.getText();
        String nama = txnama.getText();
        String alamat = txalamat.getText();
        String gender = "";
        
            if (rdlakilaki.isSelected())
            {gender = "L";}
            else if (rdperempuan.isSelected())
            {gender = "P";}
            
            ubah.update (NIM, nama, alamat, gender); 
            
            table();
            
        
        
    }//GEN-LAST:event_btneditActionPerformed

    private void tblidentitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblidentitasMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = ( DefaultTableModel) tblidentitas.getModel();
        int selectedrowindex = tblidentitas.getSelectedRow();
        String id = (String) dtm.getValueAt(selectedrowindex , 0);
        
         koneksi k = new koneksi();
         k.jalankanKoneksi();
        
         try {
             String sql = "select * from identitas where nim like '%" + id + "%'";
            Statement pst = k.conn.createStatement();
            pst = (Statement) k.conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            
            while (rs.next())
            {txnim.setText(rs.getString("NIM"));
            txnama.setText(rs.getString("nama"));
            txalamat.setText(rs.getString("alamat"));
            
            String gender = rs.getString("gender");
            if(gender.equals("L"))
            {rdlakilaki.setSelected(true);}
            else
            {rdperempuan.setSelected(true);}
            
            
            }
             
         }
catch(Exception ex){}

    }//GEN-LAST:event_tblidentitasMouseClicked

    private void btnrisetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrisetActionPerformed
        // TODO add your handling code here:
        txnim.setText("");
        txnama.setText("");
        txalamat.setText("");
    }//GEN-LAST:event_btnrisetActionPerformed

    private void btndelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete1ActionPerformed
        // TODO add your handling code here:
        koneksi k = new koneksi();  
        k.jalankanKoneksi();
        
        query del = new query ();
        del.hapus(txnim.getText());
        table();

    }//GEN-LAST:event_btndelete1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswaIlkom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswaIlkom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswaIlkom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswaIlkom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataMahasiswaIlkom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete1;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnriset;
    private javax.swing.JButton btnstatus;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblalamat;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblidentitas;
    private javax.swing.JLabel lblnama;
    private javax.swing.JLabel lblnim;
    private javax.swing.JRadioButton rdlakilaki;
    private javax.swing.JRadioButton rdperempuan;
    private javax.swing.JTable tblidentitas;
    private javax.swing.JTextArea txalamat;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnim;
    private javax.swing.JTextField txstatus;
    // End of variables declaration//GEN-END:variables

  
}
