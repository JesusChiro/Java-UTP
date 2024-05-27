package Semana07;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int num;
        int i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre 1 y 12:");
        num = sc.nextInt();

        do {
            System.out.printf("%d x %2d = %3d\n", num, i, num * i);
        } while (++i <= 12);

        sc.close();
    }
}
