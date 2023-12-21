package packagename;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnect {
   
    public static void main(String[] args){    
    }
 public static Connection connect(){  
     Connection conn=null;
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         String dbname="your_dbname";
         String username="your_username";
         String password="your_password";
         String port="your_port";
        conn=DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/"+dbname,username,password);
        
        System.out.print(conn);
    }
      
      catch (ClassNotFoundException | SQLException ex){
        Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE,null,ex);
        
    }
   return conn;     
 }      
     

}

