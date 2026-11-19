package TareasUD1.tarea2;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        
        if (numero2 != 0) {
        	
            double resultado = (double) numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
        
        scanner.close();
    }
}