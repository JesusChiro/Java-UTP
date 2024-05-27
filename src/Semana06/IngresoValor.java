package Semana06;

import java.util.Scanner;

public class IngresoValor {
    public static void main(String[] args) {
        int numero;
        char respuesta;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre 1 y 100:");
        numero = sc.nextInt();
        sc.nextLine();

        while (numero >= 1 && numero <= 100) {
            System.out.println("¿Desea continuar? (S/N):");
            respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta == 'n') {
                break;
            } else if (respuesta == 's') {
                System.out.println("Ingrese un número entero entre 1 y 100:");
                numero = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Valor inválido. Intente Nuevamente.");
            }
        }

        sc.close();
    }
}
