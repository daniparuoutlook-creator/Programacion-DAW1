package Tareas;

import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número real: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número real: ");
        double numero2 = scanner.nextDouble();
        
        if (numero2 != 0.0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
        
        scanner.close();
    }
}