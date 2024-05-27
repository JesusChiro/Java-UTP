package Semana04;

import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {

        int Nota = 0;

        System.out.println("Ingrese nota (0-10): ");
        Scanner leer = new Scanner(System.in);
//        Nota = leer.nextInt();

        while (true) {
            System.out.print("Ingrese la nota del alumno: ");

            if (leer.hasNextInt()) {
                Nota = leer.nextInt();
                break;
            } else {
                System.out.println("Error: Debe ingresar un número entero.");
                leer.next();
            }
        }

        // Sentencia switch-case
        switch (Nota) {
            case 0, 1, 2:
                System.out.println("Necesita reforazamiento.");
                break;
            case 3, 4:
                if (Nota == 3) {
                    System.out.println("Desaprobado (3)");
                } else {
                    System.out.println("Desaprobado (4)");
                }
                break;
            case 5, 6, 7:
                System.out.println("Aprovado");
                break;
            case 8, 9:
                System.out.println("Excelente");
                break;
            case 10:
                System.out.println("Becado");
                break;
            default:
                System.out.println("Nota no es valida.");
        }

        leer.close();

    }
}
