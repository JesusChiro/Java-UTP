package Semana04;

import java.util.Scanner;

public class CondicionalMultipleIf2 {

    public static void main(String[] args) {
        int diaSemana = 0;

        System.out.println("Ingrese el día de la semana: ");
        Scanner leer = new Scanner(System.in);
        diaSemana = leer.nextInt();

        if (diaSemana == 1) {
            System.out.println("Lunes");
        } else if (diaSemana == 2) {
            System.out.println("Martes");
        } else if (diaSemana == 3) {
            System.out.println("Miércoles");
        } else if (diaSemana == 4) {
            System.out.println("Jueves");
        } else if (diaSemana == 5) {
            System.out.println("Viernes");
        } else if (diaSemana == 6) {
            System.out.println("Sábado");
        } else if (diaSemana == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Data incorrecto. Vuelva a intentar.");
        }

        leer.close();
    }

}
