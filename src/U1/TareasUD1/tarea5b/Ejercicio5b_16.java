package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_16 {
public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)){
		
		int numero;
		int ultimoNumero;
		
		System.out.println("Introduce un numero entero: ");
		numero = teclado.nextInt();
		
		ultimoNumero = numero % 10;
		
		if (ultimoNumero < 0)
			ultimoNumero = -ultimoNumero;
		
		System.out.println("La ultima cifra es: "+ultimoNumero);
		
	}
  }
}
