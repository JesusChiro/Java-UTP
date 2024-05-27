package Semana02;

import java.util.Scanner;

public class BoletaVenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos del cliente
        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();

        // Datos del primer producto
        System.out.println("Ingrese el nombre del primer producto:");
        String nombreProducto1 = scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto:");
        double precioProducto1 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad comprada del primer producto:");
        int cantidadProducto1 = scanner.nextInt();

        // Consumir el salto de línea pendiente
        scanner.nextLine();

        // Datos del segundo producto
        System.out.println("Ingrese el nombre del segundo producto:");
        String nombreProducto2 = scanner.nextLine();
        System.out.println("Ingrese el precio del segundo producto:");
        double precioProducto2 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad comprada del segundo producto:");
        int cantidadProducto2 = scanner.nextInt();

        // Calculamos el total de cada producto
        double totalProducto1 = precioProducto1 * cantidadProducto1;
        double totalProducto2 = precioProducto2 * cantidadProducto2;

        // Calculamos el total de la compra
        double totalCompra = totalProducto1 + totalProducto2;

        // Imprimimos la boleta de venta
        System.out.println("\nBOLETA DE VENTA");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("\nDetalle de la compra:");
        System.out.println("Producto: " + nombreProducto1 + " - Precio: " + precioProducto1 + " - Cantidad: "
                + cantidadProducto1 + " - Total: " + totalProducto1);
        System.out.println("Producto: " + nombreProducto2 + " - Precio: " + precioProducto2 + " - Cantidad: "
                + cantidadProducto2 + " - Total: " + totalProducto2);
        System.out.println("Total de la compra: " + totalCompra);
        scanner.close();
    }
}
