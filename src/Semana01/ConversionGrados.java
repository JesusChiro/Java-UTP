package Semana01;

import java.util.Scanner;

public class ConversionGrados {
    public static void main(String[] args) {
        double gradosCentigrados = 35.33;
        double gradosFarenheit;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los grados centígrados:");
        gradosCentigrados = lectura.nextDouble();
        gradosFarenheit = (gradosCentigrados * 9 / 5) + 32;

        System.out.println(gradosCentigrados + " grados centigrados son equivalentes a " + gradosFarenheit + " grados Farenheit.");

        lectura.close();
    }
}
