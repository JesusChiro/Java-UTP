package Semana04;

import java.util.Scanner;

public class Calculadora {

    // Menu
    // Ingresar dos números double
    // Presentar el menu al usuario
    // 1. Sumar
    // 2. Restar
    // 3. Multiplicar
    // 4. Dividir
    // Mostrar resultado de la operación que el usuario a seleccionado
    // Usar switch

    public static void main(String[] args) {
        double numA, numB, res;
        int operacion = 0;
        Scanner leerDatos = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        numA = leerDatos.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        numB = leerDatos.nextDouble();

        System.out.println("Menú de Opciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("Ingrese la operación: ");
        operacion = leerDatos.nextInt();

        switch (operacion) {
            case 1:
                res = numA + numB;
                System.out.println("El resultado de la suma es: " + res);
                break;
            case 2:
                res = numA - numB;
                System.out.println("El resultado de la resta es: " + res);
                break;
            case 3:
                res = numA * numB;
                System.out.println("El resultado de la multiplicación es: " + res);
                break;
            case 4:
                if (numB != 0) {
                    res = numA / numB;
                    System.out.println("El resultado de la multiplicación es: " + res);
                } else {
                    System.out.println("El segundo número no debe ser cero.");
                }
                break;
            default:
                System.out.println("Operación no válida. Intente nuevamente.");
        }

        leerDatos.close();
    }

}
