package Semana02;

// Clase para obtener el ingreso de datos

import java.util.Scanner;

/*
Programa para realizar operaciones aritmeticas:
    - Suma
    - Resta
    - Multiplicación
    - División
 */

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        // Realizar operaciones aritméticas
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        // Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Cerrar el Scanner
        scanner.close();
    }
}

