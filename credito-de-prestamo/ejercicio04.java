/*Ejercicio 4 – Inventario de una bodega
Una bodega tiene 5 estantes y en cada estante hay 4 productos.

Guarda la cantidad de productos en una matriz 5x4.

Calcula cuántos productos hay en total y muestra en qué estante hay más productos. */

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        final int NUM_ESTANTES = 5;// los coloque para evitar numeros magicos, y para que si se quiere cambiar el tamaño de la matriz solo se cambie en un lugar
        final int NUM_PRODUCTOS = 4;// los coloque para evitar numeros magicos, y para que si se quiere cambiar el tamaño de la matriz solo se cambie en un lugar

        int[][] inventario = new int[NUM_ESTANTES][NUM_PRODUCTOS];
        int totalProductos = 0;
        int estanteMayor = 0;
        int maxProductos = 0;

        Scanner scanner = new Scanner(System.in);

        // Pedir cantidad de productos para cada estante
        for (int i = 0; i < NUM_ESTANTES; i++) {
            System.out.println("Estante " + (i + 1));
            for (int j = 0; j < NUM_PRODUCTOS; j++) {
                System.out.print("Ingrese la cantidad de productos en la posición (" + (i + 1) + "," + (j + 1) + "): ");
                inventario[i][j] = scanner.nextInt();
                totalProductos += inventario[i][j];
            }
        }

        // Encontrar el estante con más productos
        for (int i = 0; i < NUM_ESTANTES; i++) {
            int sumaEstante = 0;
            for (int j = 0; j < NUM_PRODUCTOS; j++) {
                sumaEstante += inventario[i][j];
            }
            if (sumaEstante > maxProductos) {
                maxProductos = sumaEstante;
                estanteMayor = i;
            }
        }

        // Mostrar resultados
        System.out.println("Total de productos en la bodega: " + totalProductos);
        System.out.println("El estante con más productos es el Estante " + (estanteMayor + 1) + " con un total de: " + maxProductos);

        scanner.close();
    }
}
