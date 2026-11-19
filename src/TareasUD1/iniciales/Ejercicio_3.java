package TareasUD1.iniciales;

public class Ejercicio_3 {
    public static void main(String[] args) {
        
        int pares = 0;
        int impares = 0;
        
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 == 0) {
                System.out.println(i + " - es par");
                pares++; 
            } else {
                System.out.println(i + " - es impar");
                impares++; 
            }
            
        }
        
        System.out.println();
        System.out.println("Total de pares: " + pares);
        System.out.println("Total de impares: " + impares);
        
    }
}