package Semana06;

public class EjemploWhile3 {

    public static void main(String[] args) {
        int contadorA = 0;
        int contadorB = 0;

        while (contadorA < 50) {
            System.out.println(contadorA);
            contadorA++;

            contadorB = contadorA;
            while (contadorB < contadorA + 5) {
                System.out.println("\t\t" + contadorB);
                contadorB++;
            }
            contadorA = contadorB;
        }
    }
}
