/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import koneksi.connection;
import login.HalamanMenu;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ryan
 */
public class Formsupplier extends javax.swing.JFrame {
    private Connection conn = new connection().clsconnect();
    private DefaultTableModel tabmode;
    
    protected void datatable(){
        Object[] Baris = {"ID Supplier","Nama", "Kota", "Alamat", "Nomor Telepon", "Email"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelSupplier.setModel(tabmode);
        String sql = "select * from supplier";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("id_supplier");
                String b = hasil.getString("nama");
                String c = hasil.getString("kota");
                String d = hasil.getString("alamat");
                String e = hasil.getString("no_hp");
                String f = hasil.getString("email");
                
                String[] data={a,b,c,d,e,f};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            
        }
    }
      
    public Formsupplier() {
        this.setTitle("Data Supplier");
        initComponents();
        datatable();
        setLocationRelativeTo(getRootPane());
        setIconImage();
    }
    
    protected void aktif(){
        txtidsupplier.setEnabled(true);
        txtnama.setEnabled(true);
        txtidsupplier.requestFocus();
     }
    protected void kosong(){
        txtidsupplier.setText("");
        txtnama.setText("");
        txtkota.setText("");
        txtalamat.setText("");
        txtNoHp.setText("");
        txtemail.setText("");
        tCari.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtidsupplier = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtNoHp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        Jtext1 = new javax.swing.JLabel();
        bSave = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtkota = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        bexit = new javax.swing.JButton();
        bprint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelSupplier = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tCari = new javax.swing.JTextField();
        brefresh = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        bCari1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(900, 500));

