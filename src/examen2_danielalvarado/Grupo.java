/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielalvarado;

import java.util.ArrayList;

/**
 *
 * @author dalva
 */
public class Grupo extends Chats{
    
    private String nombre;
    private ArrayList <Usuario> miembros = new ArrayList();
    private Usuario administrador;
    private ArrayList<Mensaje> mensajes = new ArrayList();

    public Grupo() {
        super();
    }
  
    public Grupo(String nombre, Usuario administrador) {
        this.nombre = nombre;
        this.administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Usuario administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Grupo: " + "nombre = " + nombre;
    }
}
    
   
