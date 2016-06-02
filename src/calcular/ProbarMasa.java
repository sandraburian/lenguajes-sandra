/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

/**
 *
 * @author Sandra Burian
 */
public class ProbarMasa {
    
    public static void main(String[] args) {
        //creamos un objeto con el constructor de defecto de la clase de usuario
        Masa m1=new Masa();
        m1.setPeso(0);
        m1.setAltura(0);
        m1.setMasa(0);

        //creamos un objeto de la clase logica
        OperacionMasa m=new OperacionMasa();
            System.out.println("tu masa corporal es"+ m.calcularMasaCorporal(m1));

       
        }
    
    
    
}
