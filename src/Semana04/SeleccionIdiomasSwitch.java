package Semana04;

import java.util.Scanner;

public class SeleccionIdiomasSwitch {
    public static void main(String[] args) {
        // Países: USA (Estados Unidos), CHI (China), PER (Perú), BRA (Brazil)
        String nomPais;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un país: ");
        System.out.println("Países: USA (Estados Unidos), CHI (China), PER (Perú), BRA (Brazil)");
        nomPais = lectura.nextLine();

        switch (nomPais) {
            case "USA":
                System.out.println("El idioma oficial de Estados Unidos es Inglés");
                break;
            case "CHI":
                System.out.println("El idioma oficial de China es Chino Mandarin");
                break;
            case "PER":
                System.out.println("El idioma oficial de Perú es Español");
                break;
            case "BRA":
                System.out.println("El idioma oficial de Brasil es Portugues");
                break;
            default:
                System.out.println("El país no se encuentra registrado.");
        }

        lectura.close();

    }
}
