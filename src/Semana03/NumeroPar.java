package Semana03;

public class NumeroPar {
    public static void main(String[] args) {
        int numero = 121;
        int residuo = 0;
        boolean condicion;

        residuo = numero % 2;
        System.out.println("Residuo de división entre 2: " + residuo);
        condicion = (residuo == 0);

        if (condicion) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}
