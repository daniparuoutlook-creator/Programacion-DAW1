package TareasUD1.extra;

import java.util.Scanner;

public class Ejercicio_limite200 {
public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)){
		int numTotal = 0;
		int suma = 0;
		
		do {
			System.out.println("Introduce un numero");
			numTotal = teclado.nextInt();
			suma += numTotal;
		} while (numTotal != 0 && suma <=200);
		System.out.println("El programa a finalizado, la suma antes de llegar a 200 fue: " +suma);
	}

}
}
