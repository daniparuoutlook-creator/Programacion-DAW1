package TareasUD1.tarea2;

import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una longitud en millas: ");
        double millas = scanner.nextDouble();
        
        double metros = millas * 1609;
        
        System.out.println(millas + " millas equivalen a " + metros + " metros.");
        
        scanner.close();
    }
}