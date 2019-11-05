/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Archivos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FileInputStream imagen = new FileInputStream("/home/oracle/Desktop/egipto.jpg");
        FileOutputStream imagen2 = new FileOutputStream("/home/oracle/Desktop/egito2.jpg", true);
        
        int valor=imagen.read();
        while (valor!=-1){
           imagen2.write(valor);
           valor=imagen.read();  
        }
        imagen.close();
        imagen2.close();   
    }
    
}
