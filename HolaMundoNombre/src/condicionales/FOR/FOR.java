package condicionales.FOR;

import java.util.Scanner;

public class FOR {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int contador;

    System.out.println("digite la cantidad de terminos:");
    contador=entrada.nextInt();
    for(int i=2; i<=contador; i+=2){
    System.out.println(i);  
    
}        
    }
    
}
