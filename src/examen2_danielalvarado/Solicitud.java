/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielalvarado;

public class Solicitud {
    
    private String solicitud;
    private Usuario usuario;

    public Solicitud() {
    }

    public Solicitud(String solicitud, Usuario u) {
        this.solicitud = solicitud;
        this.usuario = u;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Solicitud: "+ solicitud;
    }
    
    
}
