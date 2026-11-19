package TareasUD1.iniciales;

import java.util.Scanner;

public class Tarea_E {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el alto: ");
        int alto = teclado.nextInt();
        
        System.out.print("Introduce el ancho: ");
        int ancho = teclado.nextInt();
        
        System.out.println();
        
        int mitad = (alto + 1) / 2;
        
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                
                if (j == 1) {
                    System.out.print("*   "); 
                } else if (i == 1) {
                    System.out.print("*   ");
                } else if (i == alto) {
                    System.out.print("*   "); 
                } else if (i == mitad && j < ancho) {
                    System.out.print("*   "); 
                } else {
                    System.out.print(".   "); 
                }
                
            }
            System.out.println();
        }
        
        teclado.close();
    }
}