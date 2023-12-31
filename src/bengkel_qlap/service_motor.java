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
public class service_motor extends javax.swing.JFrame {

    PreparedStatement prep;
    Statement state;
    ResultSet rs;

    public service_motor() {
        initComponents();
        autoNumber();
        id_service.setEnabled(false);
    }

    private void autoNumber() {
        try {
            Connection c = koneksi.getkoneksi();
            Statement st = c.createStatement();
            String sql = "SELECT MAX(id) AS max_id FROM service";
            ResultSet rs = st.executeQuery(sql);

            String id = "S0000";
            int i = 1;

            if (rs.next()) {
                String maxID = rs.getString("max_id");
                if (maxID != null) {
                    i = Integer.parseInt(maxID.substring(2)) + 1;
                }
            }

            id = String.format("S%04d", i);
            id_service.setText(id);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
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
        jLabel7 = new javax.swing.JLabel();
        jam_keluar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        input_keluh = new javax.swing.JTextField();
        jam_masuk = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Konfirmasi = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        id_service = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        id_customer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel8.setText("QLAP MOTOR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 420, 660, 120));

        jLabel9.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QLAP MOTOR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 180, 30));

        jLabel10.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel10.setText("QLAP MOTOR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -70, 660, 100));

        jLabel7.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("service");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 100, 50));

        jam_keluar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jam_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(jam_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, -1));

        jLabel11.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID Service");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 60));

        jLabel12.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jam masuk");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 60));

        input_keluh.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        input_keluh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_keluhActionPerformed(evt);
            }
        });
        getContentPane().add(input_keluh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 320, 30));

        jam_masuk.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jam_masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam_masukActionPerformed(evt);
            }
        });
        getContentPane().add(jam_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 140, 30));

        jLabel13.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jam keluar");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 60));

        Konfirmasi.setText("konfirmasi");
        Konfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonfirmasiActionPerformed(evt);
            }
        });
        getContentPane().add(Konfirmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 140, -1));

        jButton7.setText("Kembali");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 140, -1));

        jLabel14.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("keluhan");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, 60));

        id_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_serviceActionPerformed(evt);
            }
        });
        getContentPane().add(id_service, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 320, -1));

        next.setText("Selanjutnya");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 140, -1));
        getContentPane().add(id_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 320, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Customer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 30, 690, 485));

        jLabel15.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("keluhan");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorRemoved

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jam_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jam_keluarActionPerformed

    private void input_keluhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_keluhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_keluhActionPerformed

    private void jam_masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam_masukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jam_masukActionPerformed

    private void KonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonfirmasiActionPerformed

    String id = id_service.getText();
    String keluhan = input_keluh.getText();
    String jm_masuk = jam_masuk.getText();
    String jm_keluar = jam_keluar.getText();
    String customer = id_customer.getText();

try {
        
            String sql = "INSERT INTO service VALUES ('" + id + "','" + keluhan
                    + "','" + jm_masuk + "','" + jm_keluar + "','" + customer + "');"; 
            Connection con = (Connection) koneksi.getkoneksi();
            prep = con.prepareStatement(sql);
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
            new kendaraan().show();
            this.dispose();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     
    }//GEN-LAST:event_KonfirmasiActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new menu_bengkel().show();
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void id_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_serviceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_id_serviceActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        new kendaraan().show();
        dispose();
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(service_motor.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(service_motor.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(service_motor.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(service_motor.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new service_motor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Konfirmasi;
    private javax.swing.JTextField id_customer;
    private javax.swing.JTextField id_service;
    private javax.swing.JTextField input_keluh;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jam_keluar;
    private javax.swing.JTextField jam_masuk;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
