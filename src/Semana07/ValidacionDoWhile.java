package Semana07;

import java.util.Scanner;

public class ValidacionDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean centinela = true;

        do {
            System.out.println("Ingrese un número entero entre 1 y 12:");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
            } else {
                System.out.println("Debe ingresar un número entero. Intente nuevamente!!");
            }
            sc.nextLine();
            //centinela = !(num>=1 && num<=12);
            centinela = (num < 1 || num > 12);

        } while (centinela); // Número (num) debe estar en el rango entre 1 y 12.

        sc.close();
    }
}

