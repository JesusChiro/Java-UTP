package Semana02;

public class NumeroAleatorio {
    public static void main(String[] args) {
        // Generamos un número aleatorio entre 0 (inclusive) y 1 (exclusivo)
        double numeroAleatorio1 = Math.random();
        System.out.println("Número aleatorio 1: " + numeroAleatorio1);

        // Generamos un número aleatorio entre 0 (inclusive) y 100 (exclusivo)
        double numeroAleatorio2 = Math.random() * 100;
        System.out.println("Número aleatorio 2: " + numeroAleatorio2);

        // Generamos un número aleatorio entre 1 (inclusive) y 6 (inclusive) para simular un dado
        int dado = (int) (Math.random() * 6) + 1;
        System.out.println("Resultado del dado: " + dado);
    }
}

