package Semana08;

import java.util.Scanner;

public class Progresion {

    public static void main(String[] args) {
        int opcion=0;
        int terminos=0;
        int razon=0;
        int inicio=1;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("\n Menú de Opciones \n" +
                            "----------------\n" +
                            "1. Progresión aritmética\n" +
                            "2. Progresión geométrica\n" +
                            "3. Salir\n\n" +
                            "Ingrese una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1,2 -> {
                    System.out.println("Ingrese el número de términos: ");
                    terminos = sc.nextInt();

                    System.out.println("Ingrese la razón: ");
                    razon = sc.nextInt();

                    System.out.println("Ingrese el inicio de la secuencia: ");
                    inicio = sc.nextInt();

                    if(terminos > 0) {
                        if (opcion == 1) progresionAritmetica(inicio, terminos, razon);
                        else progresionGeometrica(inicio, terminos, razon);
                    }
                    else {
                        System.out.println("Debe ingresar un número mayor a cero.");
                    }
                }
                case 3 -> System.out.println("Gracias por su visita!");
                default -> System.out.println("Opción Inválida. Intente nuevamente.");
            }

        }while(opcion != 3);

        sc.close();
    }

    public static void progresionAritmetica(int ini, int termino, int razon){
        System.out.println("Progresión aritmética:");

        for(int i=1,j=ini; i<=termino; i++,j+=razon) System.out.print(j + "; ");

        System.out.println("\n======================\n");
    }

    public static void progresionGeometrica(int ini, int termino, int razon){
        System.out.println("Progresión geométrica.");

        for(int i=1,j=ini; i<=termino; i++,j*=razon) System.out.print(j + ", ");

        System.out.println("\n======================\n");
    }

}
