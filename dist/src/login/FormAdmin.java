/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Dimension;
import java.sql.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import koneksi.connection;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import tampilan.StokBarang;


/**
 *
 * @author Ryan
 */
public class FormAdmin extends javax.swing.JFrame {
    clsformadmin objAdmin = new clsformadmin();
    public FormAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        objAdmin.AksesData();
        isiTable();
    }
    private Connection conn = new connection().clsconnect();
    public void isiTable(){
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("id_admin");
        tabelmapel.addColumn("nama");
        tabelmapel.addColumn("Username");
        tabelmapel.addColumn("Password");
        tabelmapel.addColumn("Alamat");
        tabelmapel.addColumn("No_HP");
        
        
        try{
            objAdmin.AksesData();
            objAdmin.tampildata();
            Statement stat1 = objAdmin.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objAdmin.sql);
            while(res1.next()){
                tabelmapel.addRow(new Object[]{res1.getString(1),res1.getString(2),res1.getString(3),res1.getString(4),res1.getString(5),res1.getString(6)});                
            }tblAdmin.setModel(tabelmapel);
            }catch(Exception e){       
        }
    }
    
    public void Bersih(){
        txtID.setText("");
        txtNama.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtAlamat.setText("");
        txtNoHP.setText("");
        txtUsername.requestFocus();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baground = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNoHP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        bprint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gambar/vapor-removebg-preview.png")).getImage());
        setMinimumSize(new java.awt.Dimension(980, 560));
        setPreferredSize(new java.awt.Dimension(950, 520));

        baground.setBackground(new java.awt.Color(51, 0, 102));
        baground.setMinimumSize(new java.awt.Dimension(900, 520));
        baground.setPreferredSize(new java.awt.Dimension(900, 500));
        baground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, 211, 25));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID ADMIN");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 6, 64, -1));
        jPanel3.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 97, 211, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAMA");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 77, 50, -1));
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 158, 211, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 138, 75, -1));
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 218, 211, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 198, 72, -1));
        jPanel3.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 276, 211, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ALAMAT");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 256, 72, -1));

        txtNoHP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoHPKeyTyped(evt);
            }
        });
        jPanel3.add(txtNoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 332, 211, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NO TELEPON");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 314, 96, -1));

        btnEdit.setBackground(new java.awt.Color(51, 0, 102));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit.png"))); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 30));

        btnHapus.setBackground(new java.awt.Color(51, 0, 102));
        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        btnHapus.setText("DELETE");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel3.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 100, 30));

        bclear.setBackground(new java.awt.Color(51, 0, 102));
        bclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bclear.setForeground(new java.awt.Color(255, 255, 255));
        bclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/refresh.png"))); // NOI18N
        bclear.setText("CLEAR");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });
        jPanel3.add(bclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 100, 30));

        baground.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 460));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/menu (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATA ADMIN VAPOR SHOP");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 350, 20));

        baground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 60));

        btnKeluar.setBackground(new java.awt.Color(51, 0, 102));
        btnKeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logout.png"))); // NOI18N
        btnKeluar.setText("EXIT");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        baground.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 110, 40));

        bprint.setBackground(new java.awt.Color(51, 0, 102));
        bprint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bprint.setForeground(new java.awt.Color(255, 255, 255));
        bprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/printer.png"))); // NOI18N
        bprint.setText("PRINT");
        bprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprintActionPerformed(evt);
            }
        });
        baground.add(bprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 110, 40));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Admin", "Nama", "Username", "Password", "Alamat", "No Telepon"
            }
        ));
        tblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAdmin);

        baground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 710, 410));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Created By Ryanprawira");
        baground.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, 30));

        getContentPane().add(baground, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
        String sql = "update admin set nama=? ,username=? ,password=?, alamat=?, no_hp=? where id_admin=?";
        
        PreparedStatement stat = conn.prepareStatement(sql);
      
        stat.setString(1, txtNama.getText());           
        stat.setString(2, txtUsername.getText());
        stat.setString(3, txtPassword.getText());
        stat.setString(4, txtAlamat.getText());
        stat.setString(5, txtNoHP.getText());
        stat.setString(6, txtID.getText());
            
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        Bersih();
        txtID.requestFocus();
        isiTable();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah "+e);   
        }   
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Ingin menghapus data? ", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok==0) {
            String sql="delete from admin where username='"+txtUsername.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                Bersih();
                txtUsername.requestFocus();
                isiTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus "+e);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        HalamanMenu menu = new HalamanMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void tblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminMouseClicked
        int baris = tblAdmin.getSelectedRow();
        String kolom1 = tblAdmin.getValueAt(baris,0).toString();
        String kolom2 = tblAdmin.getValueAt(baris,1).toString();
        String kolom3 = tblAdmin.getValueAt(baris,2).toString();
        String kolom4 = tblAdmin.getValueAt(baris,3).toString();
        String kolom5 = tblAdmin.getValueAt(baris,4).toString();
        String kolom6 = tblAdmin.getValueAt(baris,5).toString();
        
        txtID.setText(kolom1);
        txtNama.setText(kolom2);
        txtUsername.setText(kolom3);
        txtPassword.setText(kolom4);
        txtAlamat.setText(kolom5);
        txtNoHP.setText(kolom6);
    }//GEN-LAST:event_tblAdminMouseClicked

    private void txtNoHPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoHPKeyTyped
        if (Character.isAlphabetic (evt.getKeyChar())){
            evt.consume();   JOptionPane.showMessageDialog(null, "Masukan Hanya Angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        if ( txtNoHP.getText().length() == 15 ) {
            evt.consume();   JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Lebih Dari 15", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }  
    }//GEN-LAST:event_txtNoHPKeyTyped

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        Bersih();
        isiTable();
    }//GEN-LAST:event_bclearActionPerformed

    private void bprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintActionPerformed
       JasperReport reports;
        
        String path = ".\\src\\Report\\LaporanAdmin.jasper";
        try {
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer jviewer = new JasperViewer(jprint, false);
            
            jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(StokBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bprintActionPerformed

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
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel baground;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bprint;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoHP;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
