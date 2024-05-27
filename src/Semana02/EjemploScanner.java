package Semana02;

import java.util.Scanner;
/*
linea comentgario
asdfasdfas
asdfasdf
sdf
*/


/**
 * Comentarios de la documentación de la clase
 */
public class EjemploScanner {

    /**
     * Objetivo ....
     *
     * @param args Este argumento sirve,.,.,
     *             Descripcion: adfasdf
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");

        if (sc.hasNextInt()) { // Valida si se ha ingresado un número
            int number = sc.nextInt(); // Recupera el número entero y lo asigna a una variable
            System.out.println("¡Gracias! Usted ingresó el número " + number);
        } else {
            System.out.println("Lo siento, pero lo ingresado no es un número. Reinicie el programa e intente nuevamente!");
        }

        sc.close(); // No olvidar cerrar el Scanner.
    }
}
