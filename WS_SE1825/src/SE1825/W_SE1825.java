/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE1825;

/**
 *
 * @author ADMIN
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class W_SE1825 {

    public static void main(String[] args) {
        File f = new File("Data_SE1825.txt");
        if (f.exists()) {
            System.out.println("Data_SE1825.txt exists!");
        } else {
            try {
                f.createNewFile();

            } catch (IOException ex) {
                Logger.getLogger(W_SE1825.class.getName()).log(Level.SEVERE, null, ex);

            }
            System.out.println("Data_SE1825 is not found!");
        }

        //write data into a file
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Data_SE1825.txt");
            Scanner sc = new Scanner(System.in);
            //     String $ = "FPT University";
            //     byte [] b = s.getBytes();
            //     try {
            //         fos.write(b);
            //    } catch (IOException ex) {
            //        Logger.getLogger(W_SE1825.class.getName()).log(Level.SEVERE, null, ex);
            //         }

            for (;;) {
                System.out.println("Input line byte to write into a file: ");
                String line = sc.nextLine();
                byte[] b = line.getBytes();

                try {
                    fos.write(b);
                } catch (IOException ex) {
                    Logger.getLogger(W_SE1825.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Continue? (Y/N) : ");
                String choose = sc.nextLine();
                if (choose.equalsIgnoreCase("N")) {
                    break;
                }
            }// end for 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(W_SE1825.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(W_SE1825.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }// end main
}// end class
