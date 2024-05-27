package Semana09;

public class ArregloJava_OK {
    public static void main(String[] args) {
        char[] data = new char[7];

        data[0] = 'J';
        data[1] = 'a';
        data[2] = 'v';
        data[3] = 'a';
        data[4] = ' ';
        data[5] = 'O';
        data[6] = 'K';

        System.out.println("Java OK con los índices");
        System.out.print("\t");
        System.out.print(data[0]);
        System.out.print(data[1]);
        System.out.print(data[2]);
        System.out.print(data[3]);
        System.out.print(data[4]);
        System.out.print(data[5]);
        System.out.print(data[6]);

        //for tradicional
        System.out.println("\nJava OK con for tradicional");
        System.out.print("\t");
        for(int i=0; i<data.length; i++) System.out.print(data[i]);   // length indica el tamaño del arreglo

        // foreach
        System.out.println("\nJava OK con foreach");
        System.out.print("\t");
        for(char letra:data) System.out.print(letra);
    }
}
