package Examen1;

import java.util.Scanner;

public class Ej2 {
public static void main(String[] args) {
	try (Scanner teclado = new Scanner(System.in)){
		
		//Aqui definimos las variables que vamos a usar en el ejercicio,
		//las que son double es para que tengan decimales.
		double tempActual = 22;
		double temp = 0;
		int ayuda; 
		int intentos = 1;
		double media = 0;
		
		//Yo lo he hecho mediante un menu porque me resulta mas comodo y facil
		//de ver e interactuar con el tanto para mi como para un usuario
		System.out.println("1. No");
		System.out.println("2. Si");
		System.out.print("Deseas recibir ayuda? ");
		ayuda = teclado.nextInt();
		
		//uso el switch para hacer los 2 casos, el de ayuda y el de sin ayuda
		switch(ayuda) {
		case 1:
			
			while (temp > tempActual || temp < tempActual) {
			System.out.print("Introduce una temperatura: ");
			temp = teclado.nextDouble();
			
			if(temp == tempActual) { 
				System.out.println("Temperatura correcta!!");
				System.out.println("Intentos utilizados " +intentos);
				System.out.println("Temperatura media introducida: ");
			
			}else if(intentos == 6) {
				System.out.println("Has alcanzado el maximo de intentos, la temperatura correcta era " +tempActual);
				System.out.println("Intentos utilizados " +intentos);
				media = temp / intentos;
				System.out.println("Temperatura media introducida: " +media);
				break;
				
			}else{
				System.out.println("Temperatura incorrecta!");
				intentos++;
				}

			
			}
		case 2:
			
			while (temp > tempActual || temp < tempActual) {
			System.out.print("Introduce una temperatura: ");
			temp = teclado.nextDouble();
			
			if(temp == tempActual) {
				System.out.println("Temperatura correcta!!");
				System.out.println("Intentos utilizados " +intentos);
				System.out.println("Temperatura media introducida: ");
			
			}else if(intentos == 6) {
				System.out.println("Has alcanzado el maximo de intentos, la temperatura correcta era " +tempActual);
				System.out.println("Intentos utilizados " +intentos);
				media = temp / intentos;
				System.out.println("Temperatura media introducida: " +media);
				break;
				
			}else if(temp > tempActual){
				System.out.println("Temperatura incorrecta!");
				System.out.println("pista: la temperatura correcta es menor");
				intentos++;
				}
			else if(temp < tempActual){
				System.out.println("Temperatura incorrecta!");
				System.out.println("pista: la temperatura correcta es mayor");
				intentos++;
				}

			
			}
			}	
		}
	}			
}		



