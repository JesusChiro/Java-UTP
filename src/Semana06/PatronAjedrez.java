package Semana06;

public class PatronAjedrez {
    public static void main(String[] args) {
        int columna = 1;
        int fila = 1;

        while (columna <= 8) {
            while (fila <= 8) {
                if (fila % 2 == 0)
                    System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ");
                else
                    System.out.println(" ■ ■ ■ ■ ■ ■ ■ ■");
                fila++;
            }
            columna++;
        }
    }
}
