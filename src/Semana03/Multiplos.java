package Semana03;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int numeroA, numeroB;
        boolean AesMultiploDeB;

        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Ingrese el número A: ");
        if (lecturaDatos.hasNextInt()) {
            numeroA = lecturaDatos.nextInt();
        } else {
            numeroA = 0;
        }
        lecturaDatos.nextLine();

        System.out.println("Ingrese el número B: ");
        if (lecturaDatos.hasNextInt()) {
            numeroB = lecturaDatos.nextInt();
        } else {
            numeroB = 0;
        }
        lecturaDatos.nextLine();
        AesMultiploDeB = (numeroB != 0) && ((numeroA % numeroB) == 0);
        if (AesMultiploDeB) {
            System.out.println("El número " + numeroA + " es multiplo de " + numeroB + ".");
        } else {
            System.out.println("El número " + numeroA + " no es multiplo de " + numeroB + ".");
        }
        lecturaDatos.close();
    }
}
