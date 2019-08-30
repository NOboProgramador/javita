//Cabe mencionar que al mostrar varias líneas de texto en un JOptionPane, 
//hay que usar \n para comenzar una nueva línea, en vez de %n. La línea 15
//utiliza el método parseInt de Integer para convertir el objeto String introducido por el usuario en un
//int, y almacena el resultado en la variable opcion. En la línea 18 se crea un objeto Figuras y se pasa la
//opción del usuario al constructor. Las líneas 20 a 25 realizan las operaciones estándar para crear y establecer
//una ventana en este ejemplo práctico (crear un marco, configurarlo para que la aplicación termine cuando
//se cierre, agregar el dibujo al marco, establecer su tamaño y hacerlo visible).

package condicionales.FOR;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MR
 */
public class EjEj1 {
public static void main(String[] args) {
// obtiene la opción del usuario
 String entrada = JOptionPane.showInputDialog(
 "Escriba 1 para dibujar rectangulos\n" +
 "Escriba 2 para dibujar ovalos");        
int opcion = Integer.parseInt(entrada); // convierte entrada en int
 // crea el panel con la entrada del usuario
 ej1 panel = new ej1(opcion);

 JFrame aplicacion = new JFrame(); // crea un nuevo objeto JFrame

 aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 aplicacion.add(panel);
 aplicacion.setSize(300, 300);
 aplicacion.setVisible(true);
 }
 } // fin de la clase PruebaFiguras   


    

