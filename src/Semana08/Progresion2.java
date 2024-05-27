package Semana08;

import java.util.Scanner;

public class Progresion2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoProgresion, n;
        double primerTermino;
        double razon;

        do{
            System.out.println("¿Qué tipo de progresión desea generar?");
            System.out.println("1: Aritmética");
            System.out.println("2: Geométrica");
            System.out.println("3: Salir");
            tipoProgresion = scanner.nextInt();

            System.out.print("Proporcione el primer término: ");
            primerTermino = scanner.nextDouble();

            System.out.print("Proporcione el valor de la razón: ");
            razon = scanner.nextDouble();

            System.out.print("Proporcione el número de términos a generar: ");
            n = scanner.nextInt();

            System.out.println("Los primeros " + n + " términos de la progresión son:");

            switch (tipoProgresion) {
                case 1:
                    metodoAritmetico(primerTermino, razon, n);
                    break;
                case 2:
                    metodoGeometrico(primerTermino, razon, n);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while(tipoProgresion!=3);
        scanner.close();
    }

    public static void metodoAritmetico(double primerTermino, double razon, int n) {
        for (int i = 0; i < n; i++) {
            double termino = primerTermino + i * razon;
            System.out.print(termino + "; ");
        }
    }

    public static void metodoGeometrico(double primerTermino, double razon, int n) {
        for (int i = 0; i < n; i++) {
            double termino = primerTermino * Math.pow(razon, i);
            System.out.print(termino + "; ");
        }
    }
}

