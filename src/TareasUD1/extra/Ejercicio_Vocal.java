package TareasUD1.extra;

import java.util.Scanner;

public class Ejercicio_Vocal {
	public static void main(String[] args) {
		System.out.println("Introduce una letra cualquiera");
		
		try (Scanner teclado = new Scanner(System.in)){
			
			String letra=teclado.next();
			Boolean vocal;
			
			switch (letra) {
				case "a","e","i","o","u":
					vocal=true;
				break;
				
				default:
					vocal=false;
									
			}
			
			if (vocal)
				System.out.println("Es vocal");
			else
				System.out.println("No es vocal");
		}
	}
}
