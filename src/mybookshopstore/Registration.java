/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybookshopstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
           this.setLocationRelativeTo(null);
    }
 public Connection getConnection(){
 Connection con;
        try {
            con=DriverManager.getConnection("jdbc:msql://localhost/bookshop","root","");
        return con;
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
       return null;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        secondname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jb_ATTENDANTS = new javax.swing.JButton();
        jb_backAdmin = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setText("ENTER ATTENDANT DETAILS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 28, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 605, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FIRST NAME");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 112, 100, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("SECOND NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 165, 115, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("USER NAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 221, 100, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 283, 100, 35));

        firstname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        firstname.setAutoscrolls(false);
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 113, 150, 35));

        secondname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(secondname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 166, 150, 35));

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 222, 150, 35));

        password.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 284, 150, 35));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Mburu\\Documents\\NetBeansProjects\\products\\src\\icons\\add1 (1).png")); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 352, 121, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Mburu\\Documents\\NetBeansProjects\\products\\src\\icons\\remove.png")); // NOI18N
        jButton2.setText("REMOVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 352, -1, -1));

        jb_ATTENDANTS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_ATTENDANTS.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Mburu\\Documents\\NetBeansProjects\\products\\src\\icons\\kontact_contacts.png")); // NOI18N
        jb_ATTENDANTS.setText("ATTENDANTS");
        jb_ATTENDANTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ATTENDANTSActionPerformed(evt);
            }
        });
        jPanel1.add(jb_ATTENDANTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 352, 168, 57));

        jb_backAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_backAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Mburu\\Documents\\NetBeansProjects\\products\\src\\icons\\dynamic_blue_left.png")); // NOI18N
        jb_backAdmin.setText("BACK");
        jb_backAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_backAdminActionPerformed(evt);
            }
        });
        jPanel1.add(jb_backAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 352, -1, 57));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 109, -1, 41));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 162, -1, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection con;
        if(username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No Data To Delete");
        }
        else{
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            String sql="delete from attendants where username=? ";
            PreparedStatement rs=con.prepareStatement(sql);
            rs.setString(1,username.getText());
           rs.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted succefully");
            
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error occured!!!!");
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb_ATTENDANTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ATTENDANTSActionPerformed
       new AttendantsList().setVisible(true);
       dispose();
    }//GEN-LAST:event_jb_ATTENDANTSActionPerformed

    private void jb_backAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backAdminActionPerformed
        new Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jb_backAdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Connection con;
      if(firstname.getText().equals("")
              ||secondname.getText().equals("")
              || username.getText().equals("")
              || password.getText().equals("")){
        JOptionPane.showMessageDialog(null, "No Inputs");
      
      }
      else
      {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            String sql="insert into attendants value(?,?,?,?)";
            PreparedStatement pstm=con.prepareStatement(sql);
            pstm.setString(1,firstname.getText());
             pstm.setString(2,secondname.getText());
              pstm.setString(3,username.getText());
               pstm.setString(4,password.getText());
               pstm.executeUpdate();
               JOptionPane.showMessageDialog(null, "Registered Succesfuly");
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
              
        }
         
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        firstname.setText("");
        secondname.setText("");
        username.setText("");
        password.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con;
        if(username.getText().equals("")){
        JOptionPane.showMessageDialog(null, "No Data To Search ");
        }
        else
        {
        String sql="select firstname,secondname,username from attendants where username=?";
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            PreparedStatement pstm=con.prepareStatement(sql);
            pstm.setString(1, username.getText());
            ResultSet rs=pstm.executeQuery();
            if(rs.next()){
            String sec=rs.getString("secondname");
            secondname.setText(sec);
            String use=rs.getString("firstname");
            firstname.setText(use);
            
           }
            else{
            JOptionPane.showMessageDialog(null, "No such data found");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_ATTENDANTS;
    private javax.swing.JButton jb_backAdmin;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField secondname;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}