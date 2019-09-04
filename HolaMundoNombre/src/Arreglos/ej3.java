//.pag.276
 
package Arreglos;

import java.util.Scanner;

/**
 *
 * @author MR
 */
public class ej3 {
public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
float numeros[]=new float[5];
float sum_positivos=0,sum_neg=0,media_positivos,media_negativos;
int conteo_positivos=0,conteo_neg=0,conteo_ceros=0;

    System.out.println("Guardando los numeros en los arreglo");
    for (int i=0; i<5;i++) {
        System.out.println("Digite un numero :");
        numeros[i]=entrada.nextFloat();
        
        if(numeros[i]==0){
        conteo_ceros++;    
        }
        else if (numeros[i]>0) {
        sum_positivos +=numeros[i];
        conteo_positivos++;
            
        }
        else{
         sum_neg +=numeros[i];
         conteo_ceros++;
            
        }
        //media de los numeros positivos
        if (conteo_positivos==0) {
            System.out.println("No se puede sacar la media de los dipositivos ");
            
        }else{
         media_positivos=sum_positivos/conteo_positivos;
            System.out.println("la media de los numeros positivos es:"+media_positivos);
        }
    
    }
    //media de los numeros negativos
    if(conteo_neg==0){
        System.out.println("No se puede sacar la media de los numeros negativos");
        
    }else{
    media_negativos=sum_neg/conteo_neg;
        System.out.println("la media de los numeros negativos es:"+media_negativos);
    }
    System.out.println("la cantidad de cero es: "+conteo_ceros);
    }
    
}
