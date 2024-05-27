package Semana08;

import java.util.Scanner;
class ResumenBoletaPago {
    private String nombre;
    private String tipoEmpleado;
    private double salarioMensual;
    private int numeroBoletas;
    private int mesEnCurso;
    private boolean datosIngresados = false;

    public static void main(String[] args) {
        ResumenBoletaPago empleadoReporte = new ResumenBoletaPago();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Ingresar nombre y tipo de empleado");
            System.out.println("2. Ingresar salario mensual, número de boletas emitidas y número de mes en curso");
            System.out.println("3. Elaborar reporte ASCII");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    empleadoReporte.ingresarDatosEmpleado(scanner);
                    break;
                case 2:
                    empleadoReporte.ingresarDatosFinancieros(scanner);
                    break;
                case 3:
                    empleadoReporte.elaborarReporte();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private void ingresarDatosEmpleado(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el tipo de empleado (contratado o nombrado): ");
        tipoEmpleado = scanner.nextLine();
        datosIngresados = true;
    }

    private void ingresarDatosFinancieros(Scanner scanner) {
        if (datosIngresados) {
            System.out.print("Ingrese el salario mensual: ");
            salarioMensual = scanner.nextDouble();
            System.out.print("Ingrese el número de boletas emitidas: ");
            numeroBoletas = scanner.nextInt();
            System.out.print("Ingrese el número de mes en curso: ");
            mesEnCurso = scanner.nextInt();
        } else {
            System.out.println("Primero debe ingresar los datos del empleado (Opción 1).");
        }
    }

    private void elaborarReporte() {
        if (datosIngresados && salarioMensual > 0 && numeroBoletas > 0 && mesEnCurso > 0) {
            String reporte = String.format(
                    "----------------------\n" +
                            "Reporte del Empleado\n" +
                            "----------------------\n" +
                            "Nombre: %s\n" +
                            "Tipo de Empleado: %s\n" +
                            "Salario Mensual: %.2f\n" +
                            "Número de Boletas Emitidas: %d\n" +
                            "Mes en Curso: %d\n",
                    nombre, tipoEmpleado, salarioMensual, numeroBoletas, mesEnCurso
            );
            System.out.println(reporte);
        } else {
            System.out.println("Debe ingresar todos los datos antes de generar el reporte.");
        }
    }
}
