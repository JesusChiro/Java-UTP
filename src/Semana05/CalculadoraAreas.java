package Semana05;

import java.util.Scanner;

public class CalculadoraAreas {
    public static void main(String[] args) {

        double base, altura, radio;
        String figura;
        Scanner lector = new Scanner(System.in);
        System.out.printf("Ingrese el nombre completo o las tres primeras letras de la figura para calcular su área:\n" +
                "- Cuadrado\n" +
                "- Rectángulo\n" +
                "- Triángulo\n" +
                "- Círculo\n");
        System.out.print("Figura elegida: ");
        figura = lector.nextLine().toLowerCase();  // toLowerCase() es para pasar a minúscula lo ingresado por el usuario

//        if (figura.equals("cuadrado") || figura.contains("cua")) {
//            System.out.print("Ingrese valor de lado: ");
//            base = lector.nextDouble();
//            System.out.println("Área del cuadrado: " + (base * base));
//        } else if (figura.equals("rectángulo") || figura.contains("rec")) {
//            System.out.print("Ingrese valor de base: ");
//            base = lector.nextDouble();
//            System.out.print("Ingrese valor de altura: ");
//            altura = lector.nextDouble();
//            System.out.println("Área del rectángulo: " + (base * altura));
//        } else if (figura.equals("triángulo") || figura.contains("tri")) {
//            System.out.print("Ingrese valor de base: ");
//            base = lector.nextDouble();
//            System.out.print("Ingrese valor de altura: ");
//            altura = lector.nextDouble();
//            System.out.println("Área del triángulo: " + (base * altura / 2));
//        } else if (figura.equals("círculo") || figura.contains("cír")) {
//            System.out.print("Ingrese valor de radio: ");
//            radio = lector.nextDouble();
//            System.out.println("Área del círculo: " + Math.PI * Math.pow(radio, 2));
//        } else {
//            System.out.println("Texto ingresado no es válida.");
//        }

        switch (figura) {
            case "cuadrado", "cua":
                System.out.print("Ingrese valor de lado: ");
                base = lector.nextDouble();
                System.out.println("Área del cuadrado: " + (base * base));
                break;
            case "rectángulo", "rec":
                System.out.print("Ingrese valor de base: ");
                base = lector.nextDouble();
                System.out.print("Ingrese valor de altura: ");
                altura = lector.nextDouble();
                System.out.println("Área del rectángulo: " + (base * altura));
                break;
            case "triángulo", "tri":
                System.out.print("Ingrese valor de base: ");
                base = lector.nextDouble();
                System.out.print("Ingrese valor de altura: ");
                altura = lector.nextDouble();
                System.out.println("Área del triángulo: " + (base * altura / 2));
                break;
            case "círculo", "cír":
                System.out.print("Ingrese valor de radio: ");
                radio = lector.nextDouble();
                System.out.printf("Área del círculo: %.2f", Math.PI * Math.pow(radio, 2));
                break;
            default:
                System.out.println("Texto ingresado no es válido.");
        }

        lector.close();
    }
}