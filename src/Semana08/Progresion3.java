package Semana08;

import java.util.Scanner;

public class Progresion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de progresión (a para aritmética, g para geométrica): ");
        String tipo = scanner.nextLine();

        System.out.print("Ingrese la razón: ");
        double razon = scanner.nextDouble();

        System.out.print("Ingrese el número de términos a generar: ");
        int numTerminos = scanner.nextInt();

        if (tipo.equalsIgnoreCase("a")) {
            generarProgresionAritmetica(razon, numTerminos);
        } else if (tipo.equalsIgnoreCase("g")) {
            generarProgresionGeometrica(razon, numTerminos);
        } else {
            System.out.println("Tipo de progresión inválido.");
        }
        scanner.close();
    }

    public static void generarProgresionAritmetica(double razon, int numTerminos) {
        System.out.print("Progresión aritmética: ");
        double termino = 0;
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print(termino + " ");
            termino += razon;
        }
        System.out.println();
    }

    public static void generarProgresionGeometrica(double razon, int numTerminos) {
        System.out.print("Progresión geométrica: ");
        double termino = 1;
        System.out.print(termino + " ");
        for (int i = 2; i <= numTerminos; i++) {
            termino *= razon;
            System.out.print(termino + " ");
        }
        System.out.println();
    }
}