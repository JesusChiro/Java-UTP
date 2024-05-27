package Semana04;

/*
Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si este se le asigna como un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo con la siguiente tabla:
    Tiempo |    Utilidad
    Menos de 1 año. |     5% del salario
    1 año o más y menos de 2 años. |    7% del salario
    2 años o más y menos de 5 años. |    10% del salario
    5 años o más y menos de 10 años. |    15% del salario
    10 años o más. |    20% del salario
 */

import java.util.Scanner;

public class CalculoUtilidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el salario mensual y la antigüedad en años
        System.out.print("Ingrese el salario mensual del trabajador: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingrese la antigüedad en años del trabajador: ");
        int antiguedad = scanner.nextInt();

        // Calcular la utilidad según la antigüedad
        double utilidad = 0;

        if (antiguedad < 1) {
            utilidad = salario * 0.05;
        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salario * 0.07;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salario * 0.10;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salario * 0.15;
        } else {
            utilidad = salario * 0.20;
        }

        // Mostrar la utilidad al usuario
        System.out.println("La utilidad del trabajador es: " + utilidad);

        scanner.close();
    }
}
