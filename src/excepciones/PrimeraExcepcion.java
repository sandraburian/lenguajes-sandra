/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-107
 */
public class PrimeraExcepcion {
    public static void main(String[] args) {
        //veremos primero las mas comunes de las unchecked
        float x=4;
        int y=0;
        System.out.println(x/y);
        String falsoNum="5";
        int numReal=5;
        System.out.println("este es antes de la excepcion");
        int suma=Integer.parseInt(falsoNum)+numReal;
        System.out.println("todo esta bien hasta aqui");
        if(true){
            System.out.println("la ejecucuion siempre pasa aqui se ejecute o " + "no el if");
        }
        
    }
}
