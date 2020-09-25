/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_danielalvarado;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminUsuarios {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo;

    public AdminUsuarios(String ruta) {
        archivo = new File(ruta);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void cargarArchivo() {
        try {
            usuarios = new ArrayList();
            Usuario u;

            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);

                try {
                    while ((u = (Usuario) objeto.readObject()) != null) {
                        usuarios.add(u);
                    }
                } catch (EOFException e) {
                }

                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {

        }
    }
    
   public void escribirArchivo(){
        FileOutputStream fo = null;
        ObjectOutputStream ob = null;
        
        try {
            
            fo = new FileOutputStream(archivo);
            ob = new ObjectOutputStream(fo);
            
            for (Usuario u : usuarios) {
                ob.writeObject(u);
            }
            
            ob.flush();
        } catch (Exception e) {
        }
        
        try {
            ob.close();
            fo.close();
        } catch (Exception e) {
        }
    }

}
