package Semana04;

import java.util.Scanner;

public class ConversionMonedas {
    public static void main(String[] args) {

        int moneda;
        int monto;
        double soles;
 
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar el tipo de moneda D(dolares), E (euros):");
        moneda = sc.next().charAt(0);

        System.out.println("Ingresar monto");
        monto = sc.nextInt();

        switch (moneda) {
            case 'D':
                soles = 3.82 * monto;
                System.out.println("Sus $ " + monto + " al cambio en soles es: S/. " + soles);
                break;

            case 'E':
                soles = 4.17 * monto;
                System.out.println("Sus € " + monto + " al cambio en soles es: S/. " + soles);
                break;
            default:
                System.out.println("No existe tal moneda");
        }
        sc.close();
    }

}
