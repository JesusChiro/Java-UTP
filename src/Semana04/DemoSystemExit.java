package Semana04;

import java.util.Scanner;

public class DemoSystemExit {
    public static void main(String[] args) {
        int i = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero.");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        } else {
            System.out.println("Debe ingresar un número entero. Intente nuevamente!!!");
            sc.close();
            System.exit(-1);
        }

        System.out.println("El número ingresado es: " + i);
        sc.close();
    }
}
