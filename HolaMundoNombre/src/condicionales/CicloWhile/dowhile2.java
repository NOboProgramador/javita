package condicionales.CicloWhile;

import java.util.Scanner;

public class dowhile2 {
public static void main(String[] args) {
   Scanner entrada=new Scanner(System.in);
    int i=10,contador;

       System.out.println("Digite la cantidad de terminos");
       contador=entrada.nextInt();
          do{
              System.out.println(i);     
       i+=3;   
   }while(i<=contador);
   
    }
    
}
