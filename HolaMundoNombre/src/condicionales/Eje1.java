package condicionales;

import javax.swing.JOptionPane;

public class Eje1 {
public static void main(String[] args) {
        
    
    
int numero;
numero =Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));

if (numero%10 ==0){
 JOptionPane.showMessageDialog(null,"el numero"+numero+"es multiplo de 10");
}
else{
   JOptionPane.showMessageDialog(null,"el numero no es multiple de 10"); 
}
        }}
