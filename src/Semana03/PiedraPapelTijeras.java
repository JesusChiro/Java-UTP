package Semana03;

import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijeras!");
        System.out.println("Ingrese su elección (Piedra, Papel o Tijeras):");
        String eleccionUsuario = scanner.nextLine();

        // Generar elección aleatoria de la computadora
        int eleccionComputadora = (int) (Math.random() * 3); // 0: Piedra, 1: Papel, 2: Tijeras

        String eleccionComputadoraTexto;
        if (eleccionComputadora == 0) {
            eleccionComputadoraTexto = "Piedra";
        } else if (eleccionComputadora == 1) {
            eleccionComputadoraTexto = "Papel";
        } else {
            eleccionComputadoraTexto = "Tijeras";
        }

        System.out.println("La computadora elige: " + eleccionComputadoraTexto);

        // Determinar el resultado del juego
        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadoraTexto)) {
            System.out.println("¡Empate!");
        } else if ((eleccionUsuario.equalsIgnoreCase("Piedra") && eleccionComputadoraTexto.equals("Tijeras")) ||
                (eleccionUsuario.equalsIgnoreCase("Papel") && eleccionComputadoraTexto.equals("Piedra")) ||
                (eleccionUsuario.equalsIgnoreCase("Tijeras") && eleccionComputadoraTexto.equals("Papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }

        scanner.close();
    }
}
