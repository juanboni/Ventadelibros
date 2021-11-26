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
public class Compra {
    private ArrayList<Cliente> clientes;
    public Compra(){
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