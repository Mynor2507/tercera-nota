//Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
//mostrar un mensaje "Promocionado".

package ejerciciosU1;

import java.util.Scanner;

public class ej2 {
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

        if (promedio >= 7) {
            System.out.println("Promocionado");
        }

        teclado.close();
    }
}
