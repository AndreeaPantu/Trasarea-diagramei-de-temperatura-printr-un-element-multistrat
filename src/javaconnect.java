/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
   Connection conn=null;
   public static Connection ConnecrDb(){
       try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName="localhost";
            String serverPort="1521";
            String sid="orcl";
            String url="jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
            String username="andree1";
            String password="andree1";
            Connection conn=DriverManager.getConnection(url,username,password);
            return conn;
        }catch (ClassNotFoundException e){
            System.out.println("Could not find database driver" + e.getMessage());
        }catch(SQLException e){
            System.out.println("Could not connect to the database " +e.getMessage());
        }
       
       catch(Exception e){
            e.printStackTrace();
        }
       return null;
   }
}

