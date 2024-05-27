package Semana04;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del estudiante (entre 0 y 10):");
        int nota = scanner.nextInt();

        String resultado;

        if (nota >= 0 && nota <= 2) {
            resultado = "Necesita reforzamiento";
        } else if (nota >= 3 && nota <= 4) {
            resultado = "Desaprobado";
        } else if (nota >= 5 && nota <= 7) {
            resultado = "Aprobado";
        } else if (nota >= 8 && nota <= 9) {
            resultado = "Excelente";
        } else if (nota == 10) {
            resultado = "Becado";
        } else {
            resultado = "Nota no válida";
        }

        System.out.println("El resultado para la nota " + nota + " es: " + resultado);

        scanner.close();
    }
}
