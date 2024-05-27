package Semana06;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 1;
        String numerosImpares = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un númnero entero:");
        numero = sc.nextInt();

        while (contador <= numero) {
            if (contador % 2 != 0)
                if (contador == 1)
                    numerosImpares = numerosImpares + contador;
                else
                    numerosImpares = numerosImpares + ", " + contador;
            ;

            contador++;
        }

        System.out.println("Los números impares de 1 a " + numero + " son:");
        System.out.println(numerosImpares + ".");

        sc.close();
    }
}
