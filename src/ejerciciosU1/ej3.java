//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos
//un número entero)

package ejerciciosU1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entre 1 y 99: ");
        numero = teclado.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println("El numero tiene un digito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El numero tiene dos digitos.");
        } else {
            System.out.println("Error: numero fuera del rango permitido.");
        }

        teclado.close();
    }
}
