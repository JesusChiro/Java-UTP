package Semana07;

import java.util.Scanner;
import java.util.Random;

public class PapelPiedraTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijeras"};

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijeras.");
        System.out.println("Ingresa tu elección (piedra, papel o tijeras) o 'salir' para terminar el juego.");

        int victoriasUsuario = 0;
        int victoriasComputadora = 0;

        do {
            System.out.print("Tu elección: ");
            String eleccionUsuario = scanner.nextLine().toLowerCase();

            if (eleccionUsuario.equals("salir")) {
                break;
            }

            if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijeras")) {
                System.out.println("Por favor, ingresa una opción válida.");
                continue;
            }

            int indiceComputadora = random.nextInt(3);
            String eleccionComputadora = opciones[indiceComputadora];

            System.out.println("La computadora eligió: " + eleccionComputadora);

            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("¡Empate!");
            } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijeras")) ||
                    (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                    (eleccionUsuario.equals("tijeras") && eleccionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste!");
                victoriasUsuario++;
            } else {
                System.out.println("¡Perdiste!");
                victoriasComputadora++;
            }

            System.out.println("Estadísticas: Jugador - " + victoriasUsuario + ", Computadora - " + victoriasComputadora);

        } while (true);

        System.out.println("Gracias por jugar.");
        scanner.close();
    }
}
