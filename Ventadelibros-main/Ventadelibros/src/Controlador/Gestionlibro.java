/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Digital;
import Modelo.Impreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO LEGION
 */
public class Gestionlibro {
    conexionBJD con =new conexionBJD();
    Connection cn=con.conexion();
    int librodigital;
    int libroImpreso;
    int comision1;
    int gastoEnvio;
    public boolean insertdigital(Digital d){
        try {
            PreparedStatement pps=cn.prepareStatement("INSERT INTO lib_digital(id,titulo,autor,edicion,precio) VALUES(?, ?, ?, ?, ?)");
                    pps.setInt(1,d.getId());
                    pps.setString(2, d.getTitulo());
                    pps.setString(3, d.getAutor());
                    pps.setString(4, d.getEdicion());
                    pps.setDouble(5, d.getPrecio());
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "datos guardados");
                            return true;
                    } catch (SQLException ex) {
            Logger.getLogger(Gestionlibro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    public void leerlibdigital(){
       
       PreparedStatement pps=null;
       ResultSet rs=null;
       int  id;
       String titulo,autor ,edicion;
       double precio;
       try {
           pps=cn.prepareStatement("SELECT * from lib_digital");
           rs=pps.executeQuery();
           while(rs.next()){
               id=rs.getInt("id");
               titulo=rs.getString("titulo");
               autor = rs.getString("autor");
               edicion = rs.getString("edicion");
               precio =rs.getDouble("precio");
              
               System.err.println(id+","+titulo+","+autor+","+ edicion+","+ precio);
               
           }
       } catch (Exception ex) {
           System.out.println("Error"+ex.getMessage());
           
       }
       finally{
           try {
               pps.close();
               rs.close();
               
           } catch (Exception ex) {
               
           }
       }
       
       System.out.println ("ingrese el precio del Libro Digital");
       Scanner entradaEscaner = new Scanner (System.in);
       librodigital = entradaEscaner.nextInt (); 
       System.out.println ("El precio del Libro Digital es: $" + librodigital +" dolares");  
       int comision = 4*100;
       int precioLibroDigital = librodigital + comision;
       System.out.println("El precio total del libro Digital es de: $" + precioLibroDigital + " dolares");   
     }  
    
     public boolean insertimpreso(Impreso i){
        try {
            PreparedStatement pps=cn.prepareStatement("INSERT INTO lib_impreso(id,titulo,autor,edicion,precio) VALUES(?, ?, ?, ?, ?)");
                    pps.setInt(1,i.getId());
                    pps.setString(2, i.getTitulo());
                    pps.setString(3, i.getAutor());
                    pps.setString(4, i.getEdicion());
                    pps.setDouble(5, i.getPrecio());
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "datos guardados");
                            return true;
                    } catch (SQLException ex) {
            Logger.getLogger(Gestionlibro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
           
        
    }
    public void leerlibimpreso(){
       
       PreparedStatement pps=null;
       ResultSet rs=null;
       int  id;
       String titulo,autor ,edicion;
       double precio;
       try {
           pps=cn.prepareStatement("SELECT * from lib_impreso");
           rs=pps.executeQuery();
           while(rs.next()){
               id=rs.getInt("id");
               titulo=rs.getString("titulo");
               autor = rs.getString("autor");
               edicion = rs.getString("edicion");
               precio =rs.getDouble("precio");
              
               System.err.println(id+","+titulo+","+autor+","+ edicion+","+ precio);
               
           }
       } catch (Exception ex) {
           System.out.println("Error"+ex.getMessage());
           
       }
       finally{
           try {
               pps.close();
               rs.close();
               
           } catch (Exception ex) {
               
           }
       }
       System.out.println ("ingrese el precio del Libro Impreso");
       Scanner entradaEscaner = new Scanner (System.in);
       libroImpreso = entradaEscaner.nextInt (); 
       System.out.println ("El precio del Libro Impreso es: $" + libroImpreso +" dolares");  
       System.out.println ("ingrese el valor por comision");
       comision1 = entradaEscaner.nextInt (); 
       System.out.println ("ingrese el valor por comision");
       gastoEnvio = entradaEscaner.nextInt (); 
       int precioLibroImpreso = libroImpreso + comision1 + gastoEnvio;
       System.out.println("El precio total del libro Impreso es de: $" + precioLibroImpreso + " dolares");        
     } 
    
}
