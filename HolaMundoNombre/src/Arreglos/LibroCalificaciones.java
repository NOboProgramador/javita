//Libro de calificaciones que utiliza un arreglo para almacenar las
//calificaciones de una prueba.267
package Arreglos;

/**
 *
 * @author MR
 */
public class LibroCalificaciones {
private String nombreDelCurso; // nombre del curso que representa este LibroCalificaciones
 private int[] calificaciones; // arreglo de calificaciones de estudiantes
 // constructor
 public LibroCalificaciones(String nombreDelCurso, int[] calificaciones)
 {
 this.nombreDelCurso = nombreDelCurso;
this.calificaciones = calificaciones;
 }
 // método para establecer el nombre del curso
 public void establecerNombreDelCurso(String nombreDelCurso)
 {
 this.nombreDelCurso = nombreDelCurso;
 
 }  
 // método para obtener el nombre del curso
 public String obtenerNombreDelCurso()
{
 return nombreDelCurso;
 }
 // realiza varias operaciones sobre los datos
 public void procesarCalificaciones()
 {
// imprime el arreglo calificaciones en pantalla
imprimirCalificaciones();
 // llama al método obtenerPromedio para calcular la calificación promedio
 System.out.printf("%nEl promedio de la clase es %.2f%n", obtenerPromedio());
 // llama a los métodos obtenerMinima y obtenerMaxima
 System.out.printf("La calificacion mas baja es %d%nLa calificacion mas alta es %d%n%n", obtenerMinima(), obtenerMaxima());
 // llama a imprimirGraficoBarras para imprimir el gráfico de distribución de calificaciones
 imprimirGraficoBarras();
 }

    }

