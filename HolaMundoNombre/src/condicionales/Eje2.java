package condicionales;

import javax.swing.JOptionPane;

    

public class Eje2 {
public static void main(String[] args) {
char letra;
letra =JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
JOptionPane.showInputDialog(null,"Es una letra mayuscula");

if(Character.isUpperCase(letra)){
 JOptionPane.showInputDialog(null,"Es una mayuscula");
 
}else{
JOptionPane.showInputDialog(null,"es una letra miniuscula");
}
    
    
        }}
