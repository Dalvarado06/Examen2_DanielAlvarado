/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielalvarado;

import java.io.Serializable;

public class Mensaje implements Serializable{
    
    private String contenido;
    private String hora;
    private String fecha;
    private boolean leido;

    public Mensaje() {
    }

    public Mensaje(String contenido, String hora, String fecha, boolean leido) {
        this.contenido = contenido;
        this.hora = hora;
        this.fecha = fecha;
        this.leido = leido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "Mensaje: " + "contenido =" + contenido;
    }
    
    
}
