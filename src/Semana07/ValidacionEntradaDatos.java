package Semana07;

import java.util.Scanner;

public class ValidacionEntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero.");
                System.out.print("Ingrese un número positivo: ");
                scanner.next();
            }
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Error: Debe ingresar un número positivo.");
            }
        } while (numero <= 0);

        System.out.println("Número ingresado correctamente: " + numero);

        scanner.close();
    }
}
