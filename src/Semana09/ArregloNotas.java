package Semana09;

public class ArregloNotas {
    public static void main(String[] args) {
        int[] notas;            // Declarando el arreglo
        notas = new int[20];    // Creando el arreglo (asignarla espacio de memoria)

        // asgiarle 20 al cuarto elemento
        notas[3] = 20;
        notas[0] = 19;
        notas[9] = 18;
        System.out.println("Arreglo notas:");
        for(int i=0; i < notas.length; i++)     // length indica el tamaño del arreglo
            System.out.print(notas[i] + ", ");

        System.out.println("\nArreglo vocales:");
        char[] vocales = {'a', 'e', 'i', 'o', 'u'}; // Crear el arreglo con un inicializador
        for(int i=0; i < vocales.length; i++)
            System.out.println("\nArreglo precios:");

        double[] precios = {12.25, 25.26, 30.01, 10.15, 8.65};
        for(int i=0; i< precios.length; i++)
            System.out.print(precios[i] + ", ");

        System.out.println("\nArreglo precios (tamaño 20):");
        precios = new double[20];
        for(int i=0; i< precios.length; i++)
            System.out.print(precios[i] + ", ");
    }
}


