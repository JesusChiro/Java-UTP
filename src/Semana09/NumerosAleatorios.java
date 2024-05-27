package Semana09;

import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int tamano;
        int[] numeros;  // Se crea la variable numeros que va a referenciar un arreglo de enteros
        int suma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar el tamaño del arreglo:");
        tamano = sc.nextInt();

        numeros = new int[tamano];  // Se crea el arreglo

        for(int i=0; i<tamano; i++){        // Se recorre el arreglo
            numeros[i] = (int) (Math.random() * 100);   // Acceder a los elementos del arreglo
            suma += numeros[i];
        }

        System.out.println("La suma de los números es: " + suma);

        System.out.println("Recorrido del arreglo con FOR:");
        for(int i=0; i<tamano; i++) System.out.println("Índice: " + i + " Valor: " + numeros[i]);

        System.out.println("Recorrido del arreglo con WHILE:");
        int i=0;
        while(i<tamano) {
            System.out.println("Índice: " + i + " Valor: " + numeros[i]);
            i++;
        }

        System.out.println("Recorrido del arreglo con DO-WHILE:");
        i=0;
        do {
            System.out.println("Índice: " + i + " Valor: " + numeros[i]);
            i++;
        } while(i<tamano);

        sc.close();
    }
}
