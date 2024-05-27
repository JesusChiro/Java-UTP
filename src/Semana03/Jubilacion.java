package Semana03;

import java.util.Scanner;

public class Jubilacion {
    public static void main(String[] args) {
        int edad = 0;
        char sexo = 'F';

        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Ingrese el sexo (M=Masculino,F=Femenino):");
        sexo = leerDatos.next().charAt(0);
        if (sexo == 'm') {
            sexo = 'M';
        }

        System.out.println("Ingrese la edad:");
        edad = leerDatos.nextInt();

        if (sexo == 'M') { // Si es Masculino
            if (edad >= 65) {
                System.out.println("Podría jubilarse!!!");
            } else {
                System.out.println("Todavía no puede jubilarse!!!");
            }
        } else if (sexo == 'F') { // Femenino
            if (edad >= 60) {
                System.out.println("Podría jubilarse!!!");
            } else {
                System.out.println("Todavía no puede jubilarse!!!");
            }
        } else {
            System.out.println("Datos incorrectos!!!");
        }
        leerDatos.close();
    }
}
