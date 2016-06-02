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
public class OperacionMasa {
    
    
    
    public String calcularMasaCorporal(Masa m){
        int MasaCorporal=(m.getPeso()/(m.getAltura() * m.getAltura()));
        return "" + MasaCorporal;
    }
    
    

}
