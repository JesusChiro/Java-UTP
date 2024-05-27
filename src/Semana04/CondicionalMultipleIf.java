package Semana04;

public class CondicionalMultipleIf {
    public static void main(String[] args) {
        int diasSemana = 1; // 1: Domingo,7:Sábado
        String nomDiaSemana;

        if (diasSemana == 1) {
            nomDiaSemana = "Domingo";
        } else if (diasSemana == 2) {
            nomDiaSemana = "Lunes";
        } else if (diasSemana == 3) {
            nomDiaSemana = "Martes";
        } else if (diasSemana == 4) {
            nomDiaSemana = "Miércoles";
        } else if (diasSemana == 5) {
            nomDiaSemana = "Jueves";
        } else if (diasSemana == 6) {
            nomDiaSemana = "Viernes";
        } else if (diasSemana == 7) {
            nomDiaSemana = "Sábado";
        } else {
            nomDiaSemana = "";
        }

        if (!nomDiaSemana.equals("")) {
            System.out.println("EL día de la semana es: " + nomDiaSemana);
        }
    }
}
