package Semana05;

import java.util.Scanner;

public class MenuOperaciones2 {

    public static void main(String[] args) {
        // Declarar variables
        int opcion;
        double numero1, numero2;

        // Mostrar el menú
        System.out.println("Menú");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("0. Salir");

        // Leer la opción seleccionada
        opcion = new Scanner(System.in).nextInt();

        // Realizar la operación correspondiente
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer número:");
                numero1 = new Scanner(System.in).nextDouble();
                System.out.println("Ingrese el segundo número:");
                numero2 = new Scanner(System.in).nextDouble();
                System.out.println("La suma es: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Ingrese el primer número:");
                numero1 = new Scanner(System.in).nextDouble();
                System.out.println("Ingrese el segundo número:");
                numero2 = new Scanner(System.in).nextDouble();
                System.out.println("La resta es: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Ingrese el primer número:");
                numero1 = new Scanner(System.in).nextDouble();
                System.out.println("Ingrese el segundo número:");
                numero2 = new Scanner(System.in).nextDouble();
                System.out.println("La multiplicación es: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("Ingrese el primer número:");
                numero1 = new Scanner(System.in).nextDouble();
                System.out.println("Ingrese el segundo número:");
                numero2 = new Scanner(System.in).nextDouble();
                if (numero2 != 0) {
                    System.out.println("La división es: " + (numero1 / numero2));
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;
            case 5:
                System.out.println("Ingrese el primer número:");
                numero1 = new Scanner(System.in).nextDouble();
                System.out.println("Ingrese el segundo número:");
                numero2 = new Scanner(System.in).nextDouble();
                System.out.println("La potencia es: " + Math.pow(numero1, numero2));
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Operación no soportada");
        }
    }
}