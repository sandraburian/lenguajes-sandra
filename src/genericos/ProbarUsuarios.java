/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class ProbarUsuarios {
    public static void main(String[] args){
        //vamos a leer el arraylist a ver que hay 
        //paso 1 creamos un objeto de la clse persistencia usuario
        PersistenciaUsuario p=new PersistenciaUsuario();
        try {
            
      {
        }
          
            ArrayList<Usuario> usuarios= p.buscarTodos();
            int tam= usuarios.size();
            System.out.println("usuarios guardados:"+tam);
            System.out.println(usuarios.get(1).getNombre());
           } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    
                    }
        }
       
    }

