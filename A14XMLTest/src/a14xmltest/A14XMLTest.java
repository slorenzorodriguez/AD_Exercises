/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a14xmltest;

import java.io.*;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;






;

/**
 *
 * @author oracle
 */
public class A14XMLTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, XMLStreamException {
        // TODO code application logic here
        File xml = new File ("/home/oracle/Desktop/texto14.xml");
        System.out.println(xml.getAbsolutePath());
        
        try
        {
            XMLStreamWriter xmlSW = XMLOutputFactory.newInstance().createXMLStreamWriter(new FileWriter(xml));
            
            
            xmlSW.writeStartDocument("1.0");
            
            
            //EtiquetaRaizApertura
            //<autores>
            xmlSW.writeStartElement("autores");
            
            //1 <autor codigo="cod">
            xmlSW.writeStartElement("autor");
            xmlSW.writeAttribute("codigo", "a1");
            
                //<nome>
                xmlSW.writeStartElement("nome");
                xmlSW.writeCharacters("Alexandre Dumas");
                //</nome>
                xmlSW.writeEndElement();

                //<titulo>
                xmlSW.writeStartElement("titulo");
                xmlSW.writeCharacters("El conde de montecristo");
                //</titulo>
                xmlSW.writeEndElement();

                //<titulo>
                xmlSW.writeStartElement("titulo");
                xmlSW.writeCharacters("Los miserables");
                //</titulo>
                xmlSW.writeEndElement();
            
            //1 </autor>
            xmlSW.writeEndElement();
            
            //2 </autor codigo="cod">
            xmlSW.writeStartElement("autor");
            xmlSW.writeAttribute("codigo", "a2");
            
                //<nome>
                xmlSW.writeStartElement("nome");
                xmlSW.writeCharacters("Fiodor Dostoyevski");
                //</nome>
                xmlSW.writeEndElement();

                //<titulo>
                xmlSW.writeStartElement("titulo");
                xmlSW.writeCharacters("El idiota");
                //</titulo>
                xmlSW.writeEndElement();  

                //<titulo>
                xmlSW.writeStartElement("titulo");
                xmlSW.writeCharacters("Noches blancas");
                //</titulo>
                xmlSW.writeEndElement();

            //2 </autor>
            xmlSW.writeEndElement();
            
            //EtiquetaRaizCierre
            //</autores>
            xmlSW.writeEndElement();
            xmlSW.close();
            
            
            
            
            
            
        }
        catch (XMLStreamException ex){
        ex.printStackTrace();
        }
        
        
    }
    
}
