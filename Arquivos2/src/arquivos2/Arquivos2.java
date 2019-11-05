/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Arquivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        FileInputStream archivo = new FileInputStream ("/home/oracle/Desktop/texto1.txt");
        FileOutputStream archivo2 = new FileOutputStream ("/home/oracle/Desktop/texto2.txt",true);
        
        int valor=archivo.read();
        while(valor!=-1){
            System.out.println((char)valor);
           archivo2.write(valor);
            valor=archivo.read();
            
        }
        archivo.close();
        archivo2.close();
 
        }
    }
    

