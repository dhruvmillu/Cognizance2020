/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.awt.Image;
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class sign_up extends javax.swing.JFrame {
File sm;
    /**
     * Creates new form sign_up
     */
    public sign_up() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });

        jLabel1.setText("type your id");

        jLabel2.setText("type your password");

        jLabel3.setText("re-type your password");

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jLabel4.setText("type your user name");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "profile pic", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton2.setText("upload profile pic");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("about me");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(119, 119, 119)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
            Statement s=con.createStatement();
            String id;
            id=jTextField1.getText();
            int y=id.lastIndexOf("@gmail.com");
                if(y!=-1){}
                else{ y=id.lastIndexOf("@yahoo.co.in");
                    if(y!=-1){}
                    else{y=id.lastIndexOf("@yahoo.com");
                             if(y!=-1){}
                            else{y=id.lastIndexOf("@hotmail.com");
                                    if(y!=-1){}
                                    else{JOptionPane.showMessageDialog(null, "enter a vaild email id", "error", 0);
            jButton1.setEnabled(false);
            jTextField2.setEnabled(false);
            jTextArea1.setEnabled(false);
            jPasswordField2.setEnabled(false);
            jPasswordField1.setEnabled(false);}}}}
            id=id.trim();
            ResultSet r=s.executeQuery("select id from id where id =\""+id+"\";");
            if(r.next()){int a=JOptionPane.showConfirmDialog(null,"id id is already taken.\n do you want to login an id ?" , "error", 2, 0, null);
        if(a==0){login k=new login();
        k.setVisible(true);
        this.dispose();}
            jButton1.setEnabled(false);
            jTextField2.setEnabled(false);
            jTextArea1.setEnabled(false);
            jPasswordField2.setEnabled(false);
            jPasswordField1.setEnabled(false);}
            else if(id.equals("")){JOptionPane.showMessageDialog(null, "id cannot be empty", "error", 0);
                jButton1.setEnabled(false);
            jTextField2.setEnabled(false);
            jTextArea1.setEnabled(false);
            jPasswordField2.setEnabled(false);
            jPasswordField1.setEnabled(false);}
            else{
            jButton1.setEnabled(true);
            jTextField2.setEnabled(true);
            jTextArea1.setEnabled(true);
            jPasswordField2.setEnabled(true);
            jPasswordField1.setEnabled(true);}// TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(sign_up.class.getName()).log(Level.SEVERE, null, ex);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
String pass,re_pass,uname;
pass=new String(jPasswordField1.getPassword());
uname=jTextField2.getText();
re_pass=new String(jPasswordField2.getPassword());
        if(!pass.equals(re_pass)){JOptionPane.showMessageDialog(null, "password not matching re type password", "error", 0);
jButton1.setEnabled(false);}
else if(pass.trim().equals("")){JOptionPane.showMessageDialog(null, "password must only contain A-Z or a-z or 0-9 or @ or . \n not anyother special character or spaces or be empty", "error", 0);
    jButton1.setEnabled(false);}
else{jButton1.setEnabled(true);}    // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String pass,re_pass,uname;
pass=new String(jPasswordField1.getPassword());
uname=jTextField2.getText();
re_pass=new String(jPasswordField2.getPassword());
if(!pass.equals(re_pass)){JOptionPane.showMessageDialog(null, "password not matching re type password", "error", 0);
jButton1.setEnabled(false);}
else if(pass.trim().equals("")){JOptionPane.showMessageDialog(null, "password must only contain A-Z or a-z or 0-9 or @ or . \n not anyother special character or spaces or be empty", "error", 0);
    jButton1.setEnabled(false);}
else{try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
            Statement s=con.createStatement();
            String id=jTextField1.getText();
            pass=new String(jPasswordField1.getPassword());
            s.executeUpdate("insert into id values(\""+id+"\",\""+pass+"\",null,null,null,\""+uname+"\");");
            
            s.executeUpdate("create table "+uname+"(member_of varchar(40),type varchar(30));");
            s.executeUpdate("create table "+uname+"_profile(img blob(100000),about_me blob(100));");
            s.executeUpdate("create table "+uname+"_req(requests varchar(40));");
             PreparedStatement st=con.prepareStatement("insert into "+uname+"_profile values(?,?);");
            FileInputStream r=new FileInputStream(sm);
            st.setBinaryStream(1, (InputStream)r, (int)sm.length());
            String i=jTextArea1.getText();
            st.setString(2, i);
            st.execute();
            login a=new login();
            a.setVisible(true);
            this.dispose();// TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(sign_up.class.getName()).log(Level.SEVERE, null, ex);
        }}         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
     try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
            Statement s=con.createStatement();
            String id;
            id=jTextField2.getText();
            id=id.trim();
            ResultSet r=s.executeQuery("select id from id where u_name =\""+id+"\";");
            if(r.next()){JOptionPane.showMessageDialog(null, "user name is already taken", "error", 0);
            jButton1.setEnabled(false);jPasswordField2.setEnabled(false);
            jPasswordField1.setEnabled(false);}
            else if(id.equals("")){JOptionPane.showMessageDialog(null, "user name cannot be empty", "error", 0);
                jButton1.setEnabled(false);jPasswordField2.setEnabled(false);
            jPasswordField1.setEnabled(false);}
            else{jTextArea1.setEnabled(true);
            jPasswordField2.setEnabled(true);
            jPasswordField1.setEnabled(true);}// TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(sign_up.class.getName()).log(Level.SEVERE, null, ex);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jFileChooser1.showOpenDialog(null);
sm=jFileChooser1.getSelectedFile();
String Path=sm.getAbsolutePath();
ImageIcon a=new ImageIcon(new ImageIcon(Path).getImage().getScaledInstance(100, 98, Image.SCALE_SMOOTH));

jLabel6.setIcon(a);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
String pass,re_pass,uname;
pass=new String(jPasswordField1.getPassword());
uname=jTextField2.getText();
re_pass=new String(jPasswordField2.getPassword());
        if(!pass.equals(re_pass)){JOptionPane.showMessageDialog(null, "password not matching re type password", "error", 0);
jButton1.setEnabled(false);}
else if(pass.trim().equals("")){JOptionPane.showMessageDialog(null, "password must only contain A-Z or a-z or 0-9 or @ or . \n not anyother special character or spaces or be empty", "error", 0);
    jButton1.setEnabled(false);}
else{jButton1.setEnabled(true);}// TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    jButton1.setEnabled(false);    // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
welcome_to_messenger a=new welcome_to_messenger();
a.setVisible(true);
this.dispose();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
