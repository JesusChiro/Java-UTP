package Semana08;

import java.util.Scanner;
import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el mes y el año
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        // Ajustar el mes para la clase Calendar (0-11)
        mes -= 1;

        // Crear una instancia de Calendar
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.MONTH, mes);
        calendario.set(Calendar.YEAR, año);
        calendario.set(Calendar.DAY_OF_MONTH, 1);

        // Obtener el día de la semana del primer día del mes
        int primerDiaDeLaSemana = calendario.get(Calendar.DAY_OF_WEEK);
        // Obtener el número de días en el mes
        int diasEnMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Imprimir el encabezado del calendario
        System.out.println("Dom Lun Mar Mie Jue Vie Sab");

        // Ajustar la posición inicial
        for (int i = 1; i < primerDiaDeLaSemana; i++) {
            System.out.print("    ");
        }

        // Imprimir los días del mes
        for (int dia = 1; dia <= diasEnMes; dia++) {
            System.out.printf("%3d ", dia);

            // Saltar a la siguiente línea después de sábado
            if ((dia + primerDiaDeLaSemana - 1) % 7 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}

