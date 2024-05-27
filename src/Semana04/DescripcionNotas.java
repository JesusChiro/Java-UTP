package Semana04;

import java.util.Scanner;

public class DescripcionNotas {
    public static void main(String[] args) {
        int nota = 0;

        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Ingrese su nota entre 0 a 10: ");
        nota = leerDatos.nextInt();

        switch (nota) {
            case 0, 1, 2:
                System.out.println("Necesita reforzamiento");
                break;
            case 3, 4:
                System.out.println("Desaprobado");
                break;
            case 5, 6, 7:
                System.out.println("Aprobado");
                break;
            case 8, 9:
                System.out.println("Excelente");
                break;
            case 10:
                System.out.println("Becado");
                break;
            default:
                System.out.println("Nota no es válida.");
        }

        leerDatos.close();

    }
}
