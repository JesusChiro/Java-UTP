package Semana09;

public class EjemploArreglo {
    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Pera", "Fresa", "Plátano", "Piña", "Sandia", "Kiwi"};  // Creación de arreglo con inicializadores

        System.out.println("Mostrar en pantalla el arreglo de frutas:");
        for(int i=0; i < frutas.length; i++) System.out.print(frutas[i] + ", ");

        frutas = new String[5];
        System.out.println("\nMostrar en pantalla el arreglo de frutas modificado:");
        for(int i=0; i < frutas.length; i++) System.out.print(frutas[i] + ", ");

        String[] frutasCompradas;
        frutasCompradas = new String[3];
        System.out.println("\nMostrar en pantalla el arreglo de frutas compradas:");
        for(int i=0; i < frutasCompradas.length; i++) System.out.print(frutasCompradas[i] + ", ");
    }
}
