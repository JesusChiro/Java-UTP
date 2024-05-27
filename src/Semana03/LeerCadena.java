package Semana03;

import java.util.Scanner;

public class LeerCadena {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la entrada estándar (consola)
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un String
        System.out.print("Por favor, ingresa un texto: ");

        // Leer el String ingresado por el usuario
        String texto = scanner.nextLine();

        // Mostrar el texto ingresado por el usuario
        System.out.println("El texto ingresado es: " + texto);

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
