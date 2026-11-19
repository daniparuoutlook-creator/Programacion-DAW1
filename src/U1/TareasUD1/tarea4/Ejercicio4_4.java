package TareasUD1.tarea4;

import java.util.Scanner;

public class Ejercicio4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal: ");
        double numero = scanner.nextDouble();
        
        long numeroRedondeado = Math.round(numero);
        
        System.out.println("El número " + numero + " redondeado es: " + numeroRedondeado);
        
        scanner.close();
    }
}