package Semana04;

import java.util.Scanner;

public class NumerosRomanos {
    public static void main(String[] args) {
        int numero;
        int decenas, unidades;
        String numeroRomano;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota:");
        numero = sc.nextInt();

        decenas = (int) Math.floor(numero / 10);
        numeroRomano = switch (decenas) {
            case 0 -> "";
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            default -> "Decena no reconocida.";
        };

        unidades = numero % 10;
        numeroRomano = numeroRomano + switch (unidades) {
            case 0 -> "";
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "Unidad no reconocida.";
        };

        System.out.println(numeroRomano);

        sc.close();
    }
}
