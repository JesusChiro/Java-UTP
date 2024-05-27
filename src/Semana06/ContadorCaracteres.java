package Semana06;

import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = scanner.nextLine();

        // Inicializamos el contador de caracteres
        int contador = 0;

        // Inicializamos el índice del bucle
        int indice = 0;

        // Mientras el índice sea menor que la longitud de la cadena
        while (indice < cadena.length()) {
            // Incrementamos el contador de caracteres
            contador++;
            // Incrementamos el índice para pasar al siguiente caracter
            indice++;
        }

        // Mostramos el resultado
        System.out.println("La cadena tiene " + contador + " caracteres.");

        // Cerramos el scanner
        scanner.close();
    }
}

