/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielalvarado;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario extends Persona implements Serializable{
    
    private String usuario;
    private String password;
    private ArrayList<Solicitud> solicitudes = new ArrayList();
    private ArrayList<Chats> chats = new ArrayList();
    private ArrayList<Usuario> amigos = new ArrayList();
    private int calidadWifi;

    public Usuario() {
        super();
    }

    public Usuario(String usuario, String password, int calidadWifi, String nombre, String apellido, String numTelefono) {
        super(nombre, apellido, numTelefono);
        this.usuario = usuario;
        this.password = password;
        this.calidadWifi = calidadWifi;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList<Chats> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chats> chats) {
        this.chats = chats;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public int getCalidadWifi() {
        return calidadWifi;
    }

    public void setCalidadWifi(int calidadWifi) {
        this.calidadWifi = calidadWifi;
    }

    

    @Override
    public String toString() {
        return "Usuario: " + usuario;
    }

    @Override
    public double enviar(int calidadReceptor) {
        
        return (calidadReceptor*0.6) * (calidadWifi * 0.85);
        
    }
    
    
    
}
