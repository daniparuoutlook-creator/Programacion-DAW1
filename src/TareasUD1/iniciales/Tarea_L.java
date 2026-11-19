package TareasUD1.iniciales;

import java.util.Scanner;

public class Tarea_L {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la altura: ");
        int altura = teclado.nextInt();
        
        System.out.print("Introduce la anchura: ");
        int anchura = teclado.nextInt();
        
        System.out.println();
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= anchura; j++) {
                
                if (j == 1) {
                    System.out.print("*   ");
                } 
                else if (i == altura) {
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