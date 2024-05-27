package Semana07;

import java.util.Scanner;

public class EjemploMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionó la opción 1.");
                    break;
                case 2:
                    System.out.println("Seleccionó la opción 2.");
                    break;
                case 3:
                    System.out.println("Seleccionó la opción 3.");
                    break;
                case 4:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
