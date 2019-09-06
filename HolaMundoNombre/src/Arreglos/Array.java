//Los objetos arreglo ocupan espacio en memoria. Al igual que los demás objetos,
//los arreglos se crean con la palabra clave new. Para crear un objeto arreglo, debemos
 //especificar el tipo de cada elemento y el número de elementos que se requieren
//para el arreglo, como parte de una expresión para crear un arreglo que utiliza la palabra clave new.
 //Dicha expresión devuelve una referencia que puede almacenarse en una variable tipo arreglo.
package Arreglos;

/**
 *
 * @author MR
 */
public class Array {
public static void main(String[] args) {
 //Un programa puede crear varios arreglos en una sola declaración.
// La siguiente declaración reserva 100 elementos para b y 27 para x:

//String[] b = new String[100], x = new String[27];       
    
int[] numeros= new int[3]; 
numeros[0]=8;
numeros[1]=11;
numeros[2]=21;

    for (int i = 0; i <3; i++) {
        System.out.println(numeros[i]);    
    }
}
}