package Tareas;

import java.util.Scanner;

public class Ejercicio5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número (entero largo): ");
        long numero1 = scanner.nextLong();
        
        System.out.print("Introduce el segundo número (entero largo): ");
        long numero2 = scanner.nextLong();
        
        System.out.print("Introduce el tercer número (entero largo): ");
        long numero3 = scanner.nextLong();
        
        long mayor;
        
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }
        
        System.out.println("El mayor de los tres números es: " + mayor);
        
        scanner.close();
    }
}