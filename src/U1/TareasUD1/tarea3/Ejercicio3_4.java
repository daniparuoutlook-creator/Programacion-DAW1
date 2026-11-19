package TareasUD1.tarea3;

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una longitud en millas: ");
        float millas = scanner.nextFloat();
        
        float kilometros = millas * 1.609f;
        
        System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
        
        scanner.close();
    }
}