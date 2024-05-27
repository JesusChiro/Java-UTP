package Semana06;

import java.util.Scanner;

public class ValidacionWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        boolean centinela = true;

        while (centinela) {
            System.out.println("Ingrese un número entero:");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                centinela = false;
                System.out.println("El número dato ingresado ("+ num + ") es válido");
            } else {
                System.out.println("Debe ingresar un número entero. Intente nuevamente!!");
            }
            sc.nextLine();
        }

        sc.close();
    }
}
