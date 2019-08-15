package operacionales;
//luis tiene la mitad de lo que posee el guillermo  
//juan tiene la mitad de lo que poseen luis y guillermo juntos


import java.util.Scanner;

public class Ejercisio3 {
public static void main(String[] args) {
Scanner entrada=new  Scanner(System.in);      
float guillermo,luis,juan,total;

System.out.println("Digite la cantidad de dinero que tiene guillermo");
guillermo=entrada.nextFloat();
luis=guillermo/2;
juan=(guillermo+luis)/2;
total=guillermo+luis+juan;
    System.out.println("\nla cantidad de dinero entre los 3 es"+total);


}
    
}
