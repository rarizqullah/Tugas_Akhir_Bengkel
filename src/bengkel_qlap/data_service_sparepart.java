/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bengkel_qlap;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class data_service_sparepart extends javax.swing.JFrame {

    PreparedStatement prep;
    Statement state;
    ResultSet rs;

    /**
     * Creates new form menu_data_service_sparepart
     */
    public data_service_sparepart() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbljoin = new javax.swing.JTable();
        tampil = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel8.setText("QLAP MOTOR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 580, 1490, 70));

        jLabel9.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QLAP MOTOR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 200, 30));

        jLabel10.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel10.setText("QLAP MOTOR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1370, 60));

        jLabel11.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data service");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 60));

        tbljoin.setBackground(new java.awt.Color(102, 51, 0));
        tbljoin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbljoin.setForeground(new java.awt.Color(255, 255, 255));
        tbljoin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Service", "keluhan", "Jam Masuk", "Jam Keluar", "ID Customer", "Nama Customer", "Tanggal lahir", "Alamat"
            }
        ));
        jScrollPane2.setViewportView(tbljoin);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1300, 400));

        tampil.setText("Tampilkan");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });
        getContentPane().add(tampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 530, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simone-fischer-FE6zHw24AMg-unsplash_2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorRemoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -80, 1390, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorRemoved

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        new menu_bengkel().show();
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        tabel();

    }//GEN-LAST:event_tampilActionPerformed

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
            java.util.logging.Logger.getLogger(data_service_sparepart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_service_sparepart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_service_sparepart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_service_sparepart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_service_sparepart().setVisible(true);
            }
        });
    }

    public void tabel() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Service");
        tbl.addColumn("keluhan");
        tbl.addColumn("Jam Masuk");
        tbl.addColumn("Jam Keluar");
        tbl.addColumn("ID Customer");
        tbl.addColumn("Nama Customer");
        tbl.addColumn("Tanggal Lahir");
        tbl.addColumn("Alamat");
        
        try {
            state = (Statement) koneksi.getkoneksi().createStatement();
            rs = state.executeQuery("SELECT * from service s join customer c on s.customer_fk = c.id_customer");
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("keluhan"),
                    rs.getString("jm_masuk"),
                    rs.getString("jm_keluar"),
                    rs.getString("id_customer"),
                    rs.getString("nama"),
                    rs.getString("tanggal_lahir"),
                    rs.getString("alamat"),
                });
                tbljoin.setModel(tbl);
            
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "gagal" + e.getMessage());

        }  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembali;
    private javax.swing.JButton tampil;
    private javax.swing.JTable tbljoin;
    // End of variables declaration//GEN-END:variables
}