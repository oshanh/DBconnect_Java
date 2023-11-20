
package codes;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnectsqlite {
    
public static Connection connect(){    
    Connection conn=null;
    
    try {
          Class.forName("org.sqlite.JDBC");
         String dbname="mydb1.db";
          conn=DriverManager.getConnection("jdbc:sqlite:"+dbname);


    } catch (Exception e) {
                            JOptionPane.showInternalMessageDialog(null,e);

            }
    return conn;
}

}
