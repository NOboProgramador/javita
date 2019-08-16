package condicionales;

import javax.swing.JOptionPane;
//es de tipo de control de bucles.
//Dentro de la iteracion en un bucle, de cualquiera de los tipos 
//(while, do-while, for) el uso de esta sentencia rompe la iteracion de dicho bucle.

public class Swich2 {
public static void main(String[] args) {
int dato;
dato=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));

switch(dato){
    case 1:JOptionPane.showMessageDialog(null,"es el numero 1");
    break;
    case 2:JOptionPane.showMessageDialog(null,"es el numero 2");
    break;
    case 3:JOptionPane.showMessageDialog(null,"es el numero 3");
    break;
    case 4:JOptionPane.showMessageDialog(null,"es el numero 4");
    break;
    case 5:JOptionPane.showMessageDialog(null,"es el numero 5");
    break;
    
    default:JOptionPane.showMessageDialog(null,"el numero no esta en el rango");
    
    
}

    }
    
}
