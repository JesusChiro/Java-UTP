package Semana07;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        int numero = 0;   // Número a leer
        int opcion = 0;   // Opción de menú
        char respuesta = 'X'; // Respuesta a la pregunta ¿desea continuar?
        boolean salir = false;    // Centinela para la opción de salir
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un número entero:");
            numero = sc.nextInt();

            System.out.println("Menu de Opciones");
            System.out.println("----------------");
            System.out.println("[1] ¿Es Primo?");
            System.out.println("[2] Factorial");
            System.out.println("[3] Salir");
            System.out.println("Ingrese la opción:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 ->    // Verificar si es un número primo
                        esNumeroPrimo(numero);
                case 2 ->    // Calcular el factorial
                        factorial(numero);
                case 3 ->   // Salir del programa
                        salir = true;
                default -> System.out.println("Opción inválida.");
            }

            if (!salir) {
                System.out.println("¿Desea continuar? (S/N)");
                respuesta = sc.next().toLowerCase().charAt(0);
            }

        } while (respuesta != 'n' && !salir);

        sc.close();
    }

    public static void esNumeroPrimo(int num) {
        int contador = 2;
        boolean esPrimo = true;

        while (contador < num) {
            if (num % contador == 0) {
                esPrimo = false;
                break;
            }
            contador++;
        }

        if (esPrimo)
            System.out.println(num + " es un número primo.");
        else
            System.out.println(num + " NO es un número primo.");
    }

    public static void factorial(int num) {
        int contador = 1;
        long resultado = 1;   // Acumulador

        while (contador <= num) {
            resultado *= contador;
            contador++;
            System.out.println("resultado: " + resultado + "  contador: " + contador);
        }

        System.out.println("El factorial de " + num + " es:" + resultado);
    }

}
