/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * main_page.java
 *
 * Created on Nov 9, 2019, 1:08:14 PM
 */

package message;

import message.messager1;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;
import java.util.Date;

/**
 *
 * @author class-12
 */
public class main_page extends javax.swing.JFrame {
int b;
public String u_name;
DefaultListModel dlm = new DefaultListModel();
String[] fri=new String[1000];
    /** Creates new form main_page */
    public main_page() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        logOut = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("search"));
        jPanel9.setMaximumSize(new java.awt.Dimension(394, 124));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jButton7.setText("search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7jButton2ActionPerformed(evt);
            }
        });

        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addGap(11, 11, 11))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("friend list "));

        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList3);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        logOut.setText("log out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        jButton3.setText("view my profile");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logOut))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        try {
            jScrollPane2.setVisible(true);
            DefaultListModel i = new DefaultListModel();
            Class.forName("com.mysql.jdbc.Driver");
            Connection      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
            Statement   s=con.createStatement();
            String n =jTextField2.getText();
            ResultSet r=s.executeQuery("select id from id where (id like\"%"+n+"%\"||id like\"%"+n+"\"||id like\""+n+"%\"|| id =\""+n+"\");");
            while(r.next()){
                String m=r.getString(1);
                i.addElement(m);
            }
            jList2.setModel(i);} catch(Exception e){System.out.println(e);}        // TODO add your handling code here:
}//GEN-LAST:event_jTextField2KeyPressed

    private void jButton7jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7jButton2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton7jButton2ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        String o=(String)jList2.getSelectedValue();
        System.out.println(o);
        try {
            DefaultListModel i = new DefaultListModel();
            Class.forName("com.mysql.jdbc.Driver");
            Connection      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
            Statement   s=con.createStatement();
            ResultSet r=s.executeQuery("select u_name from id where id=\""+o+"\";");
            if(r.next()){o=r.getString(1);}
            profile p=new profile();
            p.u_name=r.getString(1);
            p.my=u_name;
            p.from="friend_list";
            p.setVisible(true);
            this.dispose();
        } catch(Exception e){System.out.println(e);}
        // TODO add your handling code here:
}//GEN-LAST:event_jList2ValueChanged

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        messager1 m =new messager1();
        m.gid=u_name;
        int l=0,n;
        String w=(String)jList3.getSelectedValue();
        n=dlm.indexOf(w);String a=""+w.charAt(0);
        dlm.remove(n);

        System.out.println(n);
        if(a.equals("\u25cf")){
            w=w.substring(1);
        }
        dlm.addElement(w);
        jList3.setModel(dlm);
        m.gid2=fri[n];
        System.out.println(m.gid);
        System.out.println(m.gid2+"ll");
        m.setVisible(true);
        this.dispose();
               // TODO add your handling code here:
}//GEN-LAST:event_jList3MouseClicked

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        try{Class.forName("com.mysql.jdbc.Driver");
        Connection      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
        Statement   s=con.createStatement();
        SimpleDateFormat sim= new SimpleDateFormat("HH:mm:ss");
        String time=sim.format(new Date());
        SimpleDateFormat si= new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(time);
        String date = si.format(new Date());
        System.out.println(date);
        s.executeUpdate("update id set last_active_time=\""+time+"\" where u_name =\""+u_name+"\";");
        s.executeUpdate("update id set status=\"not active\" where u_name =\""+u_name+"\";");
        s.executeUpdate("update id set last_active_date=\""+date+"\" where u_name =\""+u_name+"\";");
        welcome_to_messenger l=new welcome_to_messenger();
        l.setVisible(true);
        this.dispose();
        } catch(Exception e){System.out.println(e);}// TODO add your handling code here:
}//GEN-LAST:event_logOutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        my_profile s=new my_profile();
        s.u_name=u_name;
        s.setVisible(true);
        this.dispose();// TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jScrollPane2.setVisible(false);System.out.println(u_name);
String Status="",lad="",lat="",a="",type;
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
    Statement s=con.createStatement();
    Statement s1=con.createStatement();
    ResultSet r=s.executeQuery("select * from "+u_name+";");int i=0;
    ResultSet r1=null;
    Statement s2=con.createStatement();
    ResultSet r2=null;
    while(r.next()){
        String f_id=r.getString("member_of");
        System.out.println(f_id);
        r1=s1.executeQuery("select * from id where u_name='"+f_id+"';");
        try{
        r2=s2.executeQuery("select "+u_name+" from msg_"+u_name+"_"+f_id+";");
        if(r2.last()){
            type=r2.getString(u_name);
            if(type.equals("unread")){
                a="\u25cf";
            }
        }
        }
        catch(Exception ex){
            System.out.println(ex);
            r2=s2.executeQuery("select "+u_name+" from msg_"+f_id+"_"+u_name+";");
            if(r2.last()){type=r2.getString(u_name);
        if(type.equals("unread")){a="\u25cf";}}
        }
        if(r1.next()){Status=r1.getString("status");}
        if(Status.equals("active")){
            dlm.addElement(a+f_id+" "+Status);
            fri[i]=f_id;
            i++;
        }
        else{
            lat=r1.getString("last_active_time");
            lad=r1.getString("last_active_date");
           dlm.addElement(a+f_id+" last active time:-"+lat+" last active date:-"+lad);
            fri[i]=f_id;
            i++;
        }
        }}
catch(Exception e){System.out.println(e+"kk");}
jList3.setModel(dlm);

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new  main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables

}