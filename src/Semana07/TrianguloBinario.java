package Semana07;

import java.util.Scanner;

public class TrianguloBinario {
    public static void main(String[] args) {
        int numero;
        int contador = 1;
        int contadorInterno = 1;
        String digito = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        numero = sc.nextInt();

        do {     // Generar las filas
            contadorInterno = 1;
            while (contadorInterno <= contador) {       // Generar las columnas (dígitos)
                if (contador % 2 == 0) {
                    if (contadorInterno % 2 == 0) digito = "1";
                    else digito = "0";
                } else {
                    if (contadorInterno % 2 == 0) digito = "0";
                    else digito = "1";
                }
                System.out.print(digito);
                contadorInterno++;
            }
            System.out.print("\n");
            contador++;

        } while (contador <= numero);

        sc.close();
    }
}
