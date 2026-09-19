package unidad01;
import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = entrada.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("El número mayor es: " + num3);
        }

        entrada.close();
    }
}
