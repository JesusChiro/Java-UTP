package Semana09;

import java.util.Arrays;

public class EjemploArrayCopy {
    public static void main(String[] args) {
        int[] fibonacci = {1,1,2,3,5,8,13,21};
        int[] copia = new int[fibonacci.length];

        System.out.println("Copia con System.arraycopy");
        System.arraycopy(fibonacci,0,copia,0,fibonacci.length);
        for(int valor : copia) System.out.print(valor + " ");

        System.out.println("\nCopia con Arrays.copyOf");
        int[] copia2;
        copia2 = Arrays.copyOf(copia,copia.length*2);
        for(int valor : copia2) System.out.print(valor + " ");
    }
}
