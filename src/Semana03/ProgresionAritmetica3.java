package Semana03;

import java.util.Scanner;

public class ProgresionAritmetica3 {
    public static void main(String[] args) {
        int n1, n2, n3;
        boolean esProgresionAritmetica;

        System.out.println("Programa Progresión Aritmética");
        System.out.println("******************************");

        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        n1 = lecturaDatos.nextInt();
        System.out.println("Ingrese el segundo número:");
        n2 = lecturaDatos.nextInt();
        System.out.println("Ingrese el tercer número:");
        n3 = lecturaDatos.nextInt();

        esProgresionAritmetica = ((n2 - n1) == (n3 - n2));
        if (esProgresionAritmetica) {
            System.out.println("Los números: " + n1 + ", " + n2 + ", " + n3 + " estan en progresion aritmética.");
        } else {
            System.out.println("Los números: " + n1 + ", " + n2 + ", " + n3 + " no estan en progresion aritmética.");
        }

        lecturaDatos.close();
    }
}