        background.setBackground(new java.awt.Color(51, 0, 102));
        background.setMinimumSize(new java.awt.Dimension(1000, 550));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtidsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email Supplier");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Supplier");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, -1));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 230, 30));

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kota");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, -1));

        txtNoHp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoHpKeyTyped(evt);
            }
        });
        jPanel1.add(txtNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, -1));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 230, 30));

        Jtext1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Jtext1.setForeground(new java.awt.Color(255, 255, 255));
        Jtext1.setText("Nomor Telepon");
        jPanel1.add(Jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, 20));

        bSave.setBackground(new java.awt.Color(51, 0, 102));
        bSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bSave.setForeground(new java.awt.Color(255, 255, 255));
        bSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save.png"))); // NOI18N
        bSave.setText("SAVE");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel1.add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 110, 30));

        bEdit.setBackground(new java.awt.Color(51, 0, 102));
        bEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bEdit.setForeground(new java.awt.Color(255, 255, 255));
        bEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit.png"))); // NOI18N
        bEdit.setText("EDIT");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        jPanel1.add(bEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 100, 30));

        bDelete.setBackground(new java.awt.Color(51, 0, 102));
        bDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bDelete.setForeground(new java.awt.Color(255, 255, 255));
        bDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        bDelete.setText("DELETE");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 110, 30));

        bCancel.setBackground(new java.awt.Color(51, 0, 102));
        bCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bCancel.setForeground(new java.awt.Color(255, 255, 255));
        bCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/refresh.png"))); // NOI18N
        bCancel.setText("CANCEL");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama Supplier");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, -1));
        jPanel1.add(txtkota, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 230, 30));

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 550));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATA SUPPLIER");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 31, 220, -1));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        bexit.setBackground(new java.awt.Color(51, 0, 102));
        bexit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bexit.setForeground(new java.awt.Color(255, 255, 255));
        bexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logout.png"))); // NOI18N
        bexit.setText("EXIT");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        background.add(bexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 100, 40));

        bprint.setBackground(new java.awt.Color(51, 0, 102));
        bprint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bprint.setForeground(new java.awt.Color(255, 255, 255));
        bprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/printer.png"))); // NOI18N
        bprint.setText("PRINT");
        bprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprintActionPerformed(evt);
            }
        });
        background.add(bprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 100, 40));

        tabelSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Supplier", "Nama", "Kota", "Alamat", "Nomor Telepon", "Email"
            }
        ));
        tabelSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelSupplier);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 770, 450));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Created By Ryanprawira");
        background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, -1, 20));
        background.add(tCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 290, 30));

        brefresh.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        brefresh.setText("REFRESH");
        brefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefreshActionPerformed(evt);
            }
        });
        background.add(brefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pencarian");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 60, 30));

        bCari1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        bCari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/searc.png"))); // NOI18N
        bCari1.setText("CARI");
        bCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCari1ActionPerformed(evt);
            }
        });
        background.add(bCari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1094, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSupplierMouseClicked
        int bar = tabelSupplier.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        
        txtidsupplier.setText(a);
        txtnama.setText(b);
        txtkota.setText(c);
        txtalamat.setText(d);
        txtNoHp.setText(e);
        txtemail.setText(f);
    }//GEN-LAST:event_tabelSupplierMouseClicked

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
       int ok = JOptionPane.showConfirmDialog(null,"hapus","Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0) {
            String sql ="delete from supplier where id_supplier ='"+txtidsupplier.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                txtidsupplier.requestFocus();
                datatable();
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" +e);
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        try {
        String sql = "update supplier set nama=?,kota=?,alamat=?,no_hp=?,email=? where id_supplier=?";
        
        PreparedStatement stat = conn.prepareStatement(sql);
      
        stat.setString(1, txtnama.getText());
        stat.setString(2, txtkota.getText());
        stat.setString(3, txtalamat.getText());
        stat.setString(4, txtNoHp.getText());
        stat.setString(5, txtemail.getText());
        stat.setString(6, txtidsupplier.getText());
            
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        kosong();
        txtidsupplier.requestFocus();
        datatable();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah "+e);   
        }   
    }//GEN-LAST:event_bEditActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        HalamanMenu menu = new HalamanMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bexitActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
       String sql = "insert into supplier values (?,?,?,?,?,?)";
    try {
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, txtidsupplier.getText());
        stat.setString(2, txtnama.getText());
        stat.setString(3, txtkota.getText());
        stat.setString(4, txtalamat.getText());
        stat.setString(5, txtNoHp.getText());
        stat.setString(6, txtemail.getText());
        
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        kosong();
        txtnama.requestFocus();
        datatable();
    }catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Data Gagal Disimpan "+e);
    }
    }//GEN-LAST:event_bSaveActionPerformed

    private void brefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefreshActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_brefreshActionPerformed

    private void bCari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCari1ActionPerformed
        Object[] Baris = {"ID Supplier","Nama", "Kota", "Alamat", "Nomor Telepon", "Email"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelSupplier.setModel(tabmode);
        String sql = "SELECT * FROM supplier WHERE id_supplier like '%"+tCari.getText()+"%' OR nama like '%"+tCari.getText()+"%'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("id_supplier");
                String b = hasil.getString("nama");
                String c = hasil.getString("kota");
                String d = hasil.getString("alamat");
                String e = hasil.getString("no_hp");
                String f = hasil.getString("email");
                
                String[] data={a,b,c,d,e,f};
                tabmode.addRow(data);
            }
        } catch (Exception e) {  
        }
    }//GEN-LAST:event_bCari1ActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtNoHpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoHpKeyTyped
       if (Character.isAlphabetic (evt.getKeyChar())){
            evt.consume();   JOptionPane.showMessageDialog(null, "Masukan Hanya Angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        if ( txtNoHp.getText().length() == 15 ) {
            evt.consume();   JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Lebih Dari 15", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtNoHpKeyTyped

    private void bprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintActionPerformed
       JasperReport reports;
        
        String path = ".\\src\\Report\\LaporanSupplier.jasper";
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
            java.util.logging.Logger.getLogger(Formsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formsupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jtext1;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bCari1;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bSave;
    private javax.swing.JPanel background;
    private javax.swing.JButton bexit;
    private javax.swing.JButton bprint;
    private javax.swing.JButton brefresh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tabelSupplier;
    private javax.swing.JTextField txtNoHp;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidsupplier;
    private javax.swing.JTextField txtkota;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gambar/vapor-removebg-preview.png")).getImage());
    }
}
