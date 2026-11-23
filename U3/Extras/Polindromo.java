package Extras;

import java.util.Scanner;

public class Polindromo  {
	public static void main(String[] args) {
		try {
			
			Scanner teclado = new Scanner(System.in);
			String texto = "dabale arroz a3 la zorra el abad";
			String invertida = "";
			
			String frase = texto.replaceAll(" ", "");
			
			for (int i = frase.length() - 1; i >= 0; i--) {
				Character letra = frase.charAt(i);
				if(Character.isDigit(letra )) {
					throw new Miexception("No debes introducir numeros");
				}
				invertida = invertida + letra;
			}
			
			if (frase.equals(invertida))
				System.out.println("Es un polindromo");
			
			else {
				System.out.println("no es un polindromo");
			}
		} catch (Miexception e) {
			System.out.println(e.getMessage());
		} 
	}
}

class Miexception extends Exception {
	public Miexception(String mensaje) {
		super(mensaje);
	}
}
