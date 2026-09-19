package unidad01;

import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = entrada.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media de los tres números es: " + media);

        entrada.close();
    }
}