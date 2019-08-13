package Estructura;

import javax.swing.JOptionPane;

public class IntroJoption {
public static void main(String[] args) {
String cadena;         
int entero;
char letra;
double decimal;

cadena= JOptionPane.showInputDialog("Digite una cadena");
entero= Integer.parseInt( JOptionPane.showInputDialog("Digite un entero"));
letra=  JOptionPane.showInputDialog("Digite un caracter").charAt(0);
decimal =Double.parseDouble(JOptionPane.showInputDialog("Digite un caracter"));

JOptionPane.showInputDialog(null,"la cadena es:"+cadena);
JOptionPane.showInputDialog(null,"el numero entero es:"+entero);    
JOptionPane.showInputDialog(null,"el caracter es:"+letra);
JOptionPane.showInputDialog(null,"el decimal es:"+decimal);

}}
