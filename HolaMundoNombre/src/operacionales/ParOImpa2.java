package operacionales;

import java.util.Scanner;

public class ParOImpa2 {
    public static void main(String[] args) {
     
    Scanner scanner=new Scanner(System.in);
    System.out.println("ingrse un valor");
    int v=scanner.nextInt();
    
    int resto=v%2;
    //utilizamos un if  en un sola linea
    String mssg=(resto==0)?"es par":"es impar";

    //muestra el resultado
        System.out.println(v+""+mssg);
}}