package Semana03;

import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        double salario = 0.0f;
        char sexo;
        String sector;

        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Ingrese el sector: ");
        sector = lecturaDatos.nextLine();

        System.out.println("Ingrese el sexo (M: Masculino,F:Femenino: ");
        sexo = lecturaDatos.next().charAt(0);

        if (sector.equals("Salud")) {
            if (sexo == 'M') {
                salario = 15000 * (1 + 0.2);
            } else if (sexo == 'F') {
                salario = 15000 * (1 + 0.25);
            } else {
                salario = -1;
            }
        } else if (sector.equals("Educacion")) {
            if (sexo == 'M') {
                salario = 12000 * (1 + 0.11);
            } else if (sexo == 'F') {
                salario = 12000 * (1 + 0.12);
            } else {
                salario = -1;
            }
        } else if (sector.equals("Transporte")) {
            if (sexo == 'M') {
                salario = 18000 * (1 + 0.15);
            } else if (sexo == 'F') {
                salario = 18000 * (1 + 0.20);
            } else {
                salario = -1;
            }
        }

        if (salario == -1.0) {
            System.out.println("Datos incorrectos!!!");
        } else {
            System.out.println("Su nuevo salario sería " + salario);
        }

        lecturaDatos.close();
    }
}
