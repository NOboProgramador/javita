package operacionales;

import java.util.Scanner;

public class Swich {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("ingrese un dia de la semana");
    int v=scanner.nextInt();
    String dia;
    switch(v){
    case 1:
        dia="lunes";
        break;
    case 2:
        dia="martes";
        break;
    case 3:
        dia="mircoles";
        break;
        case 4:
        dia="jueves";
        break;
    case 5:
        dia="viernes";
        break;
        case 6:
        dia="sabado";
        break;
        case 7:
        dia="domingo";
        break;
        default:
       dia="Dia incorrecto..El valor debe ser entre 1y 7";     
    }
    System.out.println(dia);
    }
    
}
