/*
Problema:generar un sistema que te permita persistir(guardar)entidades de usuario usando solamente JAVA
nota: no usar archivos de texto no word, ni nada de esas cosas raras debes usar tu propia tecnologia



 */
package genericos;

//1.Encapsulamiento:Atributos provados y metodos get y set por cada atributo

import java.io.Serializable;

public class Usuario implements Serializable {
    
    String nombre;
    Integer edad;
    String email;
    
    
    
    
  @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", email=" + email + '}';
    }
    public Usuario() {
    }

  

    public Usuario(String nombre, Integer edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }
    
}
