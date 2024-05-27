package Semana03;

import java.util.Scanner;

public class Jubilacion3 {
    public static void main(String[] args) {
        char sexo;
        int edad = 0;
        boolean tieneJubilacion;

        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Ingrese el sexo de la persona (M=Masculino, F=Femenino):");
        sexo = lecturaDatos.next().charAt(0);
        System.out.println("Ingrese la edad de la persona: ");
        if (lecturaDatos.hasNextInt()) {
            edad = lecturaDatos.nextInt();

            tieneJubilacion = (sexo == 'M' & edad >= 65) | (sexo == 'F' & edad >= 60);
            if (tieneJubilacion) {
                System.out.println("La persona puede jubilarse.");
            } else {
                System.out.println("La persona no puede jubilarse.");
            }

        } else {
            System.out.println("La edad debe ser un número, intente nuevamente.");
        }
        lecturaDatos.close();
    }
}
