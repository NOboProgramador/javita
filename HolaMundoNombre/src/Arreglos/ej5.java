//leer por el teclado dos tablas de 10 numeros enteros
//mezclaras en una tercera de la forma el 1 de b, el 2 de A
//el 2 de b etc.
package Arreglos;

import java.util.Scanner;

public class ej5 {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int a[],b[],c[];

a=new int [10];//arreglo con 10 elementos
b=new int [10];//arreglo con 10 elementos
c=new int [20];//arreglo con 20 elementos

//pedimos el arreglo a
System.out.println("Digite el primer arreglo");
    for (int i = 0; i < 10; i++) {
        System.out.println((i+1)+"Digite un numero");    
   a[i]=entrada.nextInt();
   
    
    
    }
    System.out.println("Digite el primer arreglo");
    for (int i = 0; i < 10; i++) {
        System.out.println((i+1)+"Digite un numero");    
   b[i]=entrada.nextInt();
}
    //Ahora vamos a mezclar las 2 arreglos en el arreglo
    //vamos a utilizar el iterador para a y b;
    //y el iterado para el arreglo c.
    int j=0;
    for(int i=0;i<10;i++){
        c[j]=a[i];
        j++;
        c[j]=b[i];
        j++;
    }
    System.out.println("\nel tercer arreglo es :"); 
    for (int i = 0; i <20; i++) {
        System.out.println(c[i]+"");    
        }
    System.out.println();
}
}