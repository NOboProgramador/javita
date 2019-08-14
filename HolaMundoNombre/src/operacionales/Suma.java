package operacionales;

import java.util.Scanner;

public class Suma {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
float num1,num2,suma,resta,multi,div,resto;

System.out.println("Digite 2 numeros");
num1=entrada.nextFloat();
num2=entrada.nextFloat();

suma=num1+num2;
resta=num1-num2;
multi=num1*num2;
div=num1+num2;
resto=num1%num2;

    System.out.println("la suma es:"+suma);
    System.out.println("la resta es:"+resta);
    System.out.println("la multiplicacion es :"+multi);
    System.out.println("la division es :"+div);
    System.out.println("el residuo es:"+resto);



}
    
}
