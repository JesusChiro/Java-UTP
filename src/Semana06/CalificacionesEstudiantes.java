package Semana06;

import java.util.Scanner;

public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        float calificacion = 0;
        float sumaCalificaciones = 0; // Acumulador
        int cantidadDesaprobados = 0;  // Contador
        int cantidadAprobados = 0;    // Contador
        char respuesta; // S: Sí, N: no

        Scanner sc = new Scanner(System.in);

        while (calificacion >= 0.0f) {
            System.out.println("Ingrese la calificación del estudiante:");
            calificacion = sc.nextFloat();
            sc.nextLine();

            if (calificacion < 0) break;
            if (calificacion > 20) {
                System.out.println("Debe ingresar un número entre [0-20].");
                continue;   // Va al inicio del bucle
            }

            // Acumular o sumar las calificaciones y contar cantidad de aprobados/desaprobados
            sumaCalificaciones += calificacion; // Acumulador sumaCalificaciones = sumaCalificaciones + Calificacion;
            if (calificacion >= 12)
                cantidadAprobados++;
            else
                cantidadDesaprobados++;

            System.out.println("¿Desea continuar? (S/N):");
            respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta == 'n') break;
        }

        if (cantidadAprobados + cantidadDesaprobados != 0) {
            System.out.println("El promedio de calificaciones es: " + (sumaCalificaciones / (cantidadAprobados + cantidadDesaprobados)));
            System.out.println("Se tienen " + cantidadAprobados + " estudiantes aprobados.");
            System.out.println("Se tienen " + cantidadDesaprobados + " estudiantes desaprobados.");
        } else {
            System.out.println("No se tienen calificaciones registradas.");
        }

        sc.close();
    }
}
