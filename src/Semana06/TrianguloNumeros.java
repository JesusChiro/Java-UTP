package Semana06;

/*
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
*/

import java.util.Scanner;

public class TrianguloNumeros {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        numero = sc.nextInt();

        while (contador <= numero) {

            if (contador % 2 != 0) {
                i = 1;
                while (i <= contador) {
                    System.out.print(i + " ");
                    i += 2;
                }
                System.out.print("\n");
            }
            contador++;
        }
    sc.close();
    }
}
