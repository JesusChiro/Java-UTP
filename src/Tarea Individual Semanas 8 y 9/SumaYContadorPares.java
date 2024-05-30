import java.util.Scanner;

public class SumaYContadorPares {
    public static void main(String[] args) {
        // Resolver un problema que utilice una estructura for con un contador adicional
        // y un acumulador​.
        Scanner sc = new Scanner(System.in);
        int n = 0;
        // Validación de entrada para asegurarse de que sea un número entero
        while (true) {
            System.out.print("Ingrese un número entero n: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese un número entero positivo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                sc.next(); // Limpiar entrada incorrecta
            }
        }
        int suma = 0;
        int contadorPares = 0;
        // Estructura for con contador adicional y acumulador
        for (int i = 1; i <= n; i++) {
            suma += i; // Acumulador
            if (i % 2 == 0)
                contadorPares++; // Contador adicional
        }
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
        System.out.println(
                "La cantidad de números pares en los primeros " + n + " números naturales es: " + contadorPares);
        sc.close();
    }
}
