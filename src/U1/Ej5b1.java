
import java.util.Scanner;

public class Ej5b1 {
public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)) {
		System.out.println("Que dia de la semana quieres saber la primera hora");
		
		String dia = teclado.next();
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Toca mates");
			break;
		case "martes":
			System.out.println("Toca ef");
			break;
		case "miercoles":
			System.out.println("Toca bio");
			break;
		case "jueves":
			System.out.println("Toca ciencias");
			break;
		case "viernes":
			System.out.println("Toca lengua");
			break;
			
		default:
			System.out.println("Dia equivocado");
		}
	}
}
}
