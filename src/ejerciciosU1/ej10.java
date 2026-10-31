/*
De un operario se conoce su sueldo y los años de antigüedad. Se pide
confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
*/

package ejerciciosU1;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double sueldo, sueldoPagar;
        int antiguedad;

        System.out.print("Ingrese el sueldo del operario: ");
        sueldo = teclado.nextDouble();

        System.out.print("Ingrese los años de antiguedad: ");
        antiguedad = teclado.nextInt();

        if (sueldo < 500 && antiguedad >= 10) {
            sueldoPagar = sueldo * 1.20;
            System.out.println("Aumento del 20%.");
        } else if (sueldo < 500 && antiguedad < 10) {
            sueldoPagar = sueldo * 1.05;
            System.out.println("Aumento del 5%.");
        } else {
            sueldoPagar = sueldo;
            System.out.println("El sueldo permanece sin cambios.");
        }

        System.out.println("Sueldo a pagar: " + sueldoPagar);

        teclado.close();
    }
}
