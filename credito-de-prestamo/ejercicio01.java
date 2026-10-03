/*Ejercicio 1 – Temperaturas
Crea un programa que registre las temperaturas de 5 días (mañana, tarde y noche → matriz 5x3).

Calcula el promedio de temperatura de cada día y muestra si el día fue caluroso (promedio ≥ 28) o fresco (promedio < 28). */

import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temperaturas = new double[5][3];

        final int NUM_DIAS = temperaturas.length; // Número de días
        final int NUM_HORAS = temperaturas[0].length; // Número de horas por día

        // Registro de temperaturas
        for (int i = 0; i < NUM_DIAS; i++) {
            System.out.println("Ingrese las temperaturas del día " + (i + 1) + ":");
            
            System.out.print("Mañana: ");
            temperaturas[i][0] = scanner.nextDouble();
            
            System.out.print("Tarde: ");
            temperaturas[i][1] = scanner.nextDouble();
            
            System.out.print("Noche: ");
            temperaturas[i][2] = scanner.nextDouble();
            
            System.out.println();
        }

        // Cálculo del promedio y evaluación
        for (int i = 0; i < NUM_DIAS; i++) {
            double suma = 0;
            for (int j = 0; j < NUM_HORAS; j++) {
                suma += temperaturas[i][j];
            }
            double promedio = suma / NUM_HORAS;
            
            System.out.printf("Día %d - Promedio: %.2f - ", (i + 1), promedio);
            
            if (promedio >= 28) {
                System.out.println("Caluroso");
            } else {
                System.out.println("Fresco");
            }
        }

        scanner.close();
    }
}
