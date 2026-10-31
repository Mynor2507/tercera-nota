//Realizar un programa que solicite la carga por teclado de dos números,
//si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división
//del primero respecto al segundo.

package ejerciciosU1;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextDouble();

        if (num1 > num2) {
            System.out.println("La suma es: " + (num1 + num2));
            System.out.println("La diferencia es: " + (num1 - num2));
        } else {
            System.out.println("El producto es: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("La division es: " + (num1 / num2));
            } else {
                System.out.println("No se puede dividir entre cero.");
            }
        }

        teclado.close();
    }
}