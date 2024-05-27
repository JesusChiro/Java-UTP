package Semana01;

import java.util.Scanner;

public class MiPrimeraApp {
    public static void main(String[] args) {
        // System.out.print(" ********************** \n");
        // System.out.println(" H O L A M U N D O !!! ");
        // System.out.println(" ********************** ");
        //
        // int num1=7, num2=0;
        // boolean condicion;
        //
        // condicion = (num2 != 0) && ((num1 / num2) != 1);
        // System.out.println("La condición es: " + condicion);
        //
        //
        // int num3 = 10;
        // System.out.println("10 elevado al cubo sería: " + Math.pow(num3,3));

        // Deseamos saber si un número es par o impar
        Scanner sc = new Scanner(System.in);
        int numeroA = 0;
        int numeroB = 0;
        boolean esMultiplo;

        System.out.println("Por favor ingrese el número A: ");
        numeroA = sc.nextInt();

        System.out.println("Por favor ingrese el número B: ");
        numeroB = sc.nextInt();

        esMultiplo = (numeroB != 0) && ((numeroA % numeroB) == 0);
        if (esMultiplo) {
            System.out.println("El número " + numeroA + " es multiplo de " + numeroB);
        } else {
            System.out.println("El número " + numeroA + " no es multiplo de " + numeroB);
        }
        sc.close();
    }
}