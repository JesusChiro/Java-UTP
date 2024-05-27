package Semana08;

public class Abecedario {
    public static void main(String[] args) {
        String abedecedario = "abcdefghijklmnopqrstuvwxyz";
        int i = 0;
        for (i = 0; i < abedecedario.length(); i++) {
            System.out.println("La letra " + abedecedario.charAt(i) + " está en la posición: " + i);
        }

    }
}
