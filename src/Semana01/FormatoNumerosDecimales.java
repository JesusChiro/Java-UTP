package Semana01;

public class FormatoNumerosDecimales {

    public static void main(String[] args) {
        double numero = 1234.56789;

        // Formateo básico
        System.out.print("Número sin formato: ");
        System.out.print(numero);
        System.out.println();

        // Formateo con dos decimales
        System.out.print("Número con dos decimales: ");
        System.out.printf("%.2f", numero);
        System.out.println();

        // Formateo con tres decimales
        System.out.print("Número con tres decimales: ");
        System.out.printf("%.3f", numero);
        System.out.println();

        // Formateo en notación científica
        System.out.print("Número en notación científica: ");
        System.out.printf("%.2e", numero);
        System.out.println();

        // Formateo con un ancho específico
        System.out.print("Número con ancho específico: ");
        System.out.printf("%10.2f", numero);
        System.out.println();

        // Formateo alineado a la izquierda
        System.out.print("Número alineado a la izquierda: ");
        System.out.printf("%-10.2f", numero);
        System.out.println();
    }
}