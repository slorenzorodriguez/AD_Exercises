/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos8;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author oracle
 */
public class Arquivos8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        PrintWriter PWS = new PrintWriter ( new BufferedWriter(new FileWriter("Produto.txt")));
        BufferedReader BRS = new BufferedReader(new FileReader("Produto.txt"));
        
        
        
        String [] cod = {"p1","p2","p3"};
        String [] desc = {"parafusos","cravos","tachas"};
        Integer[] prezo = {3,4,5};
        
        PWS.print(cod[0]);
        PWS.print("\t");
        PWS.print(desc[0]);
        PWS.print("\t");
        PWS.print(prezo[0]);
        PWS.print("\t");
        PWS.print(cod[1]);
        PWS.print("\t");
        PWS.print(desc[1]);
        PWS.print("\t");
        PWS.print(prezo[1]);
        PWS.print("\t");
        PWS.print(cod[2]);
        PWS.print("\t");
        PWS.print(desc[2]);
        PWS.print("\t");
        PWS.print(prezo[2]);
        
        PWS.close();
        
        
        String[] texto8 = BRS.readLine().split("\t");
        Product po1 = new Product(texto8[0].toString(), texto8[1].toString(), Integer.parseInt(texto8[2]));
        System.out.println(po1.toString());
        texto8 = BRS.readLine().split("\t");
        Product po2 = new Product(texto8[0].toString(), texto8[1].toString(), Integer.parseInt(texto8[2]));
        texto8 = BRS.readLine().split("\t");
        System.out.println(po2.toString());
        Product po3 = new Product(texto8[0].toString(), texto8[1].toString(), Integer.parseInt(texto8[2]));
        texto8 = BRS.readLine().split("\t");
        System.out.println(po3.toString());
        
        BRS.close();
        
}
}
