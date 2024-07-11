/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package motorph;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author edsamae
 */
public class registration extends javax.swing.JFrame {
    
    String usersFilePath = "C:\\Users\\GOD IS GOOD\\OneDrive\\Documents\\NetBeansProjects\\DBConnect\\users.txt";
    ArrayList<String> all_usernames = new ArrayList<>();
    Map<String, String> usernameANDpassword = new HashMap<>();
    
    private boolean authenticateUser(String username, String password) {
    // Example: Assuming usernameANDpassword is a Map<String, String>
    // Replace with your actual logic to authenticate users
    if (usernameANDpassword.containsKey(username)) {
        String storedPassword = usernameANDpassword.get(username);
        // Replace with your password hashing logic if passwords are hashed
        return password.equals(storedPassword); // Simple comparison for demo
    }
    return false; // Username not found
}
    
    
  
 

    /**
     * Creates new form registration
     */
    public registration() {
        initComponents();
    }
    
  
        private boolean checkIfIdExist(String id) {
          try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
              String line;
                 while ((line = reader.readLine()) != null) {
            // Assuming each line contains the ID as the first element separated by ","
            String[] parts = line.split(",");
            if (parts.length > 0 && parts[0].equals(id)) {
                return true; // ID found
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false; // ID not found
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtpass2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        btnregister = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        showpass = new javax.swing.JCheckBox();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee ID");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");

        txtid.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        txtid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));

        txtpass2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        txtpass2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REGISTER");

        btnreset.setBackground(new java.awt.Color(255, 204, 204));
        btnreset.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        btnreset.setText("RESET");
        btnreset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnregister.setBackground(new java.awt.Color(255, 204, 204));
        btnregister.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        btnregister.setText("REGISTER");
        btnregister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        txtname.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));

        txtpass.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        txtpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));

        showpass.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        showpass.setForeground(new java.awt.Color(255, 255, 255));
        showpass.setText("Show Password");
        showpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(255, 204, 204));
        btnback.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        btnback.setText("Back");
        btnback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid)
                            .addComponent(txtpass2)
                            .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(showpass)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(158, 158, 158))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\GOD IS GOOD\\OneDrive\\Desktop\\motor\\file.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 920, 580));

        setSize(new java.awt.Dimension(936, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
            txtid.setText("");
            txtname.setText("");
            txtpass.setText("");
            txtpass2.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        String id = txtid.getText();
        String name = txtname.getText();
        String pass = txtpass.getText();   
        String pass2 = txtpass2.getText();

            try (FileWriter writer = new FileWriter("users.txt", true);
                 BufferedWriter bw = new BufferedWriter(writer)) {

            if (id.isEmpty() || name.isEmpty() || pass.isEmpty() || pass2.isEmpty()) {
                JOptionPane.showMessageDialog(null,"One or more fields are empty");
                return; 
    }
    
            if (!pass.equals(pass2)) {
              JOptionPane.showConfirmDialog(null, "Passwords Confirmation");
                return; 
    }

            if (checkIfIdExist(id)) {
                System.out.println("This Employee Id Already Exists, Try Another");
                return;  
    }

   
                    writer.write("Employee ID : " + id + System.getProperty("line.separator"));
                    writer.write("Name : " + name + System.getProperty("line.separator"));
                    writer.write("Password : " + pass + System.getProperty("line.separator"));
                    writer.write("Confirm Password : " + pass2 + System.getProperty("line.separator"));
                    writer.write("------" + System.getProperty("line.separator"));
                    writer.close();
    
                    bw.write(id + "," + name + "," + pass + "," + pass2);
                    bw.newLine();

                    JOptionPane.showMessageDialog(null, "Registration Success");
                    setVisible(false);
                    new registration().setVisible(true); 

                } catch (IOException e) {
                    e.printStackTrace(); 
                }


                
                


      
    }//GEN-LAST:event_btnregisterActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
            txtpass.setEchoChar((char)0);
            txtpass2.setEchoChar((char)0);
        }
        else{
            txtpass.setEchoChar('*');
            txtpass2.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       Login lf = new Login();
       this.setVisible(false);
       lf.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed
  
    /**
     * 
     * @param args the command line arguments
     */        
    /**
     * 
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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtpass2;
    // End of variables declaration//GEN-END:variables
}
