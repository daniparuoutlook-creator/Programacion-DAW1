package TareasUD1.tarea5b;
import java.util.Scanner;
public class Ejercicio5b_17 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)){
		System.out.println("Escribe un numero de hasta 5 cifras");	
		int numero = teclado.nextInt();
		while (numero >= 10) { 	
			numero /= 10;
		} System.out.println("La primera cifra es: " +numero); 
		
}}}
