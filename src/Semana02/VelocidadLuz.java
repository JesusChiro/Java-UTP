package Semana02;

import java.util.Scanner;

public class VelocidadLuz {
    public static void main(String[] args) {
        // Velocidad de la luz en metros por segundo
        final double VELOCIDAD_LUZ = 299792458.0;

        // Pedimos al usuario que ingrese el número de días
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de días: ");
        int dias = scanner.nextInt();

        // Calculamos el número total de segundos en N días
        long segundosEnDias = dias * 24 * 60 * 60;

        // Calculamos la distancia total recorrida por la luz en N días
        double distancia = VELOCIDAD_LUZ * segundosEnDias;

        // Mostramos el resultado
        System.out.println("La distancia que recorre la luz en " + dias + " días es: " + distancia + " metros.");
        scanner.close();
    }
}
