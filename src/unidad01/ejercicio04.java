package unidad01;

public class ejercicio04 {
   public static void main(String[] args) {
        int dinero = 1000;
        int retiroSemanal = 200;
        int semanas = 4;

        int totalRetirado = retiroSemanal * semanas;
        int dineroFinal = dinero - totalRetirado;

        System.out.println("Dinero inicial: $" + dinero);
        System.out.println("Total retirado: $" + totalRetirado);
        System.out.println("Dinero al final del mes: $" + dineroFinal);
    }
}    
    

