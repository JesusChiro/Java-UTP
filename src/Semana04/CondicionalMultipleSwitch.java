package Semana04;

public class CondicionalMultipleSwitch {
    public static void main(String[] args) {
        int diasSemana = 5; // 1: Domingo,7:Sábado
        String nomDiaSemana;

        switch (diasSemana) {
            case 1:
                nomDiaSemana = "Domingo";
                break;
            case 2:
                nomDiaSemana = "Lunes";
                break;
            case 3:
                nomDiaSemana = "Martes";
                break;
            case 4:
                nomDiaSemana = "Miércoles";
                break;
            case 5:
                nomDiaSemana = "Jueves";
                break;
            case 6:
                nomDiaSemana = "Viernes";
                break;
            case 7:
                nomDiaSemana = "Sábado";
                break;
            default:
                nomDiaSemana = "";
        }

        if (!nomDiaSemana.equals("")) {
            System.out.println("EL día de la semana es: " + nomDiaSemana);
        }
    }
}
