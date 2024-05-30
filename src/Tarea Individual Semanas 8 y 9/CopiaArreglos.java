import java.util.Scanner;

public class CopiaArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de valores a almacenar: ");
        int n = sc.nextInt();
        int[] primerArreglo = new int[n];
        System.out.println("Ingrese los valores para el arreglo original:");
        for (int i = 0; i < n; i++) {
            primerArreglo[i] = sc.nextInt();
        }
        System.out.println("Arreglo original:");
        mostrarArreglo(primerArreglo);
        System.out.println("¿Desea copiar el arreglo de forma total o parcial? (1 - Total, 2 - Parcial): ");
        int opcion = sc.nextInt();
        int[] arregloCopiado;
        if (opcion == 1) {
            arregloCopiado = primerArreglo.clone(); // Copia total
        } else {
            System.out.print("Ingrese la cantidad de elementos a copiar: ");
            int m = sc.nextInt();
            arregloCopiado = new int[m];
            System.arraycopy(primerArreglo, 0, arregloCopiado, 0, m); // Copia parcial
        }
        System.out.println("Arreglo resultante:");
        mostrarArreglo(arregloCopiado);
        sc.close();
    }

    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}