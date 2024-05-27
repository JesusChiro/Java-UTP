package Semana08;

public class DiasSemana {
    public static void main(String[] args) {
        String nomDiaSemana;
        int diaSemana=0;

        for(int i = 1; i <= 3; i++){

            System.out.println("Semana " + i);
            for(diaSemana=1; diaSemana <= 7; diaSemana++){

                nomDiaSemana = switch (diaSemana){
                    case 1 -> "Lunes";
                    case 2 -> "Martes";
                    case 3 -> "Miércoles";
                    case 4 -> "Jueves";
                    case 5 -> "Viernes";
                    case 6 -> "Sábado";
                    case 7 -> "Domingo";
                    default -> "";
                };

                System.out.println("\t\tDía: " + nomDiaSemana);
            }

        }

    }
}
