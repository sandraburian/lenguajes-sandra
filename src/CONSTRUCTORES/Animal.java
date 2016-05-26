/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONSTRUCTORES;

/**
 *
 * @author T-107
 */
public class Animal {
    String nombre;
    String especie;
    String color;
    String tipo_pelaje;
    boolean carnivoro;
    
    public Animal(String nombre){
    nombre=nombre;
    int x=2;
          } 
    public Animal (boolean algo){
        carnivoro=algo;
    }
    public Animal (String va1, String va2, String va3){
        nombre=va1;
       especie=va2;
       color=va3; 
    }
    public Animal (String valor1, String valor2){
        especie=valor1;
        nombre=valor2;
    
    }
    public Animal(){
        nombre="Leon";
}
}   
