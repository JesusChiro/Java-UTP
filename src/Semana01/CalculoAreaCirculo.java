package Semana01;

// Clase para obtener el ingreso de datos

import java.util.Scanner;

/*
 * Programa para calcular el área de un círculo.
 */

public class CalculoAreaCirculo {
    public static void main(String[] args) {
        // Definir el valor de PI como constante
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo
        double area = PI * radio * radio;

        // Mostrar el resultado
        System.out.println("El área del círculo es: " + area);

        // Cerrar el Scanner
        scanner.close();
    }
}

