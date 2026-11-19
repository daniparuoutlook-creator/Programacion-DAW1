package Tareas;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu año de nacimiento: ");
        short anoNacimiento = scanner.nextShort();
        
        System.out.print("Introduce el año actual: ");
        short anoActual = scanner.nextShort();
        
        int edad = anoActual - anoNacimiento;
        
        System.out.println("Si ya has cumplido años este año, tu edad es de: " + edad + " años.");
        
        scanner.close();
    }
}