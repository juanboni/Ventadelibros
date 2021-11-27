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
public abstract class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String edicion;
    private double precio;


    public Libro(int id,String titulo, String autor, String edicion, double precio) {
        this.id=id;
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.precio = precio;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    abstract public void mostrardatos();
    abstract public double calcularpreciofijo();
    abstract public double calcularpreciocomicion();
    
}
