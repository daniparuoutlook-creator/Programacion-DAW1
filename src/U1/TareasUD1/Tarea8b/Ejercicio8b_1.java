package TareasUD1.Tarea8b;

import java.util.Scanner;

public class Ejercicio8b_1 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int combinacion;

        for (int intentos = 4; intentos > 0; intentos--) {

        	System.out.print("Para abrir la caja fuerte tienes que poner la combinacion de 4 cifras: ");

        	combinacion = teclado.nextInt();

        	if(combinacion == 1234) {
        		System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        		break;

        	} else {
        		System.out.println("Lo siento, esa no es la combinación");
        	}
        }

        teclado.close();
	}
}
