package TareasUD1.tarea5b;

import java.util.Scanner;

public class Ejercicio5b_7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la primera nota: ");
        int nota1 = scanner.nextInt();
        
        System.out.print("Introduce la segunda nota: ");
        int nota2 = scanner.nextInt();
        
        System.out.print("Introduce la tercera nota: ");
        int nota3 = scanner.nextInt();
        
        double media = (double) (nota1 + nota2 + nota3) / 3;
        
        System.out.println("La media aritmética de las dos notas es: " + media);
        
        
        if (media>10)
    		System.out.println("nota incorrecta");
    	else if (media<0)
    		System.out.println("nota incorrecta");
    	else if (media>=9)
    		System.out.println("Sobresaliente");
    	else if (media>=7)
    		System.out.println("Notable");
    	else if (media>=6)
    		System.out.println("Bien");
    	else if (media>=5)
    		System.out.println("Aprobado");
    	else if (media <5)
    		System.out.println("Suspenso");
        
        scanner.close();
    

}
}
