/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import com.sun.corba.se.impl.io.OutputStreamHook;
import java.util.ArrayList;
import java.io.*;
public class PersistenciaUsuario {

//esta es una clase model de tipo logivo, solamente contiende metodos
//que se representan acciones concretas, la sintaxis y la estructura de dicho 
//metodo depende de la accion
ArrayList<Usuario> usuarios;    
public PersistenciaUsuario(){
usuarios=new ArrayList<>();

}
    //primero generamos el metodo que nos guarda un usuario
    public void  guardar(Usuario u) throws Exception{
        //paso1 generar el archivo a guardarse
        File f=new File("archivaldo.raton");
        //indicar que se va a guardar
        FileOutputStream fos=new FileOutputStream(f);
        
        //generar el objeto que nos va a ayudar a guardar el arraylist de usuarios
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //ahora si a  guardar el objeto
                  usuarios.add(u);
                  oos.writeObject(usuarios);
    }
}

