/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bengkel_qlap;

import static bengkel_qlap.Register_fix.hashSHA256;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Register_fix extends javax.swing.JFrame {


    private void autoNumber() {
    try {
        Connection c = koneksi.getkoneksi();
        Statement st = c.createStatement();
        String sql = "SELECT MAX(ID) AS max_id FROM login";
        ResultSet rs = st.executeQuery(sql);
        
        String id = "AD0000";
        int i = 1;
        
        if (rs.next()) {
            String maxID = rs.getString("max_id");
            if (maxID != null) {
                i = Integer.parseInt(maxID.substring(2)) + 1;
            }
        }
        
        id = String.format("AD%04d", i);
        txID.setText(id);
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    
    public Register_fix() {
        initComponents();
         autoNumber();
         txID.setEnabled(false); //embos
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reg = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lakilaki = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        perempuan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputalamat = new javax.swing.JTextField();
        txID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txPassword = new javax.swing.JPasswordField();
        inputtanggal = new javax.swing.JTextField();
        txConPassword = new javax.swing.JPasswordField();
        inputnama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reg.setText("Register");
        Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegActionPerformed(evt);
            }
        });
        getContentPane().add(Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, 39));

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, 39));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jenis kelamin");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        lakilaki.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lakilaki.setForeground(new java.awt.Color(255, 255, 255));
        lakilaki.setText("Laki - Laki");
        lakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakilakiActionPerformed(evt);
            }
        });
        getContentPane().add(lakilaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        perempuan.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        perempuan.setForeground(new java.awt.Color(255, 255, 255));
        perempuan.setText("Perempuan");
        getContentPane().add(perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("alamat");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Con.Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        inputalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputalamatActionPerformed(evt);
            }
        });
        getContentPane().add(inputalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 200, 24));

        txID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDActionPerformed(evt);
            }
        });
        getContentPane().add(txID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 194, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        getContentPane().add(txUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 194, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal lahir");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));
        getContentPane().add(txPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 194, -1));
        getContentPane().add(inputtanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 194, -1));

        txConPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txConPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 194, -1));
        getContentPane().add(inputnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 194, -1));

        jLabel9.setFont(new java.awt.Font("Broadway", 2, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Register");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Register.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(394, 303));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 850, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegActionPerformed
        // TODO add your handling code here:
        String id = txID.getText().toString().trim();
        String username = txUsername.getText().toString().trim();
        String password = txPassword.getText().toString().trim();
        String hashedPassword = hashSHA256(password);
        String conPassword = txConPassword.getText().toString().trim();
        String nama = inputnama.getText().toString().trim();
        String tanggal_lahir = inputtanggal.getText().toString().trim();

        String jk = null;
        if(lakilaki.isSelected()){
            jk="Laki - Laki";
        } if (perempuan.isSelected()){
            jk = "Perempuan";
        }

        String alamat = inputalamat.getText().toString().trim();
        if (!password.equals(conPassword)){
            JOptionPane.showMessageDialog(null, "Password Tidak Sama");
        }else if (password.equals("") || username.equals("")){
            JOptionPane.showMessageDialog(null, "Username atau Password tidak boleh kosong");
        }else{
            try{
                Connection c = koneksi.getkoneksi();
                String sql = "INSERT INTO login VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id);
                p.setString(2, username);
                p.setString(3, hashedPassword);
                p.setString(4, nama);
                p.setString(5, tanggal_lahir);
                p.setString(6, jk);
                p.setString(7, alamat);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Berhasil membuat akun");
                 autoNumber();
            }catch(SQLException e){
                System.out.println("Error");
            }finally{
                this.dispose();
                Login_fix a = new Login_fix();
                a.setVisible(true);
            }
            
        }
    }//GEN-LAST:event_RegActionPerformed
        public static String hashSHA256(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
      }
    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login_fix a = new Login_fix();
        a.setVisible(true);
    }//GEN-LAST:event_batalActionPerformed

    private void lakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakilakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakilakiActionPerformed

    private void inputalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputalamatActionPerformed

    private void txIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDActionPerformed
      
    }//GEN-LAST:event_txIDActionPerformed

    private void txConPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txConPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txConPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Register_fix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_fix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_fix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_fix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_fix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reg;
    private javax.swing.JButton batal;
    private javax.swing.JTextField inputalamat;
    private javax.swing.JTextField inputnama;
    private javax.swing.JTextField inputtanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton lakilaki;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JPasswordField txConPassword;
    private javax.swing.JTextField txID;
    private javax.swing.JPasswordField txPassword;
    private javax.swing.JTextField txUsername;
    // End of variables declaration//GEN-END:variables
}
