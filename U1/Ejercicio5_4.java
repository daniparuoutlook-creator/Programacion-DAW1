package Tareas;

import java.util.Scanner;

public class Ejercicio5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        int contadorPares = 0;
        
        if (numero1 % 2 == 0) {
            contadorPares++;
        }
        
        if (numero2 % 2 == 0) {
            contadorPares++;
        }
        
        System.out.println("Has introducido " + contadorPares + " número(s) par(es).");
        
        scanner.close();
    }
}