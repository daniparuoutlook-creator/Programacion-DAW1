
import java.util.Scanner;

public class Ej5a4 {
public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)) {
		System.out.print("Introduce el primer numero entero: ");
		int n1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo numero entero: ");
		int n2 = teclado.nextInt();
				
		if (n1 % 2 == 0) {
			System.out.println("El numero introducido " +n1+ " es par");
		} else {
			System.out.println("El numero introducido " +n1+ " es impar");
		}
		if (n2 % 2 == 0) {
			System.out.println("El numero introducido " +n2+ " es par");
		} else {
			System.out.println("El numero introducido " +n2+ " es impar");
		}
		
	}
	
}
}
