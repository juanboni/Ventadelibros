/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.*;



/**
 *
 * @author LENOVO LEGION
 */
public class conexionBJD {
    Connection cn;
    Statement st;
    public Connection conexion() {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ventalibros","root","");
            System.err.println("Se hizo la conexion exitosa");
         } catch (Exception e) {
            System.err.println("Error:" +e);
        }return cn;
    }
    Statement createstStatement(){
        throw new UnsupportedOperationException("no soportado");
                
    }
}
