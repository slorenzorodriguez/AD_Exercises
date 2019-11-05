/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a11aleatorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author oracle
 */
public class A11Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String[] cod = {"p1","p2","p3"};
        String[] desc = {"parafusos", "cravos", "tachas"};
        Integer[] prezo = {3,4,5};
        
        RandomAccessFile raf = null;
        Product p1 = new Product();
        
        File txt = new File ("/home/oracle/Desktop/texto11.txt");
        
        
        try{
            raf = new RandomAccessFile(txt, "rw");
            for (int i=0; i<3; i++){
                raf.writeChars(String.format("%" + 3 + "s", cod[i]));
                raf.writeChars(String.format("%" + 10 + "s", cod[i]));
                raf.writeInt(prezo[i]);
                
            }
            raf.close();
        }
        catch (FileNotFoundException ex){
            Logger.getLogger(A11Aleatorio.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        try {
            raf = new RandomAccessFile(txt,"rw");
            
            String codigo = "";
            String descripcion = "";
            
            raf.seek(60);
            for (int i = 0; i < 3; i++) {
               codigo = codigo + raf.readChar();                
            }
            for (int i = 0; i < 10; i++) {
               descripcion = descripcion + raf.readChar();                
            }
            int precio = raf.readInt();
            
            p1.setCodigo(codigo.trim());
            p1.setDescricion(descripcion.trim());
            p1.setPrezo(precio);
            
            raf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(A11Aleatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(p1.toString());
    }
}
