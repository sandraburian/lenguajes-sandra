/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author T-107
 */
public class ProbarGuardado {
    
    public static void main(String[] args) {
        Usuario u=new Usuario("sandra",20,"Sandra@gmail.com");
        PersistenciaUsuario p=new PersistenciaUsuario();
        try{
        p.guardar(u);
    System.out.print("usuario guardado");
    
    }catch(Exception ex){
            System.out.println(ex.getMessage());
    }
              
    }
    
}
