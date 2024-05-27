package Semana03;

import java.util.Scanner;

public class Descuento2 {
    public static void main(String[] args) {
        double unidadesCompradas = 0;
        double precioUnitario = 0;
        double totalCompra = 0;
        boolean tieneDescuento = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese las unidades compradas:");
        if (sc.hasNextDouble()) {
            unidadesCompradas = sc.nextDouble();
        } else {
            sc.nextLine();
            System.out.println("Debe ingresar un número.");
        }

        System.out.println("Por favor ingrese el precio unitario:");
        precioUnitario = sc.nextDouble();

        totalCompra = unidadesCompradas * precioUnitario;
        tieneDescuento = (unidadesCompradas > 5) || (totalCompra > 2000.0);

        if (tieneDescuento) {
            System.out.println("Enhorabuena!!! Tienes un descuento de 10%.");
        } else {
            System.out.println("Gracias por su compra.");
        }

        sc.close();
    }
}
