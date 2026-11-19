package Tareas;

import java.util.Scanner;

public class Ejercicio2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la temperatura en grados centígrados: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (9 * celsius / 5) + 32;
        
        System.out.println(celsius + " grados centígrados equivalen a " + fahrenheit + " grados Fahrenheit.");
        
        scanner.close();
    }
}