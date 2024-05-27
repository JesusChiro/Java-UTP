package Semana04;

import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Menú:");
        System.out.println("1. Saludar");
        System.out.println("2. Despedirse");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Hola, ¡bienvenido!");
                break;
            case 2:
                System.out.println("Adiós, ¡que tengas un buen día!");
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }

        scanner.close();
    }
}

