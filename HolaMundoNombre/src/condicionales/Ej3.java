//Un obrero necesita calcular su salario
//semanal el cual se obtiene  de la siguinte manera:
//si trabajo 40hrs o menos se le paga $16 por hora
//si trabajo mas de 40hrs se le paga $16 por cada uno de las
//primeras 40hrs  $20 por cada hora extra
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author MR
 */
public class Ej3 {
public static void main(String[] args) {
int horastrabajadas;
float salariototal;

horastrabajadas =Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas"));

if(horastrabajadas<=40){
salariototal= horastrabajadas*0.16f;    
}
else
{

    salariototal= (40*16) +((horastrabajadas-40)*20);
    
} 
JOptionPane.showInputDialog(null,"el salrio total es:"+salariototal);
    }
    
}
