import java.util.Scanner;

public class Codigo6 {
    public static void main(String[] args) { //Se agrega método main
        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20; // números entre 20 y 400
            System.out.print(n[i] + " ");
        }//for

        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        
        Scanner scanner = new Scanner(System.in); // Crear un Scanner para leer la opción del usuario
        int opcion = scanner.nextInt(); // Leer la opción del usuario

        int multiplo = (opcion == 1) ? 5 : 7;

        for (int e : n) { //foreach, que no es foreach, en formato correcto
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] "); // Resaltar múltiplos
            } else {
                System.out.print(e + " "); // Mostrar otros números
            }//else
        }//foreach

        scanner.close(); // Cerrar el Scanner
    } // main
} // class Codigo6

