/*
Confeccionar un programa que pida por teclado tres notas de un alumno,
calcule el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado".
*/

package ejerciciosU1;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la primera nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = teclado.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio es: " + promedio);

        if (promedio >= 7) {
            System.out.println("Promocionado.");
        } else if (promedio >= 4) {
            System.out.println("Regular.");
        } else {
            System.out.println("Reprobado.");
        }

        teclado.close();
    }
}
