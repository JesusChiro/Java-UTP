package Semana04;

public class DiasSemana {
    // Enumeración para representar los días de la semana
    enum DiaSemana {
        LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
        // Accediendo a los elementos de la enumeración
        DiaSemana dia = DiaSemana.LUNES;

        // Imprimiendo el día actual
        System.out.println("Hoy es " + dia);

        // Usando un switch para imprimir un mensaje diferente dependiendo del día
        switch (dia) {
            case LUNES:
                System.out.println("¡Es lunes! Ánimo, comienza la semana.");
                break;
            case VIERNES:
                System.out.println("¡Por fin es viernes! Fin de semana a la vista.");
                break;
            default:
                System.out.println("Día normal de la semana.");
        }

        // Iterando sobre todos los días de la semana
        System.out.println("Todos los días de la semana:");
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println(d);
        }
    }
}

