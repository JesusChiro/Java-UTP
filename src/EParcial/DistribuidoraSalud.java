import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DistribuidoraSalud {

    public static void main(String[] args) {
        final int MAX_PEDIDOS = 30;
        int[] numeroPedido = new int[MAX_PEDIDOS];
        String[] cliente = new String[MAX_PEDIDOS];
        String[] direccion = new String[MAX_PEDIDOS];
        String[] estado = new String[MAX_PEDIDOS];
        int[] orden = new int[MAX_PEDIDOS];
        final String[] ESTADOS = {"Pendiente", "En Tránsito", "Entregado"};
        int pendientes = 0, enTransito = 0, entregados = 0;

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Menú Principal ***");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Cambiar prioridad");
            System.out.println("3. Reporte de entregas");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n*** Registrar Pedido ***");
                    int num = 0;
                    while (true) {
                        System.out.print("Número de pedido (entero de tres dígitos): ");
                        num = scanner.nextInt();
                        if (num >= 100 && num <= 999) {
                            boolean existe = false;
                            for (int i = 0; i < MAX_PEDIDOS; i++) {
                                if (numeroPedido[i] == num) {
                                    System.out.println("¡Error! El número de pedido ya existe.");
                                    existe = true;
                                    break;
                                }
                            }
                            if (!existe) break;
                        } else {
                            System.out.println("¡Error! El número de pedido debe ser un entero de tres dígitos.");
                        }
                    }
                    scanner.nextLine(); // Consume la nueva línea después de nextInt()

                    System.out.print("Cliente: ");
                    String cl = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String dir = scanner.nextLine();

                    String est;
                    while (true) {
                        System.out.println("Estado (Pendiente, En Tránsito, Entregado): ");
                        est = scanner.nextLine();
                        boolean estadoValido = false;
                        for (String e : ESTADOS) {
                            if (e.equalsIgnoreCase(est)) {
                                estadoValido = true;
                                break;
                            }
                        }
                        if (estadoValido) break;
                        else System.out.println("¡Error! Estado inválido.");
                    }

                    int ord = 0;
                    while (true) {
                        System.out.print("Orden (1-100): ");
                        ord = scanner.nextInt();
                        if (ord >= 1 && ord <= 100) break;
                        else System.out.println("¡Error! La orden debe estar en el rango de 1 a 100.");
                    }

                    // Almacenar los datos en los arreglos
                    for (int i = 0; i < MAX_PEDIDOS; i++) {
                        if (numeroPedido[i] == 0) {
                            numeroPedido[i] = num;
                            cliente[i] = cl;
                            direccion[i] = dir;
                            estado[i] = est;
                            orden[i] = ord;
                            break;
                        }
                    }

                    System.out.println("Pedido registrado correctamente.");
                    break;

                case 2:
                    int subopcion;

                    do {
                        System.out.println("\n*** Cambiar Prioridad ***");
                        System.out.println("1. Incrementar");
                        System.out.println("2. Disminuir");
                        System.out.println("3. Regresar al Menú principal");
                        System.out.print("Ingrese su opción: ");
                        subopcion = scanner.nextInt();

                        switch (subopcion) {
                            case 1:
                                System.out.print("Ingrese el número de pedido: ");
                                int numInc = scanner.nextInt();
                                for (int i = 0; i < MAX_PEDIDOS; i++) {
                                    if (numeroPedido[i] == numInc) {
                                        orden[i]++;
                                        System.out.println("Prioridad incrementada para el pedido " + numInc);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Ingrese el número de pedido: ");
                                int numDec = scanner.nextInt();
                                for (int i = 0; i < MAX_PEDIDOS; i++) {
                                    if (numeroPedido[i] == numDec) {
                                        orden[i]--;
                                        System.out.println("Prioridad disminuida para el pedido " + numDec);
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                                break;
                        }
                    } while (subopcion != 3);
                    break;

                case 3:
                    System.out.println("\n*** Reporte de Entregas ***");

                    if (numeroPedido[0] == 0) {
                        System.out.println("No hay datos registrados.");
                        break;
                    }

                    // Ordenar por orden de prioridad ascendente usando burbuja
                    for (int i = 0; i < MAX_PEDIDOS - 1; i++) {
                        for (int j = 0; j < MAX_PEDIDOS - i - 1; j++) {
                            if (orden[j] > orden[j + 1]) {
                                int temp = orden[j];
                                orden[j] = orden[j + 1];
                                orden[j + 1] = temp;

                                temp = numeroPedido[j];
                                numeroPedido[j] = numeroPedido[j + 1];
                                numeroPedido[j + 1] = temp;

                                String tempStr = cliente[j];
                                cliente[j] = cliente[j + 1];
                                cliente[j + 1] = tempStr;

                                tempStr = direccion[j];
                                direccion[j] = direccion[j + 1];
                                direccion[j + 1] = tempStr;

                                tempStr = estado[j];
                                estado[j] = estado[j + 1];
                                estado[j + 1] = tempStr;
                            }
                        }
                    }

                    // Generar la fecha actual
                    Date fechaActual = new Date();
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("MM/dd/yyyy");
                    String fecha = formatoFecha.format(fechaActual);

                    // Mostrar el reporte
                    System.out.println("\n# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #");
                    System.out.println("Distribuidora Salud para Todos S.A.C.");
                    System.out.println("www.saludparatodos123456.com.pe");
                    System.out.println("Lima - Perú");
                    System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #");
                    System.out.println("\nENTREGAS DEL " + fecha + "\n");
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("#         Cliente                 Dirección                 Estado          Orden");
                    System.out.println("------------------------------------------------------------------------");

                    for (int i = 0; i < MAX_PEDIDOS; i++) {
                        if (numeroPedido[i] != 0) {
                            System.out.printf("%-5d %-20s %-25s %-15s %-5d\n", numeroPedido[i], cliente[i], direccion[i], estado[i], orden[i]);

                            // Contar los pedidos por estado
                            switch (estado[i]) {
                                case "Pendiente":
                                    pendientes++;
                                    break;
                                case "En Tránsito":
                                    enTransito++;
                                    break;
                                case "Entregado":
                                    entregados++;
                                    break;
                            }
                        }
                    }

                    // Calcular y mostrar el resumen
                    System.out.println("\n# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #");
                    System.out.println("RESUMEN:");
                    System.out.println("Pedidos pendientes:         " + pendientes + "          " + String.format("%.2f", (double) pendientes / MAX_PEDIDOS * 100) + "%");
                    System.out.println("Pedidos en tránsito:          " + enTransito + "            " + String.format("%.2f", (double) enTransito / MAX_PEDIDOS * 100) + "%");
                    System.out.println("Pedidos entregados:         " + entregados + "          " + String.format("%.2f", (double) entregados / MAX_PEDIDOS * 100) + "%");
                    System.out.println("# # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #");

                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
