package Semana04;

import java.util.Scanner;

// Solicitar un país al usuario y nos debe mostrar
// el idioma oficial del país
public class SeleccionIdiomas {

    public static void main(String[] args) {
        // Países: USA (Estados Unidos), CHI (China), PER (Perú), BRA (Brazil)
        String nomPais;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un país: ");
        System.out.println("Países: USA (Estados Unidos), CHI (China), PER (Perú), BRA (Brazil)");
        nomPais = lectura.nextLine();

        // Estructura condicional múltiple con if-else
        if (nomPais.equals("USA")) {
            System.out.println("El idioma oficial de Estados Unidos es Inglés");
        } else if (nomPais.equals("CHI")) {
            System.out.println("El idioma oficial de China es Chino Mandarin");
        } else if (nomPais.equals("PER")) {
            System.out.println("El idioma oficial de Perú es Español");
        } else if (nomPais.equals("BRA")) {
            System.out.println("El idioma oficial de Brasil es Portugues");
        } else {
            System.out.println("El país no se encuentra registrado.");
        }

        lectura.close();
    }

}
