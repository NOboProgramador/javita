/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructura;

import java.util.Scanner;

/**
 *
 * @author MR
 */
public class HolaMundoNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //esta clase permite leer datos por teclado
        Scanner scanner=new Scanner(System.in);
        //mensaje para al usuario
        System.out.println("ingrse su nombre: ");
        //leemos un valor entero por teclado
        String nom=scanner.nextLine();
        //mostramos un mensaje y luego ele valor leido
        System.out.println("Bienvenido a java"+nom);
   }
    
}
