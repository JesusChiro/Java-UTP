package Semana06;

import java.util.Scanner;

public class MuestraLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();

        // Inicializamos el índice del bucle
        int indice = 0;

        // Mientras el índice sea menor que la longitud de la palabra
        while (indice < palabra.length()) {
            // Obtenemos el caracter en la posición actual
            char letra = palabra.charAt(indice);
            // Imprimimos el caracter
            System.out.println("Letra (" + (indice + 1) + "): " + letra);
            // Incrementamos el índice para pasar al siguiente caracter
            indice++;
        }

        // Cerramos el scanner
        scanner.close();
    }
}
