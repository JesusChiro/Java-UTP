package Semana04;

import java.util.Scanner;

public class Sumar {
    public static void main(String[] args) {
        double a, b;
        int res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        a = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        b = sc.nextDouble();

        res = suma_dos_numeros(a, b);
        System.out.println("La suma es: " + res);


        System.out.println("Ingrese el primer número:");
        a = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        b = sc.nextDouble();
        res = suma_dos_numeros(a, b);
        System.out.println("La suma es: " + res);

        sc.close();

    }

    // Definición de un método
    public static int suma_dos_numeros(double num1, double num2) {
        int num1Entero, num2Entero;
        num1Entero = (int) Math.round(num1);
        num2Entero = (int) Math.round(num2);
        return num1Entero + num2Entero;
    }
}
