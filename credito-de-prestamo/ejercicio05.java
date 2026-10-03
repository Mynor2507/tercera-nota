/*Ejercicio 5 – Gastos mensuales
Registra los gastos de una persona durante 4 semanas (comida, transporte y diversión → matriz 4x3).

Calcula el total gastado cada semana y muestra si esa semana gastó más de 200 o menos de 200. */

import java.util.Scanner;
public class ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_SEMANAS = 4;// los coloque para evitar numeros magicos, y para que si se quiere cambiar el tamaño de la matriz solo se cambie en un lugar
        final int NUM_CATEGORIAS = 3;// los coloque para evitar numeros magicos, y para que si se quiere cambiar el tamaño de la matriz solo se cambie en un lugar

        // Matriz para almacenar los gastos de 4 semanas durante 3 categorías
        double[][] gastos = new double[NUM_SEMANAS][NUM_CATEGORIAS];
        double[] totales = new double[NUM_SEMANAS];

        // Registrar los gastos
        for (int i = 0; i < NUM_SEMANAS; i++) {
            System.out.println("Semana " + (i + 1));
            
            System.out.print("Gasto en comida: ");
            gastos[i][0] = scanner.nextDouble();
            
            System.out.print("Gasto en transporte: ");
            gastos[i][1] = scanner.nextDouble();
            
            System.out.print("Gasto en diversión: ");
            gastos[i][2] = scanner.nextDouble();
            
            System.out.println();
        }

        // Calcular total de cada semana
        for (int i = 0; i < NUM_SEMANAS; i++) {
            double suma = 0;
            for (int j = 0; j < NUM_CATEGORIAS; j++) {
                suma += gastos[i][j];
            }
            totales[i] = suma;
        }

        // Mostrar totales y evaluar
        System.out.println(">=====> GASTOS POR SEMANA <=====<");
        for (int i = 0; i < NUM_SEMANAS; i++) {
            System.out.println("Semana " + (i + 1) + ": " + totales[i]);
            
            if (totales[i] > 200) {
                System.out.println("  - Gasto alto");
            } else {
                System.out.println("  - Gasto bajo");
            }
        }

        scanner.close();
    }
}

