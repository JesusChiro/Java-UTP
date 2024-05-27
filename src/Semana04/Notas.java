package Semana04;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        int nota;
        String mensaje;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota:");
        nota = sc.nextInt();

        mensaje = switch (nota) {
            case 19, 20 -> "Excelente";
            case 16, 17, 18 -> "Bueno";
            case 13, 14, 15 -> "Regular";
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> "Deficiente";
            default -> "Inválido";
        };

        System.out.println("El resutlado de su evaluación es " + mensaje);
        sc.close();
    }
}
