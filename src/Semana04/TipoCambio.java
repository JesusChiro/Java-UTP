package Semana04;

import java.util.Scanner;

public class TipoCambio {
    public static void main(String[] args) {
        String monedaOrigen;
        String monedaDestino;
        double monto;
        double montoSoles;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la moneda origen: ");
        System.out.println("(USD) Dólares, (EUR) Euros, (PEN) Soles");
        monedaOrigen = sc.nextLine();
        System.out.println("Ingrese el importe a convertir: ");
        monto = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la moneda destino: ");
        System.out.println("(USD) Dólares, (EUR) Euros, (PEN) Soles");
        monedaDestino = sc.nextLine();

        switch (monedaDestino) {
            case "USD":
                if (monedaOrigen.equals("EUR")) {
                    montoSoles = monto * 4.17;
                    monto = montoSoles / 3.82;
                } else if (monedaOrigen.equals("PEN")) {
                    monto = monto / 3.82;
                } else {
                    System.out.println("No se reconoce la moneda origen. Vuelva a intentar!!");
                }
                break;
            case "EUR":
                if (monedaOrigen.equals("USD")) {
                    montoSoles = monto * 3.82;
                    monto = montoSoles / 4.17;
                } else if (monedaOrigen.equals("PEN")) {
                    monto = monto / 4.17;
                } else {
                    System.out.println("No se reconoce la moneda origen. Vuelva a intentar!!");
                }
                break;
            case "PEN":
                if (monedaOrigen.equals("USD")) {
                    monto = monto * 3.82;
                } else if (monedaOrigen.equals("EUR")) {
                    monto = monto * 4.17;
                } else {
                    System.out.println("No se reconoce la moneda origen. Vuelva a intentar!!");
                }
                break;
            default:
                System.out.println("No se reconoce la moneda destino. Vuelva a intentar!!");
        }
        sc.close();
    }
}
