/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LENOVO LEGION
 */
public class Cliente {
    private String nombre;
    private String cedula;
    private String direccion;
    private double credito;

    public Cliente(String nombre, String cedula, String direccion, double credito) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.credito = credito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    private ArrayList<Cliente> clientes;
    public Cliente(){
        clientes = new ArrayList<>();
    }
    
    public void agregarclientes(String nombre, String cedula,String direccion,double credito){
        Cliente nuevo=new Cliente(nombre, cedula, direccion, credito);
        clientes.add(nuevo);
    }
    public void visualizarclientes(){
        System.out.println("clientes");
        for (int i=0; i<clientes.size();i++) {
            
            System.out.println(clientes.get(i).getNombre()+" , "+clientes.get(i).getCedula()+" , "+clientes.get(i).getDireccion());
        }
    }
    
}
