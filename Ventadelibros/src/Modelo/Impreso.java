/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LENOVO LEGION
 */
public class Impreso extends Libro{
    
    public Impreso(int id,String titulo, String autor, String edicion, double precio) {
        super(id,titulo, autor, edicion, precio);
    
    }
    public void mostrardatos(){
        System.out.println("id : "+getId()+
                           "\nTitulo : "+getTitulo()+
                           "\nAutor: "+getAutor()+
                           "\nedicion : "+getEdicion()+
                           "\nedicion : "+getPrecio() );
    }
    public double calcularpreciofijo(){
        return 0.0;
    }
    public double calcularpreciocomicion(){
        return 0.0;
    }
}
