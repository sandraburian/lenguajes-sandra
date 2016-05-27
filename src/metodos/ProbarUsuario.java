/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author T-107
 */
public class ProbarUsuario {
    public static void main(String[] args) {
        //creamos un objeto con el constructor de defecto de la clase de usuario
        Usuario u1=new Usuario();
        u1.setEdad(19);
        
            System.out.println("tu edad es"+ u1.getEdad());
       
        }
    }

