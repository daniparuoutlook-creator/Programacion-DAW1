package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_5 {
	public static void main(String[] args) {
		System.out.println("vamos a resolver una ecuacion, introduce el primer valor: ");

		try (Scanner teclado = new Scanner(System.in)){
			
			double a = teclado.nextDouble();
			
		System.out.println("Introduce el segundo valor: ");
		
			double b = teclado.nextDouble();
			
			double resultado = a / b;
			System.out.println("La solucion es x= "+resultado);

	}	
  }
}
