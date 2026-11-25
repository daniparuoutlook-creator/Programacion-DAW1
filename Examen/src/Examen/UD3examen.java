package Examen;

import java.util.Scanner;

class ParkingGratisException extends Exception {
	public ParkingGratisException(String mensaje) {
		super(mensaje);
	}
}

public class UD3examen {
	static String FormateaMatricula(String matricula) {
		matricula = matricula.trim().toUpperCase();
		return matricula;
	}
	static Boolean ValidaMatricula(String matricula) {
		
	return FormateaMatricula(matricula).matches("^[0-9]{4}[A-Z]{3}$");			
	}
	static int PlazasLibres(Integer PlazasActualmenteOcupadas) {
		Integer PlazasLibres = 2700;
		PlazasLibres = PlazasLibres - PlazasActualmenteOcupadas;
		return PlazasLibres;
	}
	static Integer SumaDigitos(String matricula) {
		Integer d1 = Integer.parseInt(matricula.substring(0, 1));
		Integer d2 = Integer.parseInt(matricula.substring(1, 2));
		Integer d3 = Integer.parseInt(matricula.substring(2, 3));
		Integer d4 = Integer.parseInt(matricula.substring(3, 4));
		Integer total = 0;
		total = d1 + d2 + d3 + d4;
		return total;
		
	}
	static Character AsignaPlaza(String matricula) {
		Character letra = matricula.charAt(6);
		return Character.toUpperCase(letra);
	}
	void CompruebaPromocion(String matricula) {
		try {
			if (SumaDigitos(matricula) == 20 || matricula.substring(0, 3).equals("DAW")) {
				
				System.out.println("Parking gratis");
				throw new ParkingGratisException(matricula);
			}
		} catch (ParkingGratisException e) {
			
		}
	}
	static String GeneraCodigoAcceso(String matricula) {
		StringBuilder reverso;
		reverso = new StringBuilder(matricula.substring(4, 7)).reverse();
		reverso.append("-");
		String codigo = reverso.toString()+SumaDigitos(matricula);
		
		return codigo;
	}
	static StringBuilder EsCapicua(String matricula) {
		StringBuilder capicua;
		capicua = new StringBuilder(matricula.substring(0, 4));
		capicua.reverse().toString();
		
		return capicua;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String matricula;
		Integer plazasActualmenteOcupadas = 0;
		
		do {
		System.out.print("Introduzca la matricula (o fin para terminar): ");
		matricula = teclado.nextLine();
		
		
		if (ValidaMatricula(matricula).equals(true)) {
			System.out.println("Matricula valida");
			plazasActualmenteOcupadas++;
			
			System.out.println("Plazas ocupadas: " +plazasActualmenteOcupadas);
			System.out.println("Plazas libres: " +PlazasLibres(plazasActualmenteOcupadas));
			
			System.out.println("Suma total de los digitos de la matricula: " +SumaDigitos(matricula));
			
			System.out.println("Plaza asignada: " +AsignaPlaza(matricula)+SumaDigitos(matricula));
			
			System.out.println("El codigo de acceso es: " +GeneraCodigoAcceso(matricula).toUpperCase());
			
			StringBuilder esCapicua = EsCapicua(matricula);
			if (matricula.substring(0, 4).equals(esCapicua)) {
				System.out.println("La parte numerica de la matricula es capicua!!");
			} else {
				System.out.println("No es capicua");
			}
			
			
		} else {
			System.out.println("Matricula no valida");
		}
		
		
		} while (!matricula.equals("fin"));
		System.out.println("Programa finalizado");
	}
}
