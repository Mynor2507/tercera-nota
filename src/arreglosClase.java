import java.util.Scanner;
public class arreglosClase {
    public static void main(String[] args) {
//arreglos unidimensionales
/*         int[] numeros = {12, 45, 8, 21, 91, 33, 11};
        int mayorNumero = numeros[0];
        int longitudNumeros = numeros.length;
        int posicionMayor = 0;
        int buscado = 91;
        boolean encontrado = false;
        for (int i = 1; i < longitudNumeros; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                break; // Salir del bucle si se encuentra el número buscado
            }
            if (numeros[i] > mayorNumero) {
                mayorNumero = numeros[i];
                posicionMayor = i;
            }
        }
        System.out.println("El mayor es: " + mayorNumero);
        System.out.println("La posición del mayor es: " + posicionMayor);
        if (encontrado) {
            System.out.println("El número buscado fue encontrado.");
        } else {
            System.out.println("El número buscado no fue encontrado.");
        }

// clonar arreglo
        int[] a = {10, 20, 30};
        int[] b = a; // b apunta al mismo arreglo que a
        System.out.println(a[0]); // Imprime 10
        b[0] = 100; // Modifica el primer elemento del arreglo a través de b
        System.out.println(a[0]); // Imprime 100
        int[] b = a.clone(); // b es una copia independiente de a
    }
}
*/


//matrices en arreglos bidimensionales
/*        int[][] matriz = new int[3][3];
        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[0][2] = 30;
        matriz[1][0] = 40;
        matriz[1][1] = 50;
        matriz[1][2] = 60;
        matriz[2][0] = 70;
        matriz[2][1] = 80;
        matriz[2][2] = 90;

        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
*/


//otr forma de hacer matrices en arreglos bidimensionales
/*        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // matriz[0][0] = {10, 20, 30};
        // matriz[1][0] = {40, 50, 60};
        // matriz[2][0] = {70, 80, 90};
        int longitudArreglo = matriz.length;
// for i
         for (int i = 0; i < longitudArreglo; i++) {
                // matriz[0][0] = {10, 20, 30};
                // matriz[1][0] = {40, 50, 60};
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

// for each
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }*/


// con una matriz rectangular
/*        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
        };
// con for i
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }        
// Con for each
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }*/


/*      
*/            
    }
}