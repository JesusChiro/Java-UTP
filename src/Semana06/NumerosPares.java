package Semana06;

public class NumerosPares {
    public static void main(String[] args) {
        int num = 1; // Contador
        int suma = 0; // Acumulador
        boolean menorA100 = true; // Centinela ó Check

        System.out.println("Números pares en el rango de 1 a 100:");

        while (menorA100) {
            if (num % 2 == 0) {
                //System.out.println(num);
                suma += num; // suma = suma + num;
            }
            num++; // num = num + 1;
            menorA100 = (num <= 100);
            System.out.println("Contador: " + num + "    Acumulador: " + suma);
        }

        System.out.println("La suma de estos números es:" + suma);
    }
}
