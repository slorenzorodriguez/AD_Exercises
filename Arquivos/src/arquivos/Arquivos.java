/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

/**
 *
 * @author oracle
 */
import java.io.File;
import java.io.IOException;
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //EJERCICIO (1:4)
        //Creamos objeto File // Otorgamos la ruta dónde queremos crear el directorio,archivo...
        File directorio = new File("/home/oracle/NetBeansProjects/Arquivos/arquivodir");
        File archivo = new File("/home/oracle/NetBeansProjects/Arquivos/arquivodir/Products1.txt");
        File directorio2 = new File("/home/oracle/NetBeansProjects/Arquivos/arquivodir/subdir");
        File archivo2 = new File ("/home/oracle/NetBeansProjects/Arquivos/arquivodir/subdir/Products2.txt");
        
        
       //Llamamos al objeto instanciado y usamos el metodo .mkdir (crear directorio/archivo...)
       directorio.mkdir();
       archivo.createNewFile();
       directorio2.mkdir();
       archivo2.createNewFile();
       
       
       //Comprobamos que el directorio,archivo... creado se haya creado correctamente. True=existe False=No existe.
       System.out.println("Ejercicio 1-4:\nDirectorio :" + directorio.exists());
       System.out.println("Archivo :" + archivo.exists());
       System.out.println("Directorio 2:" + directorio2.exists());
       System.out.println("Archivo 2:" + archivo2.exists());
       
       //EJERCICIO 5:
        System.out.println("\nEjercicio 5:\nDirectorio: " + directorio.listFiles());
       
       
       //EJERCICIO 6:
       System.out.println("\nEjercicio 6:\nRuta Directorio :" + directorio.getAbsolutePath());
       
       //EJERCICIO 7:
        System.out.println("\nEjercicio 7:\nNombre Archivo: " + archivo.getName());
        System.out.println("Ruta Archivo: " + archivo.getAbsolutePath());
        System.out.println("Posibilidad de lectura Archivo: " + archivo.canRead());
        System.out.println("Posibilidad de escritura Archivo: " + archivo.canWrite());
        System.out.println("Longitud bytes Archivo: " + archivo.length());
        
       //EJERCICIO 8:
        archivo.setReadOnly();
        
       //EJERCICIO 9:
        archivo.setWritable(true);
        
        //EJERCICIO 10:
        archivo.delete();
        
        //EJERCICIO 11:
        directorio.delete();
        directorio2.delete();
        archivo2.delete();
        
        
        
        
        
       
      
               
               }
    
}
