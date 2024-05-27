package Semana05;

import java.util.Scanner;

public class NextLineTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine(); // Lee la línea completa, incluyendo espacios

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Lee el siguiente token como un entero

        System.out.println("Ingrese su profesión: ");

        scanner.nextLine(); // Consumir el salto de línea pendiente

        String profesion = scanner.nextLine(); // Lee la línea completa, incluyendo espacios

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Profesión: " + profesion);

        scanner.close();
    }
}

