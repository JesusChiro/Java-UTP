package Semana04;

public class CuatroEstaciones {
    public static void main(String[] args) {
        int mes = 12;
        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Verano");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Otoño");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Invierno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Ingrese un número entero entre 1 y 12.");
        }
    }
}
