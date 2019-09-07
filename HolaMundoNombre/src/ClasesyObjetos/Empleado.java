package ClasesyObjetos;
// Clase Empleado con referencias a otros objetos.
//tiene las variables de instancia primerNombre, apellidoPaterno, fechaNacimiento
//y fechaContratacion. Los miembros fechaNacimiento y fechaContratacion son referencias a objetos Fecha.

//Empleado, respectivamente. Observe que cuando se hace una llamada al método toString
//de la clase Empleado, éste devuelve un objeto String que contiene las representaciones String de los dos objetos
//Fecha. Cada uno de estos objetos String se obtiene mediante una llamada implícita al método toString de la clase Fecha.
public class Empleado {
 private String primerNombre;
 private String apellidoPaterno;
private Fecha fechaNacimiento;
 private Fecha fechaContratacion;
 // constructor para inicializar nombre, fecha de nacimiento y fecha de contratación
 public Empleado( String nombre, String apellido, Fecha fechaDeNacimiento,   
Fecha fechaDeContratacion )
 {
 primerNombre = nombre;
 apellidoPaterno = apellido;
 fechaNacimiento = fechaDeNacimiento;
 fechaContratacion = fechaDeContratacion;
 } // fin del constructor de Empleado
 // convierte Empleado a formato String
 public String toString()
{
 return String.format( "%s, %s Contratado: %s Cumpleanios: %s",
apellidoPaterno, primerNombre, fechaContratacion, fechaNacimiento );
 } // fin del método toString
} // fin de la clase Empleado}
