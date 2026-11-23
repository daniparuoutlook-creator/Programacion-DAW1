
import java.util.Scanner;

public class MaquinaExpendedoraPlantilla {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        // renombrada a "precio" (minúscula inicial, convención de Java)
        double precio = teclado.nextDouble();

        double totalIntroducido = 0;
        int m = 0; // monedas

        // "<" en vez de "<=". Si el total llega justo al precio,
        // ya está pagado y no hay que pedir más monedas.
        while (totalIntroducido < precio) {

            System.out.print("Introduce una moneda: ");
            double moneda = teclado.nextDouble();

            // se comprueba primero si la moneda es válida.
            // Antes, m++ y la suma se hacían siempre, aunque la moneda fuera negativa.
            if (moneda <= 0) {
                System.out.println("Moneda no aceptada");
            } else {
                m++; // solo se cuentan las monedas aceptadas

                // "+=" acumula el total.
                // Antes era "=" y solo se guardaba la última moneda.
                totalIntroducido += moneda;
            }
        }

        // quitado el "(int)", que eliminaba los decimales del cambio.
        double cambio = totalIntroducido - precio;

        // quitado el ";" después del if.
        // Antes el if quedaba vacío y el bloque de abajo se ejecutaba siempre.
        if (cambio > 0) {
            // printf con %.2f muestra 2 decimales y evita cosas como 0.30000000000000004
            System.out.printf("Cambio a devolver: %.2f%n", cambio);
        }

        System.out.println("Número de monedas: " + m);

        teclado.close();
    }
}