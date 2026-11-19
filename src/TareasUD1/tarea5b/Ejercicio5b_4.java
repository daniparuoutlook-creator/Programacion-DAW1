package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double HORAS_ORDINARIAS = 40;
        final double PRECIO_ORDINARIA = 12;
        final double PRECIO_EXTRA = 16;
        
        System.out.print("Introduce las horas trabajadas en la semana: ");
        double horas = scanner.nextDouble();
        
        double salario;
        
        if (horas < 0) {
            System.out.println("Horas incorrectas.");
        } else if (horas <= HORAS_ORDINARIAS) {
            salario = horas * PRECIO_ORDINARIA;
            System.out.println("El salario semanal es: " + salario + " euros");
        } else {
            salario = HORAS_ORDINARIAS * PRECIO_ORDINARIA + (horas - HORAS_ORDINARIAS) * PRECIO_EXTRA;
            System.out.println("El salario semanal es: " + salario + " euros");
        }
        
        scanner.close();
    }
}
