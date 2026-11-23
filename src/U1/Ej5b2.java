
import java.util.Scanner;

public class Ej5b2 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Introduce una hora (0-23)");
			int hora = teclado.nextInt();
			if (hora >= 6 && hora <= 12) {
				System.out.println("Buenos Dias");
			} else if (hora > 12 && hora < 21) {
				System.out.println("Buenas tardes");
			} else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
			    System.out.println("Buenas noches");
			} else {
				System.out.println("Hora incorrecta");
			}
				
	}
}
}