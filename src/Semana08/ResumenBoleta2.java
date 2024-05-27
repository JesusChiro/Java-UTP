package Semana08;

import java.util.Scanner;

public class ResumenBoleta2 {
    public static void main(String[] args) {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Opción 1: Ingresar nombre y tipo de empleado");
            System.out.println("Opción 2: Ingresar salario, boletas emitidas y mes en curso");
            System.out.println("Opción 3: Generar reporte ASCII");
            System.out.println("Opción 4: Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el tipo de empleado (C: Contratado, N: Nombrado): ");
                    char tipo = scanner.next().charAt(0);
                    System.out.println("Nombre: " + nombre + ", Tipo: " + (tipo == 'C' ? "Contratado" : "Nombrado"));
                    break;
                case 2:
                    System.out.print("Ingrese el salario mensual: ");
                    double salario = scanner.nextDouble();
                    System.out.print("Ingrese el número de boletas emitidas: ");
                    int boletasEmitidas = scanner.nextInt();
                    System.out.print("Ingrese el mes en curso (Ej: 1 para enero, 12 para diciembre): ");
                    int mes = scanner.nextInt();
                    System.out.println("Salario: S/. " + salario + ", Boletas emitidas: " + boletasEmitidas + ", Mes: " + mes);
                    break;
                case 3:
                    System.out.println("################################");
                    System.out.println("# RESUMEN DE BOLETAS DE PAGO   #");
                    System.out.println("################################");
                    System.out.println("# Empleado: JUAN ALBERTO RODRIGUEZ CACERES #");
                    System.out.println("# Tipo: [X] Contratado [ ] Nombrado        #");
                    System.out.println("################################");
                    System.out.println("# Datos del Salario       Boleta           #");
                    System.out.println("# Salario ENE: S/. 1000   SI               #");
                    System.out.println("# Salario FEB: S/. 1000   SI               #");
                    System.out.println("# Salario MAR: S/. 1000   SI               #");
                    System.out.println("# Salario ABR: S/. 1000   NO               #");
                    System.out.println("################################");
                    System.out.println("# Boletas emitidas: 3     Boletas Restantes: 1#");
                    System.out.println("# Monto Total Deudado: S/. 4000            #");
                    System.out.println("################################");
                    break;
                case 4:
                    System.out.println("Gracias por su visita!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }while(opcion != 4);
        scanner.close();
    }
}