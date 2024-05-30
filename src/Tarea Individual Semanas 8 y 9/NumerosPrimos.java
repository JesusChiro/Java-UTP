import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        // Resolver un problema que utilice anidamiento entre estructuras condicionales
        // y repetitivas.
        Scanner sc = new Scanner(System.in);
        int inicio = 0, fin = 0;
        // Validación de entrada para el número inicial del rango
        while (true) {
            System.out.print("Ingrese el número inicial del rango: ");
            if (sc.hasNextInt()) {
                inicio = sc.nextInt();
                break;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                sc.next(); // Limpiar entrada incorrecta
            }
        }
        // Validación de entrada para el número final del rango
        while (true) {
            System.out.print("Ingrese el número final del rango: ");
            if (sc.hasNextInt()) {
                fin = sc.nextInt();
                if (fin >= inicio) {
                    break;
                } else {
                    System.out.println("El número final debe ser mayor o igual al número inicial.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                sc.next(); // Limpiar entrada incorrecta
            }
        }
        int contadorPrimos = 0;
        // Estructura repetitiva para recorrer el rango de números
        for (int num = inicio; num <= fin; num++) {
            if (num > 1) { // Los números menores o iguales a 1 no son primos
                boolean esPrimo = true;
                // Estructura repetitiva anidada para verificar si un número es primo
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println(num + " es primo.");
                    contadorPrimos++;
                } else {
                    System.out.println(num + " no es primo.");
                }
            } else {
                System.out.println(num + " no es primo.");
            }
        }
        System.out.println("Cantidad de números primos en el rango: " + contadorPrimos);
        sc.close();
    }
}
