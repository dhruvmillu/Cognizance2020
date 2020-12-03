/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package message;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author class-12
 */
public class message {
public static Connection getConnection(){
    Connection con=null;
        try {Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/messenger?zeroDateTimeBehavior=convertToNull", "root", "root");

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;

}}
