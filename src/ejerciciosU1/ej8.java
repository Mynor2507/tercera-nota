/*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la 
cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
*/

package ejerciciosU1;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalPreguntas, respuestasCorrectas;
        double porcentaje;

        System.out.print("Ingrese el total de preguntas: ");
        totalPreguntas = teclado.nextInt();

        System.out.print("Ingrese las respuestas correctas: ");
        respuestasCorrectas = teclado.nextInt();

        if (totalPreguntas > 0 &&
            respuestasCorrectas >= 0 &&
            respuestasCorrectas <= totalPreguntas) {

            porcentaje = (respuestasCorrectas * 100.0)
                         / totalPreguntas;

            System.out.println("Porcentaje obtenido: " + porcentaje + "%");

            if (porcentaje >= 90) {
                System.out.println("Nivel maximo.");
            } else if (porcentaje >= 75) {
                System.out.println("Nivel medio.");
            } else if (porcentaje >= 50) {
                System.out.println("Nivel regular.");
            } else {
                System.out.println("Fuera de nivel.");
            }

        } else {
            System.out.println("Error: datos ingresados no validos.");
        }

        teclado.close();
    }
}
