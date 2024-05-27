package Semana06;

import java.util.Scanner;

public class NumeroEnteroRango {
    public static void main(String[] args) {
        int numero = 0;
        char continuar;
        boolean numeroEnRango = true; // Centinela

        Scanner sc = new Scanner(System.in);

        while (numeroEnRango) {
            System.out.println("Ingrese un numero entero entre 1 y 100:");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                numeroEnRango = (numero >= 1 && numero <= 100);
                if (!numeroEnRango) break;
            } else {
                System.out.println("Debe ingresar un número entero.");
                sc.nextLine();
                continue;
            }

            System.out.println("¿Desea continuar?(S/N)");
            continuar = sc.next().toLowerCase().charAt(0);
            if (continuar == 'n') break;
        }

        System.out.println("Fin del programa.");
        sc.close();
    }
}
