/*
Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
cuántos tienen notas mayores o iguales a 7 y cuántos menores.
*/

package ejerciciosU1;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float[] notas = new float[10];
        final int longitudNotas = notas.length;
        int sumanotasMayores = 0;
        int sumanotasMenores = 0;

        for (int j = 0; j < longitudNotas; j++) {
            System.out.print("ingrese la nota el alumno " + (j + 1) + ":");
            float nota = teclado.nextFloat();
            notas[j] = nota;

            float suma = nota;

            if (suma >= 7 ) {
                sumanotasMayores++;
            } else if (suma >= 0){
                sumanotasMenores++;
            } else {
                System.out.println("dato invalido");
            }
        }    
        
        System.out.print("Los que sacaron en la nota 7 o mas fueron: " + sumanotasMayores);
        System.out.print("Los que sacaron en la nota de 7 para abajo fueron: " + sumanotasMenores);  
    }
}
