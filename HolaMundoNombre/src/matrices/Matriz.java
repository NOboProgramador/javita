// es un arreglo bidimensional que está formada por filas y por columnas 
//que se utiliza para almacenar datos y/o información en cada campo que la compone. 
//En esta entrada aprenderemos como funciona y como utilizarla.
package matrices;

/**
 *
 * @author MR
 */
public class Matriz {
public static void main(String[] args) {
int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};        
 for (int i = 0; i <3; i++) {//numero de filas
 for (int j = 0; j <3; j++){//numero de columnas
     System.out.println(matriz[i][j]);           
            
        }
     System.out.println("");   
    }
    

}
    
}
