package Semana06;

import java.util.Scanner;

public class ClaveAcceso {
    public static void main(String[] args) {
        int intentos = 0;    // Contador
        boolean acceso = false;   // Centinela
        String claveAcceso = "";

        Scanner sc = new Scanner(System.in);

        while (!acceso) {
            System.out.println("Ingrese su clave de acceso:");
            claveAcceso = sc.nextLine();
            acceso = claveAcceso.equals("P@55w0rd");

            intentos++;
            if (!acceso) {
                if (intentos >= 5) break;
                else System.out.println("Acceso denegado! Intente nuevamente.");
            }
        }
        if (acceso)
            System.out.println("Bienvenido al sistema.");
        else
            System.out.println("Cuenta Suspendida!");

        sc.close();
    }
}
