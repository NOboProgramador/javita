package condicionales.IF_else;

import java.util.Scanner;
import javax.swing.JOptionPane;
//la sentencia if-else permite al programador especificar una acción a realizar cuando
// la condición es verdadera, y otra distinta cuando la condición es falsa. Por
//ejemplo, la instrucción en seudocódigo:
public class If {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
    
  
int numero, dato=5;
numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
//operador de igualdad (==) e ideferente (!=) 
//operador maoy (>) y operador mayoy igual (>=)
if(numero==dato){
JOptionPane.showMessageDialog(null,"El numero es 5");

}
else
{
 JOptionPane.showInputDialog(null,"El numero es diferente 5");
}    
}}
