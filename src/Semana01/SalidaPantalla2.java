package Semana01;

import java.util.Date;

public class SalidaPantalla2 {
    public static void main(String[] args) {
        System.out.print("Hello, Fabio!");

        String name = "Fabio";
        String lastName = "Livia";

        int age = 46;

        char sex = 'M';

        float luckyNumber = 56.45F;

        double salary = 10568.888;

        Date fecha = new Date();

        System.out.println("\nNombre: " + name + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + sex);
        System.out.println("Luck number: " + luckyNumber);
        System.out.printf("Salary: %.2f", salary);

        System.out.printf("\n%tD", fecha);
        System.out.printf("\n%tT", fecha);
    }
}
