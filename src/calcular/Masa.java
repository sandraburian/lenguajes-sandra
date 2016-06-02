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
public class Masa {
      int Altura;
     int Peso;
     int Masa;
    

    /**
     * @return the Altura
     */
    public int getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    /**
     * @return the Peso
     */
    public int getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    /**
     * @return the Masa
     */
    public int getMasa() {
        return Masa;
    }

    /**
     * @param Masa the Masa to set
     */
    public void setMasa(int Masa) {
               
         if(Masa<17){
            Masa=0;
                 System.out.println
        ("tu masa corporal esta por debajo del nivel");
          }
         if (Masa>34){
        System.out.println
        ("tu masa corporal esta por ensima del nivel");
        this.Masa = Masa;
    }

    }

    
    }
    
    
    
    
     

    
    
    

