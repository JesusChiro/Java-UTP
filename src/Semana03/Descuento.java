package Semana03;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        double unidadesCompradas = 0;
        double precioUnitario = 0;
        double totalCompra = 0;
        boolean condicionDescuento;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio unitario: ");
        if (sc.hasNextDouble()) {
            precioUnitario = sc.nextDouble();

            System.out.println("Ingrese las unidades compradas: ");
            if (sc.hasNextDouble()) {
                unidadesCompradas = sc.nextDouble();

                totalCompra = unidadesCompradas * precioUnitario;

                condicionDescuento = (unidadesCompradas > 5) || (totalCompra > 2000.0);
                if (condicionDescuento) {
                    totalCompra = totalCompra * 0.9;
                    //totalCompra *= 0.9;
                    System.out.println("Enhorabuena!!! Usted tiene un descuento de 10% y pagará " + totalCompra);
                } else
                    System.out.printf("Gracias por su compra, el total es: %.2f", totalCompra);

            } else {
                System.out.println("El valor ingresado no es un número.");
            }

        } else {
            System.out.println("El valor ingresado no es un número.");
        }

        sc.close();
    }
}
