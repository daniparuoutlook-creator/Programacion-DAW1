package TareasUD1.tarea4;

import java.util.Scanner;

public class Ejercicio4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la primera nota (decimal): ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Introduce la segunda nota (decimal): ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Introduce la tercera nota (decimal): ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        int mediaEntera = (int) media;
        
        System.out.println("La media exacta es: " + media);
        System.out.println("La parte entera de la media es: " + mediaEntera);
        
        scanner.close();
    }
}