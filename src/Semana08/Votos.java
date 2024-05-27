package Semana08;

import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {
        int celeste = 0, morado = 0, turquesa = 0, invalido = 0;
        char voto;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el voto de la persona " + i);
            System.out.println("[C] Celeste, [M] Morado, [T] Turquesa");
            voto = sc.next().toLowerCase().charAt(0);

            switch (voto) {
                case 'c' -> {
                    celeste++;
                }
                case 'm' -> {
                    morado++;
                }
                case 't' -> {
                    turquesa++;
                }
                default -> {
                    invalido++;
                }
            }

        }

        System.out.println("Votos para el color celeste: " + celeste + " porcentaje: "
                + String.format("%5.2f", ((float) celeste / 10.0f) * 100) + "%");
        System.out.println("Votos para el color morado: " + morado + " porcentaje: "
                + String.format("%5.2f", ((float) morado / 10.0f) * 100) + "%");
        System.out.println("Votos para el color turquesa: " + turquesa + " porcentaje: "
                + String.format("%5.2f", ((float) turquesa / 10.0f) * 100) + "%");
        System.out.println("Votos inválidos: " + invalido + " porcentaje: "
                + String.format("%5.2f", ((float) invalido / 10.0f) * 100) + "%");

        if (celeste > morado && celeste > turquesa)
            System.out.println("Color elegido " + celeste);
        if (morado > celeste && morado > turquesa)
            System.out.println("Color elegido " + morado);
        if (turquesa > morado && turquesa > celeste)
            System.out.println("Color elegido " + turquesa);
        sc.close();
    }

}
