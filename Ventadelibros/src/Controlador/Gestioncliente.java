/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Digital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO LEGION
 */
public class Gestioncliente {
    conexionBJD con =new conexionBJD();
    Connection cn=con.conexion();
    public boolean insertcliente(Cliente c){
        try {
            PreparedStatement pps=cn.prepareStatement("INSERT INTO cliente(id,nombre,cedula,direccion,credito) VALUES(?, ?, ?, ?, ?)");
                    pps.setInt(1,c.getId());
                    pps.setString(2, c.getNombre());
                    pps.setString(3, c.getCedula());
                    pps.setString(4, c.getDireccion());
                    pps.setDouble(5, c.getCredito());
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "datos guardados");
                            return true;
                    } catch (SQLException ex) {
            Logger.getLogger(Gestionlibro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
           
        
    }
    public void leercliente(){
       
       PreparedStatement pps=null;
       ResultSet rs=null;
       int  id;
       String nombre,cedula ,direccion;
       double credito;
       try {
           pps=cn.prepareStatement("SELECT * from cliente");
           rs=pps.executeQuery();
           while(rs.next()){
               id=rs.getInt("id");
               nombre=rs.getString("nombre");
               cedula = rs.getString("cedula");
               direccion = rs.getString("direccion");
               credito =rs.getDouble("credito");
              
               System.err.println(id+","+nombre+","+cedula+","+ direccion+","+ credito);
               
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
       
               
     }
}
