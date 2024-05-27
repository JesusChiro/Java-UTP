package Semana05;

import java.util.Scanner;

public class PlanTarifario {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcionMarca;
        int opcionPlazo;
        double planTarifario = 0,
                porcentageDescuento = 0,
                montoDescuento;

        System.out.printf("Marcas de celular disponibles:\n" +
                "[1] Motorola\n" +
                "[2] LG\n" +
                "[3] Samsung\n" +
                "[4] Huawei\n" +
                "[5] iPhone\nIngrese una opción: ");
        opcionMarca = lector.nextInt();

//        switch (opcionMarca) {
//            case 1: planTarifario = 29.90; break;
//            case 2: planTarifario = 36.00; break;
//            case 3: planTarifario = 46.80; break;
//            case 4: planTarifario = 62.00; break;
//            case 5: planTarifario = 71.00; break;
//            default: System.out.println("Opción de celular incorrecta");
//                break;
//        }

        planTarifario = switch (opcionMarca) {
            case 1 -> 29.90;
            case 2 -> 36.00;
            case 3 -> 46.80;
            case 4 -> 62.00;
            case 5 -> 71.00;
            default -> -1.00;
        };

        if (opcionMarca >= 1 && opcionMarca <= 5) {
            System.out.printf("\nPlazos de pago:\n" +
                    "[1] A 06 meses\n" +
                    "[2] A 12 meses\n" +
                    "[3] A 18 meses\nIngrese una opción: ");
            opcionPlazo = lector.nextInt();

//            switch (opcionPlazo) {
//                case 1: porcentageDescuento = 13.2; break;
//                case 2: porcentageDescuento = 12.0; break;
//                case 3: porcentageDescuento = 11.2; break;
//                default: System.out.printf("Opción de plazo incorrecto.");
//                    break;
//            }

            porcentageDescuento = switch (opcionPlazo) {
                case 1 -> 13.2;
                case 2 -> 12.0;
                case 3 -> 11.2;
                default -> -1.00;
            };

            if (opcionPlazo >= 1 && opcionPlazo <= 3) {
                montoDescuento = planTarifario * porcentageDescuento / 100.0;
                System.out.printf("\n%-25s : %8.2f\n%-25s : %8.2f\n" +
                                "%-25s : %8.2f\n%-25s : %8.2f",
                        "Plan tarifario", planTarifario,
                        "Porcentage de descuento", porcentageDescuento,
                        "Monto de descuento", montoDescuento,
                        "Pago final mensual", (planTarifario - montoDescuento));

            } else {
                System.out.printf("Opción de plazo incorrecto.");
            }
        } else {
            System.out.println("Opción de celular incorrecta.");
        }

        lector.close();
    }
}
