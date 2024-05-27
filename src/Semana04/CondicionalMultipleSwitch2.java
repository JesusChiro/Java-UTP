package Semana04;

import java.util.Scanner;

public class CondicionalMultipleSwitch2 {

    public static void main(String[] args) {
        // int diaSemana = 0;
        char diasSemanaCar = 'I';

//        System.out.println("Ingrese el día de la semana: ");
//        Scanner leer = new Scanner(System.in);
//        diaSemana = leer.nextInt();

        System.out.println("Ingrese el día de la semana: ");
        Scanner leer = new Scanner(System.in);
        diasSemanaCar = leer.next().charAt(0);

        // Sentencia switch-case
//        switch(diaSemana){
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miércoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("Sábado");
//                break;
//            case 7:
//                System.out.println("Domingo");
//                break;
//            default:
//                System.out.println("Data incorrecto. Vuelva a intentar.");
//        }

        switch (diasSemanaCar) {
            case 'L':
                System.out.println("Lunes");
                break;
            case 'M':
                System.out.println("Martes");
                break;
            case 'I':
                System.out.println("Miércoles");
                break;
            case 'J':
                System.out.println("Jueves");
                break;
            case 'V':
                System.out.println("Viernes");
                break;
            case 'S':
                System.out.println("Sábado");
                break;
            case 'D':
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Data incorrecto. Vuelva a intentar.");
        }

        leer.close();

    }
}
