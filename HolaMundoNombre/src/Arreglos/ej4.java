//leer 10 numeros enteros,guardalos en un arreglo
//debemos mostralos en el siguiente orden :
//el primero,el ultimo,el segundo,el penultimo
//el tercero etc.
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author MR
 */
public class ej4 {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int numeros[]=new int[10];
 System.out.println("Guardando los numeros en los arreglo");
    for (int i=0; i<10;i++) {
    System.out.println("Digite un numero :");
        numeros[i]=entrada.nextInt();
    }
    
}}
