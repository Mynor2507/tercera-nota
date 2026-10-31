//Confeccionar un programa que permita cargar un número entero positivo
//de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
//Mostrar un mensaje de error si el número de cifras es mayor.

package ejerciciosU1;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero positivo: ");
        numero = teclado.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El numero tiene una cifra.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El numero tiene dos cifras.");
        } else if (numero >= 100 && numero <= 999) {
            System.out.println("El numero tiene tres cifras.");
        } else {
            System.out.println("Error: el numero debe tener hasta tres cifras.");
        }

        teclado.close();
    }
}
