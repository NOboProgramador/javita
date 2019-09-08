/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

// encapsulación: Se refiere a la capacidad de agrupar y condensar en un entorno con límites bien-definidos distintos elementos. Cuando hablemos 
//de encapsulación en general siempre nos referiremos, pues, a encapsulación abstracta.
public class Persona {
private final String nombre;
private int edad;

public Persona (String nombre, int edad) {
this.nombre = nombre;
this.edad = edad;
}
public void mostrarDatos(){
System.out.println("El nombre es :"+nombre);
    System.out.println("la edad es: "+edad);    
}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}   

