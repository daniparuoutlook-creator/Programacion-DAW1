package Examen1;

import java.util.Scanner;

public class Ej1 {
public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)){
		
		//Definimos las variables
		int edad;
		String inv;
		
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();
		
		//He usado un dos if para en uno definir en caso que sea menor 
		//de edad no le deje pasar y otro que si tiene invitacion entre gratis
		//y si no la tiene que pague 15 $.
		if(edad < 18) {
			System.out.println("Acceso denegado, eres menor");
		}
			else {
		System.out.print("¿Tiene invitacion? ");
		inv = teclado.next();
		
		if(inv.equalsIgnoreCase("si")) {
			System.out.println("Acceso permitido, su entrada es gratuita");
		}
		else if(inv.equalsIgnoreCase("no")) {
			System.out.println("Acceso permitido, debe pagar 15$");
		}
		else {
			System.out.println("Respuesta no valida");
		}
		
		}
	}

}
}

