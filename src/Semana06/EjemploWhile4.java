package Semana06;

public class EjemploWhile4 {
    public static void main(String[] args) {

        int numero = 0;
        int suma = 0;

        while (numero < 10) {
            suma += numero; // suma = suma + numero;
            System.out.println("Iteración (" + numero + ") Suma (" + suma + ")");
            numero++; // numero = numero + 1;
        }

        System.out.println("La suma de la cuenta de las iteraciones es: " + suma);
    }
}
