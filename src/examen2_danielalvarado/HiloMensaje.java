/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielalvarado;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class HiloMensaje extends Thread{
    
    private JTextArea mensaje;
    private JProgressBar barra;
    private double time;
    private boolean vive;
    private boolean sigue;

    public HiloMensaje(JTextArea mensaje, JProgressBar barra, boolean vive, boolean sigue) {
        this.mensaje = mensaje;
        this.barra = barra;
        this.vive = vive;
        this.sigue = sigue;
    }

    public JTextArea getMensaje() {
        return mensaje;
    }

    public void setMensaje(JTextArea mensaje) {
        this.mensaje = mensaje;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isSigue() {
        return sigue;
    }

    public void setSigue(boolean sigue) {
        this.sigue = sigue;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
        barra.setMaximum((int)time);
    }
    
    
    
    
    @Override
    public void run(){
        
        while(vive){
            
            if(sigue){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue() == barra.getMaximum()){
                    barra.setValue(0);
                    barra.setMaximum(0);
                    
                    while(vive){
                        JOptionPane.showMessageDialog(null, "Se ha enviado el mensaje");
                        vive = false;
                        sigue = false;
                    }
                }
            }
        }
    }
    
}
