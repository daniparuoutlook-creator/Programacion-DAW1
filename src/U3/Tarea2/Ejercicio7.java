package Tarea2;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Primer jugador, inserta la contrasena: ");
	String contra = teclado.next();
	boolean acertaste = false;
	
	int i = contra.length()-1;
		contra.charAt(i);
		
		char letra = contra.charAt(i);
		
		System.out.println("Segundo jugador, intente acertarla con estas pistas");
		System.out.println("Numero de caracteres: " +contra.length());
		System.out.println("Primera letra: " +contra.charAt(0));
		System.out.println("Ultima letra: " +letra);
		System.out.print("Adivina: ");
	
	do {
		String adivina;
		adivina = teclado.next();
		
		if (adivina.equals(contra)) {
			acertaste = true;
		} 
		if (adivina.length() > contra.length()) {
			System.out.println("Fallaste, la contrasena es menor");
			System.out.print("Vuelve a intentarlo: ");
			adivina = teclado.next();
		} else {
			System.out.println("Fallaste, la contrasena es mayor");
			System.out.print("Vuelve a intentarlo: ");
			adivina = teclado.next();
		}
		
	} while (!acertaste);
	System.out.println("Acertaste");
	
}
}