/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos6;

import java.io.*;

/**
 *
 * @author oracle
 */
public class Arquivos6 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        DataOutputStream DOS = new DataOutputStream(new BufferedOutputStream (new FileOutputStream("text6.txt")));
        DataInputStream DIS = new DataInputStream (new BufferedInputStream (new FileInputStream("text6.txt")));
        
        String s = "Está en casa";
        DOS.writeUTF(s);
        System.out.println("WriteUTF escribiu: " + s );
        
        DOS.writeChars(s);
        System.out.println("WriteChars escribiu: " + s);
        
        DOS.writeUTF(s);
        System.out.println("WriteUTF escribiu: " + s);
        
        DOS.close();
        
        
        
            String aa = DIS.readUTF();
            
            
            String aaa = "";
            while (DIS.available()>15){
                char x = DIS.readChar();
                aaa = aaa + x;
                
            }
            System.out.println("lemos a primeira cadea mediante readUTF: " + aa);
            System.out.println("lemos a segunda cadea mediante readChar: " + aaa);
            System.out.println("lemos a terceira cadea mediante readUTF: " + aa);
            DIS.close();
    }
    
}


    

