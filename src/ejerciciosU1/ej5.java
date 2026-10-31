//Realizar un programa que solicite ingresar
//dos números distintos y muestre por pantalla el mayor de ellos.

package ejerciciosU1;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Los numeros son iguales.");
        }

        teclado.close();
    }
}
