//Se ingresa por teclado un valor entero,
//mostrar una leyenda que indique si el número es positivo,
//negativo o nulo (es decir cero)

package ejerciciosU1;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El numero es positivo.");
        } else if (numero < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es nulo (cero).");
        }

        teclado.close();
    }
}
