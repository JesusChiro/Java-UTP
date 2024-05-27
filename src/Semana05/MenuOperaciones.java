package Semana05;

import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        int opcionMenu;
        double num1, num2;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese una de las siguientes opciones:");
        System.out.println("[1] Suma");
        System.out.println("[2] Resta");
        System.out.println("[3] Multiplicación");
        System.out.println("[4] División");
        System.out.println("[5] Potencia");

        opcionMenu = lectura.nextInt();

        if (opcionMenu >= 1 & opcionMenu <= 5) {
            System.out.println("Ingrese el primer número:");
            num1 = lectura.nextDouble();
            System.out.println("Ingrese el segundo número:");
            num2 = lectura.nextDouble();

//            switch (opcionMenu) {
//                case 1: // Suma
//                    System.out.printf("La suma es: %.2f", suma(num1, num2));
//                    break;
//                case 2: // Resta
//                    System.out.printf("La resta es: %.2f", resta(num1, num2));
//                    break;
//                case 3: // Multiplicación
//                    System.out.printf("La multiplicación es: %.2f", multiplica(num1, num2));
//                    break;
//                case 4: // División
//                    System.out.printf("La división es: %.2f", divide(num1, num2));
//                    break;
//                case 5: // Potencia
//                    System.out.printf("La potencia es: %.2f", Math.pow(num1, num2));
//                    break;
//
//            }

            String operacion = "";
            double res = switch (opcionMenu) {
                case 1 -> // Suma
                {
                    operacion = "Suma";
                    yield suma(num1, num2);
                }
                case 2 -> // Resta
                {
                    operacion = "Resta";
                    yield resta(num1, num2);
                }
                case 3 -> // Multiplicación
                {
                    operacion = "Multiplicación";
                    yield multiplica(num1, num2);
                }
                case 4 -> // División
                {
                    operacion = "División";
                    yield divide(num1, num2);
                }
                case 5 -> // Potencia
                {
                    operacion = "Potencia";
                    yield Math.pow(num1, num2);
                }
                default -> -1;
            };

            if ((opcionMenu == 4 && res != 0) || (opcionMenu != 4))
                System.out.printf("La " + operacion + " es: %.2f", res);

        } else {
            System.out.println("Operación inválida. Intente nuevamente.");
        }

        lectura.close();
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        } else {
            return a / b;
        }
    }

}
