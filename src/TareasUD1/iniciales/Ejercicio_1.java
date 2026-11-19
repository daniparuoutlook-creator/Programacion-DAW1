package TareasUD1.iniciales;

import java.util.Scanner;

public class Ejercicio_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Dime tu nombre: ");

	String nombre = sc.next();
	
	System.out.println("Dime tu edad");
	
	int edad = sc.nextInt();
	
	System.out.println("Cuantas horas duermes al dia?: ");

	int horas = sc.nextInt();
	
	System.out.println("Te llamas " +nombre);
	System.out.println("Tienes " +edad+ " anos");
	System.out.println("Duermes " +horas*7+ " horas a la semana");
	
	if (edad<18) {
		System.out.println("Te faltan " +(18-edad)+ " anos para ser mayor de edad");
	} else {
		System.out.println("Eres mayor de edad");
	}
}
}
