package Semana03;

import java.util.Scanner;

public class OperadorCortocircuito {
    public static void main(String[] args) {
        int numA = 0;
        int numB = 0;
        boolean AesMultiploDeB;

        // Leer los datos de numA
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número A: ");
        numA = lector.nextInt();

        // Leer los datos de numB
        System.out.println("Ingrese el número B: ");
        numB = lector.nextInt();

        // Condición para determinar si numA es múltiplo de numB
        AesMultiploDeB = (numB > 0) && ((numA % numB) == 0); // Se usa el operador Y de cortociruito para evitar error de División por cero
        if (AesMultiploDeB) {
            System.out.println("El número " + numA + " es múltiplo de " + numB + "."); // Si numA es múltiplo de numB
        } else {
            System.out.println("El número " + numA + " no es múltiplo de " + numB + "."); // Si numA NO es múltiplo de numB
        }

        lector.close(); // no olvidar cerrar el Scanner de datos
    }
}
