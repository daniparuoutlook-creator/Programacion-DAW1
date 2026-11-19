package Tareas;

import java.util.Scanner;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduce el número 12: ");
        int numero = scanner.nextInt();
        
        if (numero == 12) {
            System.out.println("¡Correcto! Has introducido el número 12.");
        } else {
            System.out.println("Incorrecto. Has introducido el " + numero + " en lugar del 12.");
        }
        
        scanner.close();
    }
}