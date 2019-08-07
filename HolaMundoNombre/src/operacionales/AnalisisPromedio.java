package operacionales;

import java.util.Scanner;

public class AnalisisPromedio {
public static void main(String[] args)
{
 // crea objeto Scanner para obtener la entrada de la ventana de comandos
 Scanner entrada = new Scanner(System.in);

 // inicialización de las variables en declaraciones
 int aprobados = 0;
 int reprobados = 0;
 int contadorEstudiantes = 1;

 // procesa 10 estudiantes, usando ciclo controlado por contador
 while (contadorEstudiantes <= 10)
 {
 // pide al usuario la entrada y obtiene el valor
 System.out.print("Escriba el resultado (1 = aprobado, 2 = reprobado):");
 int resultado = entrada.nextInt();

 // if...else anidado en la instrucción while
 if (resultado == 1)
aprobados = aprobados + 1;
 else
 reprobados = reprobados + 1;    
}}}
