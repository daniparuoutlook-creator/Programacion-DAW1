package TareasUD1.iniciales;

import java.util.Scanner;

public class Tarea_inicial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el alto: ");
        int alto = teclado.nextInt();
        
        System.out.print("Introduce el ancho: ");
        int ancho = teclado.nextInt();
        
        System.out.println();
        
        int mitad = alto / 2;
        
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                
                if (j == ancho) {
                    System.out.print("*   ");
                } 
                else if (i == mitad) {
                    System.out.print("*   ");
                }                else if (i == alto) {
                    System.out.print("*   ");
                } 
                else if (j == 1 && i > mitad) {
                    System.out.print("*   ");
                } 
                else {
                    System.out.print(".   ");
                }
                
            }
            System.out.println(); 
        }
        
        teclado.close();
    }
}