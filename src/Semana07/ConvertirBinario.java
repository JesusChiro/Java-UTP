package Semana07;

import java.util.Scanner;

public class ConvertirBinario {
    public static void main(String[] args) {
        int decimal = 0;
        int decimalOriginal = 0;
        int residuo = 0;
        String binario = "";          // Acumulador
        String binarioFinal = "";
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        decimal = sc.nextInt();

        decimalOriginal = decimal;
        do {
            residuo = decimal % 2;
            binario = binario + (residuo + "");     // Acumula los dígitos binarios
            decimal /= 2;
        } while (decimal > 0);

        contador = binario.length() - 1;
        while (contador >= 0) { // Para el ejemplo de 100: 0010011 --> 1100100
            binarioFinal = binarioFinal + binario.charAt(contador);     // Acumulador
            contador--;
        }

        System.out.println("El número " + decimalOriginal + " en binario es: " + binarioFinal);

        sc.close();
    }
}
