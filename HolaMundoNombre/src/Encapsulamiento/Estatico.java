/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author MR
 */
public class Estatico {
private static String frase= "Primera frase";

public static int sumar(int n1,int n2){
  int suma=n1+n2;
  return suma;
}

public static void main(String[] args) {
    System.out.println(Estatico.frase);
    System.out.println("la suma es: "+Estatico.sumar(3, 2));
}}
