package unidad01;

public class ejercicio03 {
    public static void main(String[] args) {
        
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        double descuentoPromocion = 0.15;
        double descuentoAdicional = 0.05;

        // Precios con 15% de descuento
        double camisetaConDescuento = precioCamiseta * (1 - descuentoPromocion);
        double pantalonConDescuento = precioPantalon * (1 - descuentoPromocion);

        // Segunda camiseta: primero 15%, luego 5% adicional
        double segundaCamiseta = camisetaConDescuento * (1 - descuentoAdicional);

        double total = camisetaConDescuento + pantalonConDescuento + segundaCamiseta;

        System.out.println("Primera camiseta: $" + camisetaConDescuento);
        System.out.println("Pantalón: $" + pantalonConDescuento);
        System.out.println("Segunda camiseta: $" + segundaCamiseta);
        System.out.println("Total a pagar: $" + total);
    }
}

