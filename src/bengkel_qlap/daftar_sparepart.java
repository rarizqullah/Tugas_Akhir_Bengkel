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
public class daftar_sparepart extends javax.swing.JFrame {
     private void autoNumber() {
    try {
        Connection c = koneksi.getkoneksi();
        Statement st = c.createStatement();
        String sql = "SELECT MAX(id_sparepart) AS max_id FROM sparepart";
        ResultSet rs = st.executeQuery(sql);
        
        String id = "SP0000";
        int i = 1;
        
        if (rs.next()) {
            String maxID = rs.getString("max_id");
            if (maxID != null) {
                i = Integer.parseInt(maxID.substring(2)) + 1;
            }
        }
        
        id = String.format("SP%04d", i);
        idsparepart.setText(id);
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
     
    PreparedStatement prep;
    Statement state;
    ResultSet rs;
    
    public daftar_sparepart() {
        initComponents();
        autoNumber();
        idsparepart.setEnabled(false);
    }

    public void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id sparepart");
        tbl.addColumn("Nama sparepart");
        tbl.addColumn("harga");
        
        try {
            state = (Statement) koneksi.getkoneksi().createStatement();
            rs = state.executeQuery("SELECT * From sparepart");
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("id_sparepart"),
                    rs.getString("nama_sparepart"),
                    rs.getString("harga"),
                   
                });
                tbl_sparepart.setModel(tbl);

            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal" + e.getMessage());

        }  
    }
    
    public void clear(){
    idsparepart.setText("");
    nmsparepart.setText("");
    hg.setText("");
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
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
        idsparepart = new javax.swing.JTextField();
        hg = new javax.swing.JTextField();
        nmsparepart = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sparepart = new javax.swing.JTable();
        btn_tampilkan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Sparepart");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 220, 60));

        jLabel9.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QLAP MOTOR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 180, 30));

        jLabel10.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel10.setText("QLAP MOTOR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 920, 80));

        jLabel8.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eugene-golovesov-FOcy4IZqL6U-unsplash.jpg"))); // NOI18N
        jLabel8.setText("QLAP MOTOR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 600, 940, 50));

        jLabel7.setFont(new java.awt.Font("Broadway", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Service");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, 50));

        jLabel11.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Harga");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, 60));

        input.setText("Input");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 100, -1));

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 150, -1));

        jLabel14.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ID Sparepart");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, 60));

        jLabel12.setFont(new java.awt.Font("Freehand521 BT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sparepart");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 50));

        idsparepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsparepartActionPerformed(evt);
            }
        });
        getContentPane().add(idsparepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 183, 290, 30));

        hg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hgActionPerformed(evt);
            }
        });
        getContentPane().add(hg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 290, 40));

        nmsparepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmsparepartActionPerformed(evt);
            }
        });
        getContentPane().add(nmsparepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 290, 40));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 100, -1));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 100, -1));

        tbl_sparepart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Sparepart", "Nama Sparepart", "Harga"
            }
        ));
        tbl_sparepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sparepartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sparepart);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 660, 160));

        btn_tampilkan.setText("Tampilkan");
        btn_tampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tampilkanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tampilkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, -1, -1));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 950, 570));

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

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
    String id = idsparepart.getText();
    String namasparepart = nmsparepart.getText();
    String harga = hg.getText();
 
        try {
            String sql = "INSERT INTO sparepart VALUES ('" +id+ "','" + namasparepart
                    + "','" + harga + "');"; 
            Connection con = (Connection) koneksi.getkoneksi();
            prep = con.prepareStatement(sql);
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        autoNumber();
    }//GEN-LAST:event_inputActionPerformed

    private void hgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hgActionPerformed

    private void nmsparepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmsparepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmsparepartActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         try {
            String sql = "UPDATE sparepart SET id_sparepart = '" + idsparepart.getText() 
                    + " ' , nama_sparepart = ' " + nmsparepart.getText() 
                    + "' , harga = '" +hg.getText() 
                    + "' WHERE id_sparepart = '" + idsparepart.getText()+ " ' "; 
               
            Connection con = (Connection) koneksi.getkoneksi();
            prep = con.prepareStatement(sql);
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabel();
        clear();
    }//GEN-LAST:event_updateActionPerformed

    private void tbl_sparepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sparepartMouseClicked
        int baris = tbl_sparepart.rowAtPoint(evt.getPoint());
        String rek = (String) tbl_sparepart.getValueAt(baris, 0);
        idsparepart.setText(rek);
        String nm = (String) tbl_sparepart.getValueAt(baris, 1);
        nmsparepart.setText(nm);
        String sal = (String) tbl_sparepart.getValueAt(baris, 2);
        hg.setText(sal);

    }//GEN-LAST:event_tbl_sparepartMouseClicked

    private void btn_tampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tampilkanActionPerformed
        tabel();
    }//GEN-LAST:event_btn_tampilkanActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try {
            String sql = "DELETE FROM sparepart WHERE id_sparepart ='"+idsparepart.getText()+"'"; 
            Connection con=(Connection) koneksi.getkoneksi();
            PreparedStatement p= con.prepareStatement(sql);
                p.execute();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
                
        } catch (HeadlessException|SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tabel();
        clear();
    }//GEN-LAST:event_DeleteActionPerformed

    private void idsparepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsparepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idsparepartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftar_sparepart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton btn_tampilkan;
    private javax.swing.JTextField hg;
    private javax.swing.JTextField idsparepart;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField nmsparepart;
    private javax.swing.JTable tbl_sparepart;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
