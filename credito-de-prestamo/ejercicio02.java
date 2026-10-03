/*Ejercicio 2 – Ventas de una tienda
Una tienda tiene 4 productos y se registran las ventas de 3 meses.

Guarda las ventas en una matriz 4x3.

Calcula el total vendido de cada producto y muestra cuál fue el producto que más vendió. */
import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_PRODUCTOS = 4;// los coloque para evitar numeros magicos, y para que si se quiere cambiar el tamaño de la matriz solo se cambie en un lugar
        final int NUM_MESES = 3;// los coloque para evitar numeros magicos, y para que si se quiere cambiar el tamaño de la matriz solo se cambie en un lugar

        // Matriz para almacenar las ventas de 4 productos durante 3 meses
        double[][] ventas = new double[NUM_PRODUCTOS][NUM_MESES];
        double[] totales = new double[NUM_PRODUCTOS];

        // Registrar las ventas
        for (int i = 0; i < NUM_PRODUCTOS; i++) {
            System.out.println("Producto " + (i + 1));
            
            System.out.print("Ventas mes 1: ");
            ventas[i][0] = scanner.nextDouble();
            
            System.out.print("Ventas mes 2: ");
            ventas[i][1] = scanner.nextDouble();
            
            System.out.print("Ventas mes 3: ");
            ventas[i][2] = scanner.nextDouble();
            
            System.out.println();
        }

        // Calcular total de cada producto
        for (int i = 0; i < NUM_PRODUCTOS; i++) {
            double suma = 0;
            for (int j = 0; j < NUM_MESES; j++) {
                suma += ventas[i][j];
            }
            totales[i] = suma;
        }

        // Mostrar totales
        System.out.println("===== TOTALES POR PRODUCTO =====");
        for (int i = 0; i < NUM_PRODUCTOS; i++) {
            System.out.println("Producto " + (i + 1) + ": " + totales[i]);
        }

        // Encontrar el producto que más vendió
        double mayor = totales[0];
        int productoMayor = 0;

        for (int i = 1; i < 4; i++) {
            if (totales[i] > mayor) {
                mayor = totales[i];
                productoMayor = i;
            }
        }

        System.out.println("El producto que más vendió fue el Producto " + (productoMayor + 1) 
                           + " con un total de: " + mayor);

        scanner.close();
    }
}