
import java.util.Scanner;

public class Ej5a1 {
public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)) {
		System.out.print("Introduce un numero entero: ");
		int n = teclado.nextInt();
		 
		if(n > 0) {
			System.out.println("El numero introducido es positivo");
			
		}else {
			System.out.println("El numero introducido en negativo");
		}
	}
}
}
