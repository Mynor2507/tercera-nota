import java.util.Scanner;
public class Appcopy {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};
        int sumatotal = 0;
        //int longitudNumeros = numeros.length;
        //for (int i = 0; i < longitudNumeros; i++) {
         //   sumatotal += numeros[i];
        //}
        for (int numero : numeros) {
            sumatotal += numero;
        }
        System.out.println("La suma total es: " + sumatotal);
    }
}
