package Semana06;

public class EjemploWhile2 {
    public static void main(String[] args) {
        boolean centinela = true;
        int contador = 0;
        int contadorInterno = 0;

        while (centinela) {

            contador++;
            if (contador % 2 == 0) {

                System.out.println(contador);

                contadorInterno = 0;
                while (contadorInterno < 5) {
                    System.out.println("\t\t" + contadorInterno);
                    contadorInterno++;
                }
            }

            centinela = (contador <= 50);
        }
    }
}
