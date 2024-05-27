package Semana09;

import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        // toString
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Contenido del arreglo a:");
        System.out.println(Arrays.toString(a));

        // copyOf
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println("Contenido del arreglo b:");
        System.out.println(Arrays.toString(b));

        int[] c = Arrays.copyOf(a, 2 * a.length);
        System.out.println("Contenido del arreglo c:");
        System.out.println(Arrays.toString(c));

        // sort
        int[] aleatorios = new int[20];
        for(int i=0;i<aleatorios.length;i++){
            aleatorios[i] = (int) (Math.random() * 100);
        }
        System.out.println("Contenido del arreglo aleatorios:");
        System.out.println(Arrays.toString(aleatorios));

        Arrays.sort(aleatorios);
        System.out.println("Contenido del arreglo aleatorios (ordenado):");
        System.out.println(Arrays.toString(aleatorios));

        // Rellenar los arreglos
        float[] pesos = new float[10];
        System.out.println("Contenido del arreglo pesos:");
        Arrays.fill(pesos,75.5f);
        //for(float peso : pesos) System.out.printf("Peso: %8.2f\n", peso);
        System.out.println(Arrays.toString(pesos));
    }
}
