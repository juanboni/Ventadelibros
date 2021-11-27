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
    private int id;
    private String fecha;
    private int libdigitalid;
    private int libimpredoid;
    private int clienteid;

    public Compra(int id, String fecha, int libdigitalid, int libimpredoid, int clienteid) {
        this.id = id;
        this.fecha = fecha;
        this.libdigitalid = libdigitalid;
        this.libimpredoid = libimpredoid;
        this.clienteid = clienteid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getLibdigitalid() {
        return libdigitalid;
    }

    public void setLibdigitalid(int libdigitalid) {
        this.libdigitalid = libdigitalid;
    }

    public int getLibimpredoid() {
        return libimpredoid;
    }

    public void setLibimpredoid(int libimpredoid) {
        this.libimpredoid = libimpredoid;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

  
    
} 