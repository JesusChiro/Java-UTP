package Semana02;

import java.util.Scanner;

public class ScannerEjemplo1 {
    public static void main(String[] args) {
        int edad;
        System.out.println("Ingrese su edad: ");
        Scanner lector = new Scanner(System.in);
        // edad = lector.nextInt();
        // System.out.println("Usted tiene " + edad + " años");

        if (lector.hasNextInt()) {
            edad = lector.nextInt();
            lector.nextLine();
            System.out.println("Usted tiene " + edad + " años");
        } else {
            System.out.println("Por favor ingrese su edad.");
        }
        lector.close();
    }
}
