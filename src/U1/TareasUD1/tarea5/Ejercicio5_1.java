package TareasUD1.tarea5;

import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("El número introducido es positivo.");
        } else {
            System.out.println("El número introducido no es positivo.");
        }
        
        scanner.close();
    }
}