/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventadelibros;

import Controlador.*;
import Modelo.Cliente;
import Modelo.Compra;
import Modelo.Digital;
import Modelo.Impreso;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class vistaventalibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("libros Digitales");
        Digital d=new Digital(0,"las aves", "janeth", "lns", 12.40);
        Gestionlibro gl=new Gestionlibro();
        //gl.insertdigital(d);
        //gl.leerlibdigital();
        
        
        System.out.println("libros impresos");
        Impreso i=new Impreso(0, "programacion1","YYJ", "LNS", 11.12);
        //gl.insertimpreso(i);
        gl.leerlibimpreso();
        
        //Impreso i=new Impreso(1,"las avesmamiferas", "janeth", "lns", 12.40);
       // i.mostrardatos();
        //Cliente c=new Cliente(1,"juan", "1231234134","azogues", 123.0);
        //System.out.println(c.getId()+","+c.getNombre()+","+c.getCedula()+","+c.getDireccion()+","+c.getCredito());
        
        //Compra cm=new Compra(1, "sdasd", 1, 1);
        //System.out.print(cm.getId()+","+cm.getFecha()+","+cm.getLibroid()+","+cm.getClienteid());
        Cliente c=new Cliente(0, "janneth", "0302882725", "azogues", 12.55);
        Gestioncliente gc=new Gestioncliente();
        //gc.insertcliente(c);
        gc.leercliente();
        //se genera el ticket
        
        //insertamos compra
        String fechaHora;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            java.util.Date date = cal.getTime();
         fechaHora = dateFormat.format(date);
        Compra cmd=new Compra(0, fechaHora, 1, 0, 1);
        
        Gestioncompra gcm=new Gestioncompra();
        //gcm.insertcompradig(cmd);
        
        
        Compra cmi=new Compra(0, fechaHora, 0,1 , 2);
        gcm.insertcompraimp(cmi);
        gcm.leercompra();
    }
    
}
