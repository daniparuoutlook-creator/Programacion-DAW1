package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_23 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)){
			System.out.println("De que sabor quieres la tarta");
			
			String tarta=teclado.next();
			
			int precio = 0;
			
			switch (tarta) {
				case "manzana":
					precio = 18;
					System.out.println("El precio de tarta de manzana es de: " +precio+"€");
			break;
				
				
				

			case "fresa":
				precio = 16;
				System.out.println("El precio de tarta de fresa es de: " +precio+"€");
			break;
			
			
			

			case "chocolate":
				System.out.println("Que tipo de chocolate quieres (negro o blanco)");
				String tipo = teclado.next();
				
				if (tipo.equalsIgnoreCase("Negro"))

				precio = 14;
				
				else if (tipo.equalsIgnoreCase("Blanco"))
													
				precio = 15;
				
				System.out.println("El precio de tarta de ese chocolate es de: " +precio+"€");
				
			break;
			
			
			default:
				System.out.println("Sin existencias");
				
	
			}
			
			System.out.println("Quiere nata?");
			String nata = teclado.next();
			double precioNata = 0;
			
			
			
			if (nata.equalsIgnoreCase("Si"))
			
			precioNata = 2.50;
			
			else if (nata.equalsIgnoreCase("No"))
			
			precioNata = 0;
			
			System.out.println("Quiere personalizarlo con un nombre?");

			String nombre = teclado.next();
			double precioNombre = 0;
			
			if (nombre.equalsIgnoreCase("Si"))
				
				precioNombre = 2.75;
				
				else if (nombre.equalsIgnoreCase("No"))
				
				precioNombre = 0;
			
			System.out.println("El precio total a pagar es de: " +( precio + precioNata + precioNombre)+ "€");
		
			
			
			
}
}
}
