/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MR
 */
public class Array2 {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
int nelementos;
nelementos= Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de numeros"));
char[] letras= new char[nelementos];
    System.out.println("Digite los elementos del arreglo");
    for(int i=0; i<nelementos; i++){
        System.out.println((i+1)+"digite un caracter: ");    
   letras[i] =entrada.next().charAt(0);
    
    }
    System.out.println("\nlos caracteres del arreglo son:");
    for (int i = 0; i <nelementos; i++) {
        System.out.println(letras[i]+" ");    
    }

    }
    
}
