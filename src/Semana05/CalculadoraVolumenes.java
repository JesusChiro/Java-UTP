package Semana05;

import java.util.Scanner;

public class CalculadoraVolumenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura para calcular el volumen:");
        System.out.println("1. Esfera");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma hexagonal (hexaedro)");
        System.out.println("4. Cubo");
        System.out.println("5. Cono");
        System.out.print("Ingrese el número correspondiente a la figura: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio de la esfera: ");
                double radioEsfera = scanner.nextDouble();
                resultado = calcularVolumenEsfera(radioEsfera);
                break;
            case 2:
                System.out.print("Ingrese el radio del cilindro: ");
                double radioCilindro = scanner.nextDouble();
                System.out.print("Ingrese la altura del cilindro: ");
                double alturaCilindro = scanner.nextDouble();
                resultado = calcularVolumenCilindro(radioCilindro, alturaCilindro);
                break;
            case 3:
                System.out.print("Ingrese el lado del prisma hexagonal: ");
                double ladoPrisma = scanner.nextDouble();
                System.out.print("Ingrese la altura del prisma hexagonal: ");
                double alturaPrisma = scanner.nextDouble();
                resultado = calcularVolumenPrismaHexagonal(ladoPrisma, alturaPrisma);
                break;
            case 4:
                System.out.print("Ingrese la longitud de un lado del cubo: ");
                double ladoCubo = scanner.nextDouble();
                resultado = calcularVolumenCubo(ladoCubo);
                break;
            case 5:
                System.out.print("Ingrese el radio de la base del cono: ");
                double radioCono = scanner.nextDouble();
                System.out.print("Ingrese la altura del cono: ");
                double alturaCono = scanner.nextDouble();
                resultado = calcularVolumenCono(radioCono, alturaCono);
                break;
            default:
                System.out.println("Opción inválida");
        }

        System.out.println("El volumen de la figura seleccionada es: " + resultado);
        scanner.close();
    }

    public static double calcularVolumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public static double calcularVolumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public static double calcularVolumenPrismaHexagonal(double lado, double altura) {
        return 3 * Math.sqrt(3) * Math.pow(lado, 2) * altura / 2;
    }

    public static double calcularVolumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    public static double calcularVolumenCono(double radio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    }
    
}

