package Semana06;

public class TablaMultiplicar {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;

        System.out.println("Tabla de Multiplicar");
        System.out.println("====================");
        while (num1 <= 10) {
            if (num1 % 2 == 0) {
                num1++;
                continue;
            }

            System.out.println(num1);

            num2 = 1;
            while (num2 <= 10) {
                System.out.println("\t\t" + num1 + " x " + num2 + " = " + num1 * num2);
                num2++;
            }

            if (num1 == 7) break;

            num1++;
        }

    }
}
