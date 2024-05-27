package Semana06;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 0;
        int intentoUsuario = 0;

        System.out.println("Bienvenido al juego de adivinanza. Adivina el número secreto entre 1 y 100.");

        // Mientras el número de intentos sea menor a 10 y el usuario no haya adivinado, continuar el juego
        while (intentos < 10 && intentoUsuario != numeroSecreto) {
            System.out.print("Introduce tu adivinanza: ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! ¡Has adivinado el número secreto en " + intentos + " intentos!");
            }
        }

        if (intentos >= 10 && intentoUsuario != numeroSecreto) {
            System.out.println("Lo siento, has agotado tus intentos. El número secreto era " + numeroSecreto + ".");
        }

        scanner.close();
    }
}

