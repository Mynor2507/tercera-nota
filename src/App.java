import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        byte[] edades = new byte[5];

        //optimizar for, almacenar el tamaño del arreglo en una variable
        int longitudEdades = edades.length;
        for (int i = 0; i < longitudEdades; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = leer.nextByte();
        }

        for (byte edad : edades) {
            System.out.println(edad);
        }
    }
}
