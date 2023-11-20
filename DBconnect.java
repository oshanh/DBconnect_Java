package codes;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.jdbc.Connection;

public class DBconnect {
   
    public static void main(String[] args){    
    }
 public static Connection connect(){  
     Connection conn=null;
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project123","root","");
        
        System.out.print(conn);
    }
      
      catch (ClassNotFoundException | SQLException ex){
        Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE,null,ex);
        
    }
   return conn;     
 }      
     

}

