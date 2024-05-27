package Semana08;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Ingrese un número entero positivo para N: ");
        N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            int a = 0, b = 1, sum = 0;
            String series = "";

            for (int i = 1; i <= N; i++) {
                series += a + " ";
                sum += a;
                int next = a + b;
                a = b;
                b = next;
            }

            System.out.println("Serie de Fibonacci: " + series);
            System.out.println("Suma de los números mostrados: " + sum);
        }
        scanner.close();
    }
}
