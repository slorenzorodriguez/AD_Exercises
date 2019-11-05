/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos5;

import java.io.*;

/**
 *
 * @author oracle
 */
public class Arquivos5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        DataOutputStream DOS = new DataOutputStream (new BufferedOutputStream(new FileOutputStream("text4.txt")));
        DataInputStream DIS = new DataInputStream (new BufferedInputStream (new FileInputStream("text4.txt")));
        
        
        String s= "o tempo está xélido";
        
       DOS.writeChars(s);
       int a = DOS.size();
        System.out.println("peso en bytes " + a );
        
        DOS.writeChars(s);
        int b = DOS.size();
        System.out.println("peso en bytes " + b);
        System.out.println("peso total " + (a + b));
        
        DOS.close();
       while(DIS.available() > 0){
           int i=0;
           String aa="";
           for (i=1;i<=s.length();i++){
               char x = DIS.readChar();
               aa=aa+x;
               
           }
           System.out.println(aa);
     
    }
       DIS.close();
    
}
}
