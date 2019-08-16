package operacionales;

import java.util.Scanner;

public class Ej5 {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
float participacion,primerExamen,segundoExamen,exmenfinal,notafinal;
    System.out.println("digite la nota de participacion");
    participacion   =entrada.nextFloat();
    System.out.println("digite la nota del primer examen parcial");
    primerExamen=entrada.nextFloat();
    System.out.println("digite la nota del segundo parcial");
    segundoExamen=entrada.nextFloat();
    System.out.println("digite la nota del examen final");
    exmenfinal=entrada.nextFloat();
    //sacamos los calculos
participacion *=0.10f;
primerExamen *=0.25f;
segundoExamen *=0.25f;
exmenfinal *=0.40f;
 //sumamos las notas 
notafinal= participacion+primerExamen+segundoExamen+exmenfinal;

//imprimimos pantalla
System.out.println("la nota final es :"+notafinal);

    }
    
}
