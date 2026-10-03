/*Ejercicio 3 – Calificaciones de un examen
Se aplicó un examen a 6 personas. Guarda sus puntajes (de 0 a 100) en un array.

Muestra:

Cuántos sacaron más de 70 (aprobados)
Cuántos sacaron menos de 70 (reprobados)
El promedio general del grupo */

import java.util.Scanner;
public class ejercicio03 {
    public static void main(String[] args) {
        int[] calificaciones = new int[6]; // Array de calificaciones
        int aprobados = 0;
        int reprobados = 0;
        int suma = 0;
        final int NUM_CALIFICACIONES = calificaciones.length;

        //Pedir calificaciones al usuario
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUM_CALIFICACIONES; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        // Contar aprobados y reprobados y calcular la suma
        for (int calificacion : calificaciones) {
            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
            suma += calificacion;
        }

        // Calcular el promedio
        double promedio = (double) suma / NUM_CALIFICACIONES;

        // Mostrar resultados
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de reprobados: " + reprobados);
        System.out.printf("Promedio general del grupo: %.2f%n", promedio);
    }
}
