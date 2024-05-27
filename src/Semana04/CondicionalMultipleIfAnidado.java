package Semana04;

import java.util.Scanner;

public class CondicionalMultipleIfAnidado {

    public static void main(String[] args) {
        int diaSemana = 0;

        System.out.println("Ingrese el día de la semana: ");
        Scanner leer = new Scanner(System.in);
        diaSemana = leer.nextInt();

        if (diaSemana == 1) {
            System.out.println("Lunes");
        } else {
            if (diaSemana == 2) {
                System.out.println("Martes");
            } else {
                if (diaSemana == 3) {
                    System.out.println("Miércoles");
                }
            }
        }

        leer.close();
    }

}
