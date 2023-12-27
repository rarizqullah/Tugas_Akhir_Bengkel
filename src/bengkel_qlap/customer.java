/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bengkel_qlap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class customer extends javax.swing.JFrame {

     PreparedStatement prep;
    Statement state;
    ResultSet rs;
    
    
     private void autoNumber() {
    try {
        Connection c = koneksi.getkoneksi();
        Statement st = c.createStatement();
        String sql = "SELECT MAX(id_customer) AS max_id FROM customer";
        ResultSet rs = st.executeQuery(sql);
        
        String id = "C0000";
        int i = 1;
        
        if (rs.next()) {
            String maxID = rs.getString("max_id");
            if (maxID != null) {
                i = Integer.parseInt(maxID.substring(2)) + 1;
            }
        }
        
        id = String.format("C%04d", i);
        id_customer.setText(id);
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
    public customer() {
      initComponents();
       id_customer.setEnabled(false);
       autoNumber();
      
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tanggallahir = new javax.swing.JTextField();
        alm = new javax.swing.JLabel();
        input = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        id_customer = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel8.setText("QLAP MOTOR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 420, 690, 120));

        jLabel9.setFont(new java.awt.Font("Broadway", 2, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QLAP MOTOR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 280, 30));

        jLabel10.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel10.setText("QLAP MOTOR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -70, 680, 130));

        jLabel7.setFont(new java.awt.Font("Freehand521 BT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 50));

        alamat.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, 30));

        jLabel11.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID Customer");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, 60));

        jLabel12.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tanggal lahir");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 60));

        nama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 320, 30));

        tanggallahir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tanggallahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggallahirActionPerformed(evt);
            }
        });
        getContentPane().add(tanggallahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 140, 30));

        alm.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        alm.setForeground(new java.awt.Color(255, 255, 255));
        alm.setText("Alamat");
        getContentPane().add(alm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 130, 60));

        input.setText("Input");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 140, -1));

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 140, -1));

        jLabel14.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nama");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 60));

        id_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_customerActionPerformed(evt);
            }
        });
        getContentPane().add(id_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 193, 320, 30));

        jLabel16.setFont(new java.awt.Font("Broadway", 2, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("service");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simone-fischer-FE6zHw24AMg-unsplash.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorRemoved(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 690, 485));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorRemoved

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void tanggallahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggallahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggallahirActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed

    String id = id_customer.getText();
    String nm = nama.getText();
    String tgl = tanggallahir.getText();
    String almt= alamat.getText();

try {
            String sql = "INSERT INTO customer VALUES ('" + id+ "','" + nm
                    + "','" + tgl + "','" + almt+ "');"; 
            Connection con = (Connection) koneksi.getkoneksi();
            prep = con.prepareStatement(sql);
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
            new service_motor().show();
            this.dispose();
            autoNumber ();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
      
    }//GEN-LAST:event_inputActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        new menu_bengkel().show();
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void id_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_customerActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_id_customerActionPerformed

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel alm;
    private javax.swing.JTextField id_customer;
    private javax.swing.JButton input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField tanggallahir;
    // End of variables declaration//GEN-END:variables
}
