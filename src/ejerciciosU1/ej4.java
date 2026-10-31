//Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
//mensaje en pantalla indicando que debe abonar impuestos.

package ejerciciosU1;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double sueldo;

        System.out.print("Ingrese su sueldo en dolares: ");
        sueldo = teclado.nextDouble();

        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos.");
        }

        teclado.close();
    }
}
