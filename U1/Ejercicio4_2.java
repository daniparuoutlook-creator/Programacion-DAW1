package Tareas;

import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la primera nota: ");
        int nota1 = scanner.nextInt();
        
        System.out.print("Introduce la segunda nota: ");
        int nota2 = scanner.nextInt();
        
        double media = (double) (nota1 + nota2) / 2;
        
        System.out.println("La media aritmética de las dos notas es: " + media);
        
        scanner.close();
    }
}