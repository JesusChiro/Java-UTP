import java.util.Scanner;

public class ReporteASCII {
    // Resolver un problema que solicite al usuario N datos que serán almacenados en
    // arreglos paralelos y muestre un reporte ASCII con dichos datos. Incluir algún
    // cálculo con contadores y acumuladores.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean nombreOk = false;
        String nombreUsuario = "";
        do {
            System.out.println("Hola, Ingrese el nombre del docente:");
            String nombreDocente = sc.nextLine().trim();
            nombreOk = validarTexto(nombreDocente);
            if (nombreOk) {
                nombreUsuario = nombreDocente;
            } else {
                System.out.println("Por favor, escriba un nombre correcto");
            }
        } while (!nombreOk);

        System.out.println("Hola " + nombreUsuario + ", Ingrese la cantidad de estudiantes:");
        int cantidadEstudiantes = sc.nextInt();

        // Arrays para almacenar la información de los estudiantes
        String[] nombres = new String[cantidadEstudiantes];
        int[] edades = new int[cantidadEstudiantes];
        double[][] notasExamenes = new double[cantidadEstudiantes][3];
        double[] promedios = new double[cantidadEstudiantes];
        String[] estado = new String[cantidadEstudiantes];

        // Contadores para estudiantes aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;

        // Captura de datos de cada estudiante
        for (int i = 0; i < cantidadEstudiantes; i++) {
            String nombre;
            boolean nombreValido;
            do {
                System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
                nombre = sc.next();
                nombreValido = nombre.matches("[a-zA-Z]+");
                if (!nombreValido) {
                    System.out.println("Por favor, ingrese un nombre válido que contenga solo letras.");
                }
            } while (!nombreValido);
            nombres[i] = nombre.substring(0, 1).toUpperCase() +
                    nombre.substring(1).toLowerCase();

            // Validación de edad
            int edad;
            do {
                System.out.println("Ingrese la edad del estudiante " + (i + 1) + " (entre 3 y 50 años):");
                while (!sc.hasNextInt()) {
                    System.out.println("Por favor, ingrese un número válido.");
                    sc.next();
                }
                edad = sc.nextInt();
            } while (edad < 3 || edad > 50);
            edades[i] = edad;

            // Ingreso de notas de los exámenes con validación
            for (int j = 0; j < 3; j++) {
                double nota;
                do {
                    System.out.println("Ingrese la nota del examen " + (j + 1) + " (entre 0 y 20):");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Por favor, ingrese un número válido.");
                        sc.next();
                    }
                    nota = sc.nextDouble();
                } while (nota <= 0 || nota > 20);
                notasExamenes[i][j] = nota;
            }

            // Calcular promedio
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notasExamenes[i][j];
            }
            promedios[i] = suma / 3.0;

            // Determinar estado del estudiante
            estado[i] = (promedios[i] > 12) ? "Aprobado" : "Reprobado";

            // Incrementar el contador correspondiente
            if (estado[i].equals("Aprobado")) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Mostrar reporte ASCII
        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("| %-10s%5s%5s%5s%5s%9s%-10s\n", "Nombre\t|", "Edad\t|", "Nota1\t|", "Nota2\t|", "Nota3\t|",
                "Promedio\t|", "Estado\t|");
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.printf("| %-10s\t| %-5d\t| %-5.2f\t| %-5.2f\t| %-5.2f\t| %-9.2f\t| %-10s\t|\n",
                    nombres[i], edades[i], notasExamenes[i][0], notasExamenes[i][1], notasExamenes[i][2], promedios[i],
                    estado[i]);
        }
        System.out.println("------------------------------------------------------------------------------");
        // Mostrar resumen
        System.out.println("Hola " + nombreUsuario + "." + " Tienes " + cantidadEstudiantes
                + " alumnos ingresados\n. Aprobados son: " + aprobados + " y reprobados: " + desaprobados);
        sc.close();
    }

    public static boolean validarTexto(String texto) {
        // Si el texto es nulo o vacío, no es válido
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        // Verificar si cada carácter es una letra o un espacio
        for (char c : texto.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                return false; // Si se encuentra un carácter que no es letra ni espacio, el texto no es válido
            }
        }
        // Si no se encontraron caracteres inválidos, el texto es válido
        return true;
    }
}