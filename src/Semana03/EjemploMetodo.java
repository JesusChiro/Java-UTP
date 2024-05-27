package Semana03;

import java.util.Scanner;

public class EjemploMetodo {
    public static void main(String[] args) {
        Scanner inputDigit = new Scanner(System.in);
        System.out.println("*****Ingrese primer número*****");
        int varUno = inputDigit.nextInt();
        System.out.println("*****Ingrese segundo número*****");
        int varDos = inputDigit.nextInt();
        int max = 0;

        max = Maximo(varUno, varDos);
        System.out.println("El mayor número de los ingresados es: " + max);
        inputDigit.close();
    }

    public static int Maximo(int numA, int numB) {
        int maximo = 0;
        // Implementar el código para calcular y retornar el máximo de esos dos numeros
        if (numA > numB) {
            maximo = numA;
        } else {
            maximo = numB;
        }
        return maximo; // retorna el valor del método
    }
}
