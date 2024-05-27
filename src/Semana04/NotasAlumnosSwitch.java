package Semana04;

import java.util.Scanner;

public class NotasAlumnosSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del estudiante (entre 0 y 10):");
        int nota = scanner.nextInt();

        String resultado;

        switch (nota) {
            case 0, 1, 2:
                resultado = "Necesita Reforzamiento";
                break;
            case 3, 4:
                resultado = "Desaprobado";
                break;
            case 5, 6, 7:
                resultado = "Aprobado";
                break;
            case 8, 9:
                resultado = "Excelente";
                break;
            case 10:
                resultado = "Becado";
                break;
            default:
                resultado = "Nota no es válida";
        }

        System.out.println("El resultado para la nota " + nota + " es: " + resultado);

        scanner.close();
    }
}

