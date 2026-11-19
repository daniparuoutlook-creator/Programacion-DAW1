package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_21 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
                
        System.out.println("Que cargo tienes? ");
        System.out.println("1. Prog. junior");
        System.out.println("2. Prog. Senior");
        System.out.println("3. Jefe de proyecto");
        System.out.print("Opcion: ");
        
        int cargo = teclado.nextInt();
        
        System.out.println("Cuantos dias has estado de viaje visitando clientes? ");
        
        int dias = teclado.nextInt();
        
        System.out.println("Cual es tu estado actual? ");
        System.out.println("1. Soltero");
        System.out.println("2. Casado");
        System.out.print("Opcion: ");
        
        int estado = teclado.nextInt();
        double sueldo;
        
        switch (cargo) {
        case 1:
        	sueldo = 950;
        	break;
        case 2:
        	sueldo = 1200;
        	break;
        case 3:
        	sueldo = 1600;
        	break;
        	
        default:
        	System.out.println("Cargo equivocado");
        	teclado.close();
        	return;


    	}

        double irpf;

        switch (estado) {
        case 1:
        	irpf = 0.25;
        	break;
        case 2:
        	irpf = 0.20;
        	break;

        default:
        	System.out.println("Estado civil equivocado");
        	teclado.close();
        	return;
        }

        double dietas = dias * 30;
        double bruto = sueldo + dietas;
        double retencion = bruto * irpf;
        double neto = bruto - retencion;

        System.out.println();
        System.out.println("Sueldo base:  " + sueldo + " euros");
        System.out.println("Dietas (" + dias + " dias x 30): " + dietas + " euros");
        System.out.println("Total bruto:  " + bruto + " euros");
        System.out.println("IRPF (" + (irpf * 100) + "%): -" + retencion + " euros");
        System.out.println("--------------------");
        System.out.println("Sueldo neto:  " + neto + " euros");

        teclado.close();
        }
        

}

