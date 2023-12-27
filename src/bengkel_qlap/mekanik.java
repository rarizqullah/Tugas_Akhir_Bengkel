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
public class mekanik extends javax.swing.JFrame {

     private void autoNumber() {
    try {
        Connection c = koneksi.getkoneksi();
        Statement st = c.createStatement();
        String sql = "SELECT MAX(id_mekanik) AS max_id FROM mekanik";
        ResultSet rs = st.executeQuery(sql);
        
        String id = "M0000";
        int i = 1;
        
        if (rs.next()) {
            String maxID = rs.getString("max_id");
            if (maxID != null) {
                i = Integer.parseInt(maxID.substring(2)) + 1;
            }
        }
        
        id = String.format("M%04d", i);
        idmekanik.setText(id);
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
    
    
    PreparedStatement prep;
    Statement state;
    ResultSet rs;
    
    public mekanik() {
        initComponents();
        idmekanik.setEnabled(false);
        autoNumber();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        input = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idmekanik = new javax.swing.JTextField();
        nmmekanik = new javax.swing.JTextField();
        spesialis = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Mekanik");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 220, 60));

        jLabel9.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QLAP MOTOR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 180, 30));

        jLabel10.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel10.setText("QLAP MOTOR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 810, 110));

        jLabel8.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel8.setText("QLAP MOTOR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 400, 830, 90));

        jLabel7.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Service");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 120, 50));

        jLabel11.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Spesialis");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, 60));

        input.setText("Input");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 100, -1));

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, -1));

        jLabel14.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ID Mekanik");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 220, 60));

        jLabel12.setFont(new java.awt.Font("Freehand521 BT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mekanik");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 50));

        idmekanik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idmekanikActionPerformed(evt);
            }
        });
        getContentPane().add(idmekanik, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 290, -1));
        getContentPane().add(nmmekanik, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 290, -1));

        spesialis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Menangani Matic", "Menangani Manual", " " }));
        getContentPane().add(spesialis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 290, -1));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 10, 860, 485));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorRemoved

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        new kendaraan().show();
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
    String id = idmekanik.getText();
    String namaMekanik = nmmekanik.getText();
    String spesial = (String)spesialis.getSelectedItem();
        
    

try {
            String sql = "INSERT INTO mekanik VALUES ('" +id+ "','" + namaMekanik
                    + "','" + spesial + "');"; 
            Connection con = (Connection) koneksi.getkoneksi();
            prep = con.prepareStatement(sql);
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
            new menu_bengkel().show();
            this.dispose();
            autoNumber();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_inputActionPerformed

    private void idmekanikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idmekanikActionPerformed
       
    }//GEN-LAST:event_idmekanikActionPerformed

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
            java.util.logging.Logger.getLogger(mekanik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mekanik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mekanik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mekanik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mekanik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idmekanik;
    private javax.swing.JButton input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nmmekanik;
    private javax.swing.JComboBox<String> spesialis;
    // End of variables declaration//GEN-END:variables
}
