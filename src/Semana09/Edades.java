package Semana09;

public class Edades {
    public static void main(String[] args) {

        int[] edades; // Declarando un arreglo
        edades = new int[10];   // Crear un arreglo con new

        edades[9] = 20;
        edades[0] = 35;     // Se asigna valores
        edades[1] = 36;
        edades[2] = 34;

        //edades = new char[] {'1','2','3','4','5','6','7','8','9','0'};

        // Recorre el arreglo de manera ascendente (indice)
        for(int i=0;i<10;i++){      // Se recorre el arreglo
            System.out.println("Indice: " + i + " valor: " + edades[i]);
        }

        // Recorre el arreglo de manera descendente (indice)
        for(int i=9;i>=0;i--){
            System.out.println("Indice: " + i + " valor: " + edades[i]);
        }

        double[] tallas = {1.72, 1.80, 1.90, 1.65, 1.73};
        for(int i=0;i<5;i++) System.out.println("Indice: " + i + " valor: " + tallas[i]);

        int[] datos = new int[20];
        datos =new int[] {11,12,13,14,15,16};
        for(int i=0;i<6;i++) System.out.println(datos[i]);

    }
}
