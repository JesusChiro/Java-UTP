package Semana06;

import java.util.Scanner;

public class MenuWhile {
    public static void main(String[] args) {
        int opcion = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Menu de Opciones");
        System.out.println("----------------");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[5] Salir");

        while (opcion != 5) {
            System.out.println("Ingrese la opción de menu deseada:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println("Selecciono la operación de sumar.");
                case 2 -> System.out.println("Selecciono la operación de restar.");
                case 3 -> System.out.println("Selecciono la operación de multiplicar.");
                case 4 -> System.out.println("Selecciono la operación de dividir.");
                case 5 -> System.out.println("");
                default -> System.out.println("Opción Inválida.");
            }
        }

        System.out.println("Gracias por su visita.");
        sc.close();
    }
}
