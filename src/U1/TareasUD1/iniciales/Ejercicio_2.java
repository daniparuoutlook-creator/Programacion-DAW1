package TareasUD1.iniciales;

import java.util.Scanner;

public class Ejercicio_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Cual es tu nota: ");
	float nota = sc.nextFloat();
	
	
	if (nota>10)
		System.out.println("nota incorrecta");
	else if (nota<0)
		System.out.println("nota incorrecta");
	else if (nota>=9)
		System.out.println("Sobresaliente");
	else if (nota>=7)
		System.out.println("Notable");
	else if (nota>=6)
		System.out.println("Bien");
	else if (nota>=5)
		System.out.println("Aprobado");
	else if (nota <5)
		System.out.println("Suspenso");
	
		
			
}
}
