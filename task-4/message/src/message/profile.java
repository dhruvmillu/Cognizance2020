/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * profile.java
 *
 * Created on Aug 11, 2019, 2:42:45 PM
 */

package message;

import java.awt.Image;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author class-12
 */
public class profile extends javax.swing.JFrame {
String u_name,my,from,k;
    /** Creates new form profile */
    public profile() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "about me ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("friends"));

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("mutual friend"));

        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "profile picture", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("send friend reqest");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addGap(114, 114, 114)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
String o=(String)jList1.getSelectedValue();
try {

   DefaultListModel i = new DefaultListModel();
    Class.forName("com.mysql.jdbc.Driver");
   Connection      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
      Statement   s=con.createStatement();
     ResultSet r=s.executeQuery("select u_name from id where =\""+o+"\";");
if(r.next()){o=r.getString(1);}
     profile p=new profile();
p.u_name=o;
p.my=my;
p.setVisible(true);
this.dispose();
}
catch(Exception e){System.out.println(e);}
        // TODO add your handling code here:
}//GEN-LAST:event_jList1ValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(from.equals("profile")){     my_profile a=new my_profile();
             a.u_name=my;
     a.setVisible(true);
     this.dispose();}
else if(from.equals("request")){request a=new request();
a.u_name=my;
     a.setVisible(true);
     this.dispose();}
else if(from.equals("friend_list")){main_page a=new main_page();
a.u_name=my;
     a.setVisible(true);
     this.dispose();}// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try {
        Class.forName("com.mysql.jdbc.Driver");System.out.println("23454 "+u_name);System.out.println("23454 "+my);System.out.println("23454 "+from);
   Connection      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
      Statement   s=con.createStatement();
      Statement   s1=con.createStatement();
      ResultSet r=s.executeQuery("select * from "+u_name+";");
       
      DefaultListModel l= new DefaultListModel();
      DefaultListModel m= new DefaultListModel();
      String friend,type;
      while(r.next()){
          friend=r.getString("member_of");
          if(friend.equals(my)){jButton2.setText("un friend");
              k="i";}
    type=r.getString("type");
    if(type.equals("person")){
    l.addElement(friend);
        jList1.setModel(l);}
      }
       r=s.executeQuery("select * from "+u_name+"_profile;");
            byte[] im;
String about;
           if(r.next()){
               im=r.getBytes(1);
               about=r.getString(2);
            ImageIcon image = new ImageIcon(new ImageIcon(im).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH));
            jLabel1.setIcon(image);jTextArea1.append(about);
           }
r=s.executeQuery("select * from "+u_name+"_req where requests=\""+my+"\";");
if(r.next()){jButton2.setText("cancel friend request");

}ResultSet r1=s.executeQuery("select * from "+my+";");
   while(r1.next()){
       friend=r1.getString("member_of");
       for(int i=0;i<l.getSize();i++){
           if(friend.equals((String)l.elementAt(i))){
               m.addElement(friend);
               jList2.setModel(m);
           }
       }
   }
      
    } catch (Exception ex) {
        System.out.println(ex+"234");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
String o=(String)jList2.getSelectedValue();
try {

   DefaultListModel i = new DefaultListModel();
    Class.forName("com.mysql.jdbc.Driver");
   Connection      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");
      Statement   s=con.createStatement();
     ResultSet r=s.executeQuery("select u_name from id where id=\""+o+"\";");
if(r.next()){o=r.getString(1);}
     profile p=new profile();
p.u_name=o;
p.my=my;
p.from=from;
p.setVisible(true);
this.dispose();
}
catch(Exception e){System.out.println(e);}        // TODO add your handling code here:
    }//GEN-LAST:event_jList2ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{Connection con=message.getConnection();
    Statement s=con.createStatement();
    String c=jButton2.getText();
    if(c.equals("un friend")){String Query="delete from "+u_name+" where member_of=\""+my+"\";";
    jButton2.setText("send friend request");
    s.executeUpdate(Query);
    Query="delete from "+my+" where member_of=\""+u_name+"\";";
    jButton2.setText("send friend request");
    s.executeUpdate(Query);
    try{ String q="drop table msg_"+u_name+"_"+my+";";
       s.executeUpdate(q);}
   catch(Exception e){
       String q="drop table msg_"+my+"_"+u_name+";";
       s.executeUpdate(q);}}
    else if(c.equals("cancel friend request")){
    String Query="delete from "+u_name+"_req where requests=\""+my+"\";";
    jButton2.setText("send friend request");
    s.executeUpdate(Query);
    Query="delete from "+my+" where member_of=\""+u_name+"\";";s.executeUpdate(Query);

    }
    else{
    String Query="insert into "+u_name+"_req values(\""+my+"\");";
    System.out.println(Query);
    jButton2.setText("cancel friend request");
    s.executeUpdate(Query);
    Query="insert into "+my+" values(\""+u_name+"\",'requested');";
    s.executeUpdate(Query);}

        }
    catch(Exception e){System.out.print(e);}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}