package Semana03;

import java.util.Scanner;

public class SalarioFuncionario2 {
    public static void main(String[] args) {
        char sexo; // M: Masculino, F: Femenino
        char sector; // S: Salud, E: Educación, T: Transporte
        double salario = 0;

        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Ingresar el sexo del funcionario: ");
        System.out.println("M: Masculino, F: Femenino");
        sexo = lecturaDatos.next().charAt(0);
        if (sexo != 'M' & sexo != 'F') {
            System.out.println("Sexo incorrecto: Ingresar M: Masculino o F: Femenino. Vuelva a intentar.");
        } else {
            System.out.println("Ingresar el sector del funcionario: ");
            System.out.println("S: Salud, E: Educación, T: Transporte");
            sector = lecturaDatos.next().charAt(0);
            if (sector != 'S' & sector != 'E' & sector != 'T') {
                System.out.println(
                        "Sector incorrecto: Ingresar S: Salud, E: Educación, T: Transporte. Vuelva a intentar.");
            } else {
                if (sexo == 'M') { // Masculino
                    if (sector == 'S') { // Sector Salud
                        salario = 15000 * (1 + 0.2);
                    } else if (sector == 'E') { // Sector Educación
                        salario = 12000 * (1 + 0.11);
                    } else if (sector == 'T') { // Sector Transporte
                        salario = 18000 * (1 + 0.15);
                    }
                } else if (sexo == 'F') {
                    if (sector == 'S') { // Sector Salud
                        salario = 15000 * (1 + 0.25);
                    } else if (sector == 'E') { // Sector Educación
                        salario = 12000 * (1 + 0.12);
                    } else if (sector == 'T') { // Sector Transporte
                        salario = 18000 * (1 + 0.20);
                    }
                }
                System.out.println("Su nuevo salario será: " + salario);
            }
        }
        lecturaDatos.close();
    }
}
