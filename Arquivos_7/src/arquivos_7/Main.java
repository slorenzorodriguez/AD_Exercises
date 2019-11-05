/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos_7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;

/**
 *
 * @author oracle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        Product po1 = new Product("cod1","parafusos",3);
        Product po2 = new Product ("cod2","cravos",4);
        
        
        DataOutputStream DOS = new DataOutputStream(new BufferedOutputStream (new FileOutputStream("produtos.txt")));
        DataInputStream DIS = new DataInputStream (new BufferedInputStream(new FileInputStream("produtos.txt")));
        
        
        DOS.writeUTF(po1.getCodigo());
        DOS.writeUTF(po1.getDescricion());
        DOS.writeInt(po1.getPrezo());
        
        DOS.writeUTF(po2.getCodigo());
        DOS.writeUTF(po2.getDescricion());
        DOS.writeInt(po2.getPrezo());
        
        DOS.close();
        
        while (DIS.available()>0){
        Product po3 = new Product();
        po3.setCodigo(DIS.readUTF());
        po3.setDescricion(DIS.readUTF());
        po3.setPrezo(DIS.readInt());
        
        System.out.println(po3.getCodigo() + "  " + po3.getDescricion() + "  " + po3.getPrezo());
        }
       
        
        DIS.close();
        
        
        
        
                
        
    }
    
    
}
