package Semana06;

import java.util.Scanner;

public class IngresoNumero {
    public static void main(String[] args) {
        int numero = 0;
        char respuesta;
        boolean numeroEnRango = true;

        Scanner sc = new Scanner(System.in);

        while (numeroEnRango) {
            System.out.println("Ingrese un número entero entre 1 y 100:");
            numero = sc.nextInt();

            numeroEnRango = (numero >= 1 && numero <= 100);
            if (!numeroEnRango) break;

            System.out.println("¿Desea continuar? (S/N):");
            respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta == 'n') break;
        }

        sc.close();
    }
}
