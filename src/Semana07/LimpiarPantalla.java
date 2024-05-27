package Semana07;

public class LimpiarPantalla {
    public static void main(String[] args) {
        // Limpia la pantalla de la consola utilizando una secuencia ANSI
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Continúa con el resto del código
        System.out.println("La pantalla de la consola ha sido limpiada.");
    }
}

