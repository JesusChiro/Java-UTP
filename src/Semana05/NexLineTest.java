package Semana05;

import java.util.Scanner;

public class NexLineTest {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu romedio de notas:");
        double num = leer.nextDouble();
        System.out.println("Ingrese un nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese un entero:");
        int a = leer.nextInt();
        System.out.println("Hola:" + nombre + "Tu promedio es: " + num + "y tu edad es: " + a);
        leer.close();
    }

}
