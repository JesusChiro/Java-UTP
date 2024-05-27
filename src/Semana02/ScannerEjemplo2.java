package Semana02;

import java.util.Scanner;

public class ScannerEjemplo2 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        byte numeroHijos;
        float talla;
        double ingresoAnual;
        boolean tieneSeguro;

        System.out.println("Solicitud de datos\n");

        System.out.print("Ingrese número de hijos: ");
        numeroHijos = lector.nextByte();
        lector.nextLine();

        System.out.print("Ingrese su talla (metros): ");
        talla = lector.nextFloat();
        lector.nextLine();

        System.out.print("Ingreso económico anual: ");
        ingresoAnual = lector.nextDouble();
        lector.nextLine();

        System.out.print("¿Tiene seguro? (true|false): ");
        tieneSeguro = lector.nextBoolean();
        lector.nextLine();

        System.out.println("\nResumen de datos ingresados: \n");
        System.out.printf("Número de hijos: %d \nTalla: %f \nIngresos: %f \nCon seguro: %b",
                numeroHijos, talla, ingresoAnual, tieneSeguro);
        lector.close();
    }

}