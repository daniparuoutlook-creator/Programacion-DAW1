
import java.util.Scanner;

public class Ejercicio6_Tarea2 {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Primer jugador, inserta la contraseña: ");
	String contra = teclado.next();
	String adivina = null;
	
	int i = contra.length()-1; 
		contra.charAt(i);
		
		char letra = contra.charAt(i);
		
		System.out.println("Segundo jugador, tienes que acertarla con las siguientes pistas");
		System.out.println("Numero de caracteres: " +contra.length());
		System.out.println("Primera letra: " +contra.charAt(0));
		System.out.println("Ultima letra: " +letra);
		System.out.print("Adivina: ");
		adivina = teclado.next();
	
	if(adivina == contra) {
		System.out.println("Acertaste");
	}else {
			System.out.println("Fallaste");
		}
	}
}

