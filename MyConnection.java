
package motorph;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



/**
 *
 * @author edsamae
 */
public class MyConnection {
        public static Connection myconnectiondb(){
            try{
                String username = "root";
                String pass = "";
                String sqlconn = "jdbc:mysql://localhost:3306/mysql";
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = (Connection) DriverManager.getConnection(sqlconn,username,pass);
                return conn;
                
        }catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            return null;
    } 
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null, "Connection Established");
        
    }
}
