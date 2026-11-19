package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un día de la semana: ");
        String dia = scanner.nextLine();
        
        if (dia.equalsIgnoreCase("lunes")) {
            System.out.println("A primera hora toca Programación.");
        } else if (dia.equalsIgnoreCase("martes")) {
            System.out.println("A primera hora toca Bases de Datos.");
        } else if (dia.equalsIgnoreCase("miércoles")) {
            System.out.println("A primera hora toca Lenguajes de Marcas.");
        } else if (dia.equalsIgnoreCase("jueves")) {
            System.out.println("A primera hora toca Entornos de Desarrollo.");
        } else if (dia.equalsIgnoreCase("viernes")) {
            System.out.println("A primera hora toca Sistemas Informáticos.");
        } else if (dia.equalsIgnoreCase("sábado") || dia.equals("domingo")) {
            System.out.println("No hay clase ese día.");
        } else {
            System.out.println("Día incorrecto.");
        }
        
        scanner.close();
    }
}
