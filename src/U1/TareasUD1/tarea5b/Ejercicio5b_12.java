package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_12 {
public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)){
		
		System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = scanner.nextInt();
        
        int mayor = (a > b && a > c) ? a : (b > c) ? b : c;
        int menor = (a < b && a < c) ? a : (b < c) ? b : c;
        int medio = a + b + c - mayor - menor;
        
        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(menor + " " + medio + " " + mayor);
}   
}
}
