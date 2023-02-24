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
import javax.swing.JOptionPane;
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
public class StokBarang extends javax.swing.JFrame {
    private Connection conn = new connection().clsconnect();
    private DefaultTableModel tabmode;
    
    protected void datatable(){
        Object[] Baris = {"Kode Barang","Nama Barang", "Kategori", "Stock Barang","Harga Barang"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelbarang.setModel(tabmode);
        String sql = "select * from dbbarang";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("kode_barang");
                String b = hasil.getString("nama_barang");
                String c = hasil.getString("kategori");
                String d = hasil.getString("jumlah");
                String e = hasil.getString("harga_barang");
                

                
                String[] data={a,b,c,d,e};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            
        }
    }

    /**
     * Creates new form StokBarang
     */
    public StokBarang() {
        this.setTitle("Stock Barang");
        initComponents();
        datatable();
        setLocationRelativeTo(getRootPane());
        setIconImage();
    }
    
    protected void kosong(){
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
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        brefresh = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        bprint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbarang = new javax.swing.JTable();
        tCari = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(900, 500));

        background.setBackground(new java.awt.Color(51, 0, 102));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STOCK BARANG");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 220, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Created By RyanPrawira");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 130, 20));

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        brefresh.setBackground(new java.awt.Color(51, 0, 102));
        brefresh.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        brefresh.setForeground(new java.awt.Color(255, 255, 255));
        brefresh.setText("REFRESH");
        brefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefreshActionPerformed(evt);
            }
        });
        background.add(brefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 90, 30));

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
        background.add(bexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 110, 30));

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
        background.add(bprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 110, 30));

        tabelbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Stock Barang", "Harga Barang"
            }
        ));
        tabelbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbarang);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 940, 420));

        tCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCariActionPerformed(evt);
            }
        });
        background.add(tCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 440, 30));

        jButton5.setBackground(new java.awt.Color(51, 0, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/searc.png"))); // NOI18N
        jButton5.setText("CARI");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        background.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 90, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pencarian");
        background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1016, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbarangMouseClicked
        int bar = tabelbarang.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();

  

    }//GEN-LAST:event_tabelbarangMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Object[] Baris = {"Kode Barang","Nama Barang", "Kategori", "Stock Barang","Harga Barang"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelbarang.setModel(tabmode);
        String sql = "SELECT * FROM dbbarang WHERE kode_barang like '%"+tCari.getText()+"%' OR nama_barang like '%"+tCari.getText()+"%'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String a = hasil.getString("kode_barang");
                String b = hasil.getString("nama_barang");
                String c = hasil.getString("kategori");
                String d = hasil.getString("jumlah");
                String e = hasil.getString("harga_barang");
                
                String[] data={a,b,c,d,e};
                tabmode.addRow(data);
            }
        } catch (Exception e) {  
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void brefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefreshActionPerformed
        kosong();
        datatable();
    }//GEN-LAST:event_brefreshActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        HalamanMenu menu = new HalamanMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bexitActionPerformed

    private void tCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCariActionPerformed

    private void bprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintActionPerformed
        JasperReport reports;
        
        String path = ".\\src\\Report\\LaporanStockBarang.jasper";
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
            java.util.logging.Logger.getLogger(StokBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton bexit;
    private javax.swing.JButton bprint;
    private javax.swing.JButton brefresh;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tabelbarang;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/gambar/vapor-removebg-preview.png")).getImage());
    }
}
