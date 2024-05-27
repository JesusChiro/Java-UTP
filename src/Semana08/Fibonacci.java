package Semana08;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,suma=0;
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de términos a mostrar
        do {
            System.out.print("Introduce el número de términos de la secuencia de Fibonacci a mostrar: ");
            n = scanner.nextInt();
        }while(n<=0);

        // Variables iniciales de la secuencia de Fibonacci
        int a = 0, b = 1, siguiente=0;

        // Mostrar los primeros n términos de la secuencia de Fibonacci
        System.out.println("\nLos primeros " + n + " números de la secuencia de Fibonacci son:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            suma+=a;

            // Calcular el siguiente término
            siguiente = a + b;

            // Actualizar los valores de a y b
            a = b;
            b = siguiente;
        }

        System.out.println("\nLa suma de los " + n + " terminos de la serie Fibonacci es: " + suma);
        scanner.close();
    }
}
