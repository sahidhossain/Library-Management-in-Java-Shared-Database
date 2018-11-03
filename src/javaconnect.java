/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahid
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
    public static Connection ConnecrDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc.sqlite:C:\\Users\\sahid\\Documents\\NetBeansProjects\\Library Management System\\nbproject\\LibraryNew.sqlite");
            return conn;
        }
        catch(Exception e)
        {
            System.out.print("Not found i m hero");
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
