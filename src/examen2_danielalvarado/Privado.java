/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielalvarado;

import java.util.ArrayList;

public class Privado extends Chats{
    
    private ArrayList<Mensaje> mensajes = new ArrayList();
    private Usuario receptor;

    public Privado() {
        super();
    }

    public Privado(Usuario receptor) {
        this.receptor = receptor;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Privado: " + "receptor = " + receptor;
    }
    
    
}
