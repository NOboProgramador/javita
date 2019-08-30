
//cómo dibujar rectángulos y óvalos, mediante los métodos drawRect y drawOval
//de Graphics, respectivamente.
package condicionales.FOR;

import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author MR
 */
public class ej1 extends JPanel{

private int opcion; // opción del usuario acerca de cuál figura dibujar
 // el constructor establece la opción del usuario
 public ej1(int opcionUsuario)
 {
opcion = opcionUsuario;
 }
 // dibuja una cascada de figuras, empezando desde la esquina superior izquierda
 public void paintComponent(Graphics g)
 {
 super.paintComponent(g);
 for (int i = 0; i < 10; i++)
 {
 // elige la figura con base en la opción del usuario
switch (opcion)
 {
 case 1: // dibuja rectángulos
 g.drawRect(10 + i * 10, 10 + i * 10,
 50 + i * 10, 50 + i * 10);
 break;
 case 2: // dibuja óvalos
 g.drawOval(10 + i * 10, 10 + i * 10,
 50 + i * 10, 50 + i * 10);
 break;
 }
 } // fin de la clase Figuras
}}