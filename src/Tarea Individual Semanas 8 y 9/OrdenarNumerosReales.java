import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumerosReales {
    // Resolver un problema que solicite datos reales al usuario, los almacene en un
    // arreglo y le permita ordenarlos de forma ascendente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        // Validación de entrada para asegurarse de que sea un número entero
        while (true) {
            System.out.print("Ingrese la cantidad de números reales: ");
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
        double[] numeros = new double[n];
        // Solicitar los números reales al usuario con validación
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Ingrese un número real: ");
                if (sc.hasNextDouble()) {
                    numeros[i] = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Entrada no válida. Por favor, ingrese un número real.");
                    sc.next(); // Limpiar entrada incorrecta
                }
            }
        }
        // Ordenar el arreglo de números reales en orden ascendente
        Arrays.sort(numeros);
        // Mostrar los números ordenados
        System.out.println("Lista de números ordenados de forma ascendente:");
        for (double numero : numeros) {
            System.out.println(numero);
        }
        sc.close();
    }
}
