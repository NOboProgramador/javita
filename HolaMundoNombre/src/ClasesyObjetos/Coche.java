package ClasesyObjetos;

public class Coche {

//atributos
String color;
String marca;
int km;
//metodo
public static void main(String[] args) {
Coche coche1=new Coche();

coche1.color="Blanco";
coche1.marca="Audi";
coche1.km=0;

    System.out.println("El color de coche es"+coche1.color);
    System.out.println("la marca del coche uno es"+coche1.marca);
    System.out.println(""+coche1.km);
    
    Coche coche2=new Coche();

coche2.color="Black";
coche2.marca="mercedes";
coche2.km=174;

    System.out.println("El color de coche es"+coche2.color);
    System.out.println("la marca del coche uno es"+coche2.marca);
    System.out.println(""+coche2.km);
    }
                                                        
    }


