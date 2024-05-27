package Semana03;

import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100); // Generar número aleatorio entre 0 y 99
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Intenta adivinar el número secreto (entre 0 y 99).");

        while (!adivinado) {
            System.out.println("Ingrese su intento:");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroAleatorio) {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            } else if (intento < numeroAleatorio) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
        }

        scanner.close();
    }
}
