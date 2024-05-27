package Semana04;

import java.util.Scanner;

public class EvaluacionCandidato {
    public static void main(String[] args) {
        int puntos;
        Scanner datos = new Scanner(System.in);
        System.out.print("Ingrese Puntaje de Candidato: ");
        puntos = datos.nextInt();
        switch (puntos) {
            case 0, 1, 2, 3, 4:
                System.out.print("DESCARTADO");
                break;
            case 5:
                System.out.print("EN SUSPENSO");
                break;
            case 6:
                System.out.print("ACEPTABLE");
                break;
            case 7, 8:
                System.out.print("NOTABLE");
                break;
            case 9, 10:
                System.out.print("SOBRESALIENTE");
                break;
            default:
                System.out.print("No es un puntaje válido.");

        }

        datos.close();
    }
}