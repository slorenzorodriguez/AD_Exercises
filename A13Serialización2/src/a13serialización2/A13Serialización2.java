/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a13serialización2;

import java.io.*;

/**
 *
 * @author oracle
 */
public class A13Serialización2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] cod = {"p1","p2","p3"};
        String[] desc = {"parafusos","cravos","tachas"};
        Double[] prezo = {3.0, 4.0, 5.0};
        
       try{
           FileOutputStream read = new FileOutputStream("/home/oracle/Desktop/texto13.txt");
           ObjectOutputStream write = new ObjectOutputStream(read);
           
           
           for (int i = 0; i < 3; i++){
               Product obj = new Product(cod[i], desc[i], prezo[i]);
               write.writeObject(obj);
           }
           write.writeObject(null);
          write.close();
          read.close();
          
          FileInputStream read2 = new FileInputStream ("/home/oracle/Desktop/texto13.txt");
          ObjectInputStream write2 = new ObjectInputStream (read2);
          
          Object reading = 0;
          
          while (reading != null) {
              reading = write2.readObject();
              System.out.println(reading);
                      
              
          }
           write2.close();
           read2.close();
       }
       catch(FileNotFoundException ex){
           
       }
        }
        
        
        
        
    }
     

