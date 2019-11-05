/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a12serializacion;

import java.io.*;



/**
 *
 * @author oracle
 */
public class A12Serializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        
        File txt = new File ("/home/oracle/Desktop/texto12.txt");
        
        ObjectOutputStream write = null;
        ObjectInputStream read = null;
        
       
        MClass m1 = new MClass ("ola", -7, 2.7E10);
        
        write = new ObjectOutputStream (new BufferedOutputStream(new FileOutputStream(txt)));
        write.writeObject(m1);
        write.close();
        
        read = new ObjectInputStream (new BufferedInputStream(new FileInputStream (txt)));
        MClass m2 = (MClass)read.readObject();
        System.out.println(m2.toString());
        read.close();
        
        
        
        
        
    }
    
}
