package Semana09;

import java.util.Scanner;

public class EjemploArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        int max = Integer.MIN_VALUE;

        // Solicitar al usuario que ingrese 5 números
        System.out.println("Por favor, ingrese 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        // Calcular el promedio
        double promedio = (double) suma / numeros.length;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Número mayor: " + max);

        // Cerrar el scanner
        scanner.close();
    }
}
