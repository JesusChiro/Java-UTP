package Semana03;

import java.util.Scanner;

public class ProgresionAritmetica2 {
    public static void main(String[] args) {
        int n1, n2, n3;
        boolean esProgresionAritmetica = false;

        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        n1 = leerDatos.nextInt();
        System.out.println("Ingrese el segundo número: ");
        n2 = leerDatos.nextInt();
        System.out.println("Ingrese el tercer número: ");
        n3 = leerDatos.nextInt();

        esProgresionAritmetica = ((n2 - n1) == (n3 - n2));  // check
        if (esProgresionAritmetica) {
            System.out.println("Los números se encuentran en progresión aritmética.");
            System.out.println("La diferencia común es: " + (n3 - n2));
        } else {
            System.out.println("Los números no se encuentran en progresión aritmética.");
        }

        leerDatos.close();
    }
}
