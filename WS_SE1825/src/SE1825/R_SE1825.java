/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE1825;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class R_SE1825 {

    private static boolean c;

    public static void main(String[] args) {
            FileInputStream fis = null;
            try {
                fis = new FileInputStream("Data_SE1825.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(R_SE1825.class.getName()).log(Level.SEVERE, null, ex);
            }
            int code;
            try{
            while ((code = fis.read()) != -1) {
                System.out.println(c);
            }
        } catch (IOException ex) {
            Logger.getLogger(R_SE1825.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

