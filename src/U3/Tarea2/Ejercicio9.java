package Tarea2;

import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	StringBuilder sb = new StringBuilder("Alabí Alixar");
	System.out.println(sb);
	
	System.out.println("Capacidad inicial: " +sb.capacity());
	System.out.println("Longitud inicial: " +sb.length());
	System.out.println(sb.replace(0, 12, "Chicharrones de chiclana"));
	int capacidad = 5000;
	System.out.println("Hay " +sb.insert(0, capacidad+" "));
	
}
}
