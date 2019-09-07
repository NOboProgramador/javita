package ClasesyObjetos;
//la clase Tiempo1 no declara un constructor, por lo que tiene un constructor predeterminado
//que le suministra el compilador. Cada variable de instancia recibe en forma implícita el valor predeterminado 0
//para un int. Observe que las variables de instancia también pueden inicializarse cuando se declaran en el cuerpo
//de la clase, usando la misma sintaxis de inicialización que la de una variable local.
public class Tiempo1 {
private int hora; // 0 - 23
 private int minuto; // 0 - 59
 private int segundo; // 0 - 59
 // establece un nuevo valor de tiempo, usando la hora universal; asegura que
 // los datos sean consistentes, al establecer los valores inválidos a cero
public void establecerTiempo( int h, int m, int s )
 {
hora = ( ( h >= 0 && h < 24 ) ? h : 0 ); // valida la hora
 minuto = ( ( m >= 0 && m < 60 ) ? m : 0 ); // valida el minuto
 segundo = ( ( s >= 0 && s < 60 ) ? s : 0 ); // valida el segundo
} // fin del método establecerTiempo

 // convierte a objeto String en formato de hora universal (HH:MM:SS)
 public String aStringUniversal()
{
return String.format( "%02d:%02d:%02d", hora, minuto, segundo );
 } // fin del método aStringUniversal
// convierte a objeto String en formato de hora estándar (H:MM:SS AM o PM)
 public String toString()
 {
 return String.format( "%d:%02d:%02d %s",
 ( ( hora == 0 || hora == 12 ) ? 12 : hora % 12 ),
 minuto, segundo, ( hora < 12 ? "AM" : "PM" ) );
 } // fin del método toString
 } // fin de la clase Tiempo1    
