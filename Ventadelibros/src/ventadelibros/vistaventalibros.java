/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventadelibros;

import Modelo.Cliente;
import Modelo.Compra;
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
        int numero=0;
        int opcion=0;
        String nombre,cedula,direccion;
        double credito;
        Compra c=new Compra();
        Cliente cl=new Cliente();
        Scanner sc=new Scanner(System.in);
       
        do {            
            System.out.println("---------------------menu-------------------");
            System.out.println("1.ingresar clientes ");
            System.out.println("2.ingresar libros ");
            System.out.println("3.Realizar compra ");
            System.out.println("0.salir ");
            System.out.println("selecione opcion");
            numero=sc.nextInt();
            switch(opcion=numero){
                case 1 :
                    
                    System.out.println("ingrese nombre");
                    nombre= sc.next();
                    
                    //Mostrar un salto de línea en Java
                    System.out.println("\n"); 
                    System.out.println("ingrese cedula");
                    cedula= sc.next();
                    //Mostrar un salto de línea en Java
                    System.out.println("\n"); 
                    System.out.println("ingrese direccion");
                    direccion= sc.next();
                    //Mostrar un salto de línea en Java
                    System.out.println("\n"); 
                    System.out.println("imgrese credito");
                    credito= sc.nextDouble();
                    //Mostrar un salto de línea en Java
                    System.out.println("\n"); 
                    cl.agregarclientes(nombre, cedula, direccion, credito);
                    break;
                case 2 : 
                    
                    cl.visualizarclientes();
                    break;
                case 3 :
                    break;
            }
            
        } while (opcion!=0);
        System.out.println( "fin");
    }
    
}
