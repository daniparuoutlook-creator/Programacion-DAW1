package Tareas;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número (de dos cifras): ");
        byte numero1 = scanner.nextByte();
        
        System.out.print("Introduce el segundo número (de dos cifras): ");
        byte numero2 = scanner.nextByte();
        
        int suma = numero1 + numero2;
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        scanner.close();
    }
}