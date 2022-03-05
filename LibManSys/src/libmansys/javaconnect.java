/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libmansys;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

 
public class javaconnect {
        static Connection conn;
    
    public static Connection connectDb(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        //conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","vayomie1999");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/libraryms","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return conn;
    }
    public static void main(String args[]) {
Login ob=new Login();
ob.setVisible(true);
}
}
