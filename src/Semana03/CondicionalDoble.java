package Semana03;

import java.util.Scanner;

public class CondicionalDoble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("Por favor ingrese su género (M para masculino, F para femenino):");
        char genero = scanner.next().charAt(0);

        // Estructura condicional doble
        if (edad >= 18) {
            if (genero == 'M') {
                System.out.println("Eres un hombre mayor de edad.");
            } else if (genero == 'F') {
                System.out.println("Eres una mujer mayor de edad.");
            } else {
                System.out.println("Género no válido.");
            }
        } else {
            if (genero == 'M') {
                System.out.println("Eres un niño o adolescente.");
            } else if (genero == 'F') {
                System.out.println("Eres una niña o adolescente.");
            } else {
                System.out.println("Género no válido.");
            }
        }

        scanner.close();
    }
}

