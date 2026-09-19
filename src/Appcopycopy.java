import java.util.Scanner;
public class Appcopycopy {
    public static void main(String[] args) {
//        int[] numeros = {12, 45, 8, 21, 91, 33, 11};
        //int mayorNumero = numeros[0];
//        int longitudNumeros = numeros.length;
//        int posicionMayor = 0;
//        int buscado = 91;
//        boolean encontrado = false;
//        for (int i = 1; i < longitudNumeros; i++) {
//            if (numeros[i] == buscado) {
//                encontrado = true;
//                break; // Salir del bucle si se encuentra el número buscado
//            }
//            //if (numeros[i] > mayorNumero) {
//            //    mayorNumero = numeros[i];
            //    posicionMayor = i;
            //}
//        }
        //System.out.println("El mayor es: " + mayorNumero);
        //System.out.println("La posición del mayor es: " + posicionMayor);
//        if (encontrado) {
//            System.out.println("El número buscado fue encontrado.");
//        } else {
//            System.out.println("El número buscado no fue encontrado.");
//        }
        int[] a = {10, 20, 30};
//        int[] b = a; // b apunta al mismo arreglo que a
        System.out.println(a[0]); // Imprime 10
        //b[0] = 100; // Modifica el primer elemento del arreglo a través de b
        //System.out.println(a[0]); // Imprime 100
        int[] b = a.clone(); // b es una copia independiente de a
    }
}
