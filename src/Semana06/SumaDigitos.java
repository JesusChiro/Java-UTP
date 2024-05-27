package Semana06;

import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        int numero, suma = 0, digito = 0;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero entre 1000 y 9999:"); // 1234
        numero = sc.nextInt();
        sc.nextLine();

        if (!(numero < 1000 || numero > 9999)) {   // (numero >= 1000 && numero <= 9999) == !(numero < 1000 || numero > 9999)
            while (!(numero <= 0)) { // (numero > 0) == !(numero <= 0)
                digito = (numero % 10);
                suma = suma + digito;  // suma += digito;
                numero /= 10; // numero = numero / 10;
                contador++;
                System.out.println("Contador: " + contador + " | Dígito: " + digito + " | Número: " + numero + " | Suma: " + suma);
            }
            System.out.println("La suma de los dígitos es: " + suma);
        } else {
            System.out.println("Número fuera de rango.");
        }
        sc.close();
    }
}
