
package motorph;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author edsamae      
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            System.out.println(con);
            
            
            // TODO code application logic here
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Connection Established");
        }   
           
 
            
            
        }
    
    
    
    
}
