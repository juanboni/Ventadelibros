/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
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
public class Gestioncompra {
        conexionBJD con =new conexionBJD();
    Connection cn=con.conexion();
    public boolean insertcompradig(Compra c){
        try {
            PreparedStatement pps=cn.prepareStatement("INSERT INTO compra(id,fecha,lib_digitalid,lib_impresoid,clienteid) VALUES(?, ?, ?, ?, ?)");
                    pps.setInt(1,c.getId());
                    pps.setString(2, c.getFecha());
                    pps.setInt(3, c.getLibdigitalid());
                    pps.setString(4, null);
                    pps.setInt(5, c.getClienteid());
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "datos guardados");
                            return true;
                    } catch (SQLException ex) {
            Logger.getLogger(Gestionlibro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
           
        
    }
    public void leercompra(){
       
       PreparedStatement pps=null;
       ResultSet rs=null;
       int  id;
       String fecha;
       int libdigitalid ,libimpresoid,clienteid;
       
       try {
           pps=cn.prepareStatement("SELECT * from compra");
           rs=pps.executeQuery();
           while(rs.next()){
               id=rs.getInt("id");
               fecha=rs.getString("fecha");
               libdigitalid=rs.getInt("lib_digitalid");
               libimpresoid=rs.getInt("lib_impresoid");
               clienteid=rs.getInt("clienteid");
               System.err.println(id+","+fecha+","+libdigitalid+","+ libimpresoid+","+ clienteid);
               
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
    
    
    
    public boolean insertcompraimp(Compra c){
        try {
            PreparedStatement pps=cn.prepareStatement("INSERT INTO compra(id,fecha,lib_digitalid,lib_impresoid,clienteid) VALUES(?, ?, ?, ?, ?)");
                    pps.setInt(1,c.getId());
                    pps.setString(2, c.getFecha());
                    pps.setString(3, null);
                    pps.setInt(4,c.getLibimpredoid() );
                    pps.setInt(5, c.getClienteid());
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "datos guardados");
                            return true;
                    } catch (SQLException ex) {
            Logger.getLogger(Gestionlibro.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
           
        
    }
}
