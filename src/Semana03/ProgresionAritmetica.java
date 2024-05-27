package Semana03;

import java.util.Scanner;

public class ProgresionAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer término de la secuencia:");
        int primerTermino = scanner.nextInt();

        System.out.println("Ingrese el segundo término de la secuencia:");
        int segundoTermino = scanner.nextInt();

        System.out.println("Ingrese el tercer término de la secuencia:");
        int tercerTermino = scanner.nextInt();

        // Verificar si es una progresión aritmética
        if (segundoTermino - primerTermino == tercerTermino - segundoTermino) {
            System.out.println("La secuencia es una progresión aritmética.");
            System.out.println("La diferencia común es: " + (segundoTermino - primerTermino));
        } else {
            System.out.println("La secuencia no es una progresión aritmética.");
        }

        scanner.close();
    }
}
