package Tareas;

import java.util.Scanner;

public class Ejercicio5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double GRAVEDAD = 9.8;
        
        System.out.print("Introduce el valor del tiempo en segundos: ");
        double tiempo = scanner.nextDouble();
        
        if (tiempo <= 0) {
            System.out.println("Tiempo incorrecto.");
        } else {
            double velocidad = GRAVEDAD * tiempo;
            System.out.println("La velocidad calculada es: " + velocidad);
        }
        
        scanner.close();
    }
}