package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la hora (0-23): ");
        int hora = scanner.nextInt();
        
        if (hora < 0 || hora > 23) {
            System.out.println("Hora incorrecta.");
        } else if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
        
        scanner.close();
    }
}
