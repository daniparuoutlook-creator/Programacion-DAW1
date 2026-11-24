package Tarea2b;

import java.util.Scanner;
class RobotClasificacionException extends Exception {
	public RobotClasificacionException(String mensaje) {
		super(mensaje);
	}
}
public class Robots {
	static String NormalizaIdentificador(String identificador) {
		identificador = identificador.trim().toLowerCase();
		return identificador;
	}
	static Boolean ValidaIdentificador(String identificador) {

		
		return identificador.matches("^[a-z]{2}[0-9]{2}[a-z]$");
	}
	static Integer CalculaPuntuacion(String identificador) {
		int primero = Integer.parseInt(identificador.substring(2, 3));
		int segundo = Integer.parseInt(identificador.substring(3, 4));
		
		return primero * 2 + segundo * 3;
	}
	static String GeneraEtiqueta(StringBuilder identificador) {
		String letras = identificador.substring(0, 2);
		int puntuacion = CalculaPuntuacion(identificador.toString());
		String ultima = identificador.substring(4, 5);
		
		return letras + "-" + puntuacion + ultima;
	}
	
	static void CompruebaClasificacion(String identificador) throws RobotClasificacionException {
	    if ( CalculaPuntuacion(identificador) >=12 || identificador.endsWith("z")) {
	        throw new RobotClasificacionException("¡Robot clasificado para la fase final del torneo!");
	    }
	}
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in); 
	String identificador;
	
	do {
		System.out.print("Introduce el identificador del robot (SALIR para terminar): ");
		identificador = teclado.nextLine();
		
		if ( !identificador.equals("SALIR") ) {

		    String normalizado = NormalizaIdentificador(identificador);

		    if ( ValidaIdentificador(normalizado) ) {

		        System.out.println("Etiqueta: " + GeneraEtiqueta( new StringBuilder(normalizado) ));

		        try {
		            CompruebaClasificacion(normalizado);
		            System.out.println("El robot no está clasificado.");
		        } catch ( RobotClasificacionException e ) {
		            System.out.println( e.getMessage() );
		        }

		    } else {
		        System.out.println("Identificador incorrecto.");
		    }
		}
		
	} while (!identificador.equals("SALIR"));
		System.out.println("Fin del programa");
		teclado.close();
	}
}

