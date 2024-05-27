package Semana08;

import java.util.Scanner;

public class ResumenBoleta {
    public static void main(String[] args) {
        boolean tipoContratoValido = false;
        char tipoEmpleado='c'; // c: Contratado, n: Nombrado
        int opcion=0;
        int meses=1;                // Contador
        int mesActual=0;
        int numBoletas=-1;
        double salario=0;
        double salarioAnual=0;      // Acumulador
        double descuentoAnual=0;    // Acumulador
        String nombre="";
        String apellido="";
        String nomMes;              // Para nombrar los meses

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("#########################################");
            System.out.println("#           MENU DE OPCIONES            #");
            System.out.println("#########################################");
            System.out.printf("# %-38s#\n","1. Ingresar Empleado");
            System.out.printf("# %-38s#\n","2. Ingresar Salario Mensual");
            System.out.printf("# %-38s#\n","3. Ingresar Información de Boletas");
            System.out.printf("# %-38s#\n","4. Emitir Boleta");
            System.out.printf("# %-38s#\n","5. Resumen Boletas Emitidas");
            System.out.printf("# %-38s#\n","6. Salir");
            System.out.println("#########################################");
            System.out.println("Ingrese la opción:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1 -> // Ingresar Empleado
                {
                    System.out.println("Ingrese el nombre del empleado:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido del empleado:");
                    apellido = sc.nextLine();

                    do {
                        System.out.println("Ingrese el tipo de contrato:");
                        System.out.println("C: Contratado | N: Nombrado");
                        tipoEmpleado = sc.next().toLowerCase().charAt(0);
                        if(tipoEmpleado == 'c' || tipoEmpleado == 'n') tipoContratoValido = true;
                        else System.out.println("Dato inválido. Intente nuevamente.");
                    }while(!tipoContratoValido);

                }
                case 2 -> // Ingresar Salario Mensual
                {
                    salario=0;
                    do{
                        System.out.println("Ingrese el salario mensual en S/:");
                        if(sc.hasNextDouble()){
                            salario = sc.nextDouble();
                        } else {
                            System.out.println("Debe ingresar un número válido.");
                        }
                        sc.nextLine();
                    }while(salario <= 0);
                }

                case 3 -> // Leer datos de las boletas
                {
                    System.out.println("Ingrese el número de boletas emitidas:");
                    numBoletas = sc.nextInt();
                    System.out.println("Ingrese el mes actual [1-12]:");
                    mesActual = sc.nextInt();
                }
                case 4 -> // Emitir Boleta
                {
                    if(nombre.length()==0 && apellido.length()==0) {
                        System.out.println("Ingrese el nombre y apellido del empleado.");
                        break;
                    }

                    if(salario <= 0) {
                        System.out.println("Ingrese un salario válido para el empleado.");
                        break;
                    }

                    System.out.println("************************************************");
                    System.out.println("* RESUMEN DE BOLETAS DE PAGO                   *");
                    System.out.println("************************************************");
                    System.out.printf("* %-45s*\n","Nombre del empleado: " + nombre);
                    System.out.printf("* %-45s*\n","Apellido del empleado: " + apellido);
                    System.out.printf("* %-45s*\n","Tipo: Contratado");
                    System.out.println("************************************************");

                    meses = 1;
                    salarioAnual=0;      // Acumulador
                    descuentoAnual=0;    // Acumulador
                    while(meses<=12){
                        nomMes = switch (meses){
                            case 1 -> "Ene";
                            case 2 -> "Feb";
                            case 3 -> "Mar";
                            case 4 -> "Abr";
                            case 5 -> "May";
                            case 6 -> "Jun";
                            case 7 -> "Jul";
                            case 8 -> "Ago";
                            case 9 -> "Set";
                            case 10 -> "Oct";
                            case 11 -> "Nov";
                            case 12 -> "Dic";
                            default -> "";
                        };

                        if(meses % 2 == 0) {
                            System.out.printf("Salario %s: %8.2f *\n", nomMes, salario);
                        } else {
                            System.out.printf("* Salario %s: %8.2f\t ", nomMes, salario);
                        }

                        salarioAnual += salario;
                        descuentoAnual += (salario * 0.05); // Descuento de 5%

                        meses++;
                    }
                    System.out.println("************************************************");
                    System.out.printf("* %-45s*\n", String.format("Total: S/ %8.2f",salarioAnual));
                    System.out.printf("* %-45s*\n", String.format("Descuento: S/ %8.2f",descuentoAnual));
                    System.out.println("************************************************\n");
                }

                case 5 ->
                {
                    if(nombre.length()==0 && apellido.length()==0) {
                        System.out.println("Ingrese el nombre y apellido del empleado.");
                        break;
                    }

                    if(salario <= 0) {
                        System.out.println("Ingrese un salario válido para el empleado.");
                        break;
                    }

                    if(mesActual == 0 || numBoletas == -1) {
                        System.out.println("Ingrese los datos de las boletas.");
                        break;
                    }

                    System.out.println("************************************************");
                    System.out.println("* RESUMEN DE BOLETAS DE PAGO                   *");
                    System.out.println("************************************************");
                    System.out.printf("* %-45s*\n","Nombre del empleado: " + nombre + " " + apellido);
                    System.out.printf("* %-45s*\n","Tipo: " + (tipoEmpleado=='c'?"[X] Contratado  [ ] Nombrado":"[ ] Contratado  [X] Nombrado"));
                    System.out.println("************************************************");
                    System.out.printf("* %-35s%-10s*\n","Datos del Salario","Boleta");


                    salarioAnual=0;      // Acumulador
                    for(meses = 1;meses <= mesActual;meses++){
                        nomMes = switch (meses){
                            case 1 -> "Ene";
                            case 2 -> "Feb";
                            case 3 -> "Mar";
                            case 4 -> "Abr";
                            case 5 -> "May";
                            case 6 -> "Jun";
                            case 7 -> "Jul";
                            case 8 -> "Ago";
                            case 9 -> "Set";
                            case 10 -> "Oct";
                            case 11 -> "Nov";
                            case 12 -> "Dic";
                            default -> "";
                        };

                        System.out.printf("* %-35s", String.format("Salario %s: S/ %8.2f",nomMes, salario));

                        if(meses <= numBoletas) {
                            System.out.printf("%-10s*\n", "SI");
                        } else {
                            System.out.printf("%-10s*\n", "NO");
                        }

                        salarioAnual += salario;
                    }
                    System.out.println("************************************************");
                    System.out.printf("* %-45s*\n", String.format("Boletas Emitidas: %d Boletas Restantes: %d",numBoletas, (mesActual-numBoletas)));
                    System.out.printf("* %-45s*\n", String.format("Monto Total Pagado: S/ %8.2f",salarioAnual));
                    System.out.println("************************************************\n");
                }
                case 6 -> // Salir
                        System.out.println("Gracias por su visita!");
                default ->
                        System.out.println("Opción inválida. Intente nuevamente.");
            }

        }while(opcion != 6);    // Mientras la opción no sea salir

        sc.close();
    }

}
