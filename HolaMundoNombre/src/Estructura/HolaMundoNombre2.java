package Estructura;

import java.util.Scanner;

public class HolaMundoNombre2 {
    
  public static void main(String[] args) {   
//esta clase permite leer datos por teclado
        Scanner scanner=new Scanner(System.in);
        //mensaje para al usuario
        System.out.println("ingrse su nombre edad y altura: ");
        //leemos el nombre 
        String nom=scanner.next();
        //leemos la edad 
        int edad=scanner.nextInt();
        //leemos la altura
        double altura=scanner.nextDouble();
        //mostramos un mensaje y luego ele valor leido
        System.out.println("Nombre"+nom+"edad"+edad+"altura"+altura);
   }    
}
