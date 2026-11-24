package Tarea2b;

import java.util.Scanner;

public class Robots {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Boolean valida = false;
	String Id;
	
	
	
	do {
		System.out.print("Introduce el identificador del Robot: ");
		Id = teclado.next();
		Id = Id.trim().toLowerCase();
		
		if (Id.matches("^[a-z]{2}+\\d[0-9]{2}+[a-z]{1}$")) {
		valida = true;
		}  
	}
	while (!valida);
	}
}

