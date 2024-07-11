
package motorph;

import java.awt.Menu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author edsamae
 */
public class readFile {
    public void readFile(String path, String user, String pass) {
        
        BufferedReader buff = null;
        String line;
        String delimiter = ";";
        try {
            buff = new BufferedReader(new FileReader(path));
            while ((line = buff.readLine()) != null) {
                String[] file = line.split(delimiter);
                // Check if the credentials match
                if (file.length >= 2 && file[0].equals(user) && file[1].equals(pass)) {
                    // If credentials match, show the menu
                  //  new Menu().setVisible(true);
                    // Exit loop if credentials are found
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the BufferedReader in a finally block to ensure it always closes
            try {
                if (buff != null) {
                    buff.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
