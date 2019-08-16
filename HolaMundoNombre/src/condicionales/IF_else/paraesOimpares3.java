package condicionales;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MR
 */
public class paraesOimpares3 {
 public static void main( String args[] )
 {
 // crea objeto Scanner para obtener la entrada de la ventana de comandos
 Scanner entrada = new Scanner( System.in );
//declaramos la variables de entrada de la clase.
//int se utiliza para almacenar los valores introducidos por el usuario.
 int numero1; // primer número a comparar
 int numero2; // segundo número a comparar

 System.out.print( "Escriba el primer entero: " ); // indicador
 numero1 = entrada.nextInt(); // lee el primer número del usuario

System.out.print( "Escriba el segundo entero: " ); // indicador
 numero2 = entrada.nextInt(); // lee el segundo número del usuario

 if ( numero1 == numero2 )
 System.out.printf( "%d == %d\n", numero1, numero2 );

 if ( numero1 != numero2 )
System.out.printf( "%d != %d\n", numero1, numero2 );

 if ( numero1 < numero2 )
System.out.printf( "%d < %d\n", numero1, numero2 );

 if ( numero1 > numero2 )
 System.out.printf( "%d > %d\n", numero1, numero2 );

 if ( numero1 <= numero2 )
 System.out.printf( "%d <= %d\n", numero1, numero2 );   

 if ( numero1 >= numero2 )
System.out.printf( "%d >= %d\n", numero1, numero2 );

} // fin del método main
}
