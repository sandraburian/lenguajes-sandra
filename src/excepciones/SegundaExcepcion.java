/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *aqui usaremos las excepciones de tipo checked, en los que
 * tu te tienes que hacer cargo de ellas. Vamos a usar un paquete que no se 
 * encuentra por defecto, tienes que agregarlo con un import
 * @author T-107
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SegundaExcepcion {
    public static void main(String[] args) {
        File f=new File("E:/java2/sandra");
        try {
            FileInputStream fis=new FileInputStream(f);
            //comete la excepcion
        } catch (FileNotFoundException ex) {
          
        }
    }
    
}
