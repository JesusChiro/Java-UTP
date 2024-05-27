package Semana01;

public class SalidaPantalla {
    public static void main(String[] args) {
        int edad = 21;
        double numeroFavorito = 2.5;
        double peso = 70.5;
        double talla = 1.7250125;
        String nombre = "Juan Pérez";
        String nacionalidad = "Peruana";

        int numeroFavoritoEntero = (int) numeroFavorito;

        System.out.println("\n\n\tMi nombre es: " + nombre);
        System.out.println("Tengo de edad: " + edad + " años");
        System.out.print("Hola nuevamente\n");
        System.out.print("\tHola por tercera vez\n");
        System.out.printf("Mi número favorito es %.2f", numeroFavorito);
        System.out.printf("Mi peso es %f kilos \n", peso);
//    System.out.println("Mi talla es: " + talla);
        System.out.printf("Mi talla es %.2f metros\n", talla);
        System.out.printf("Mi número favorito es %d \n", numeroFavoritoEntero);
        System.out.printf("Mi nacionalidad es %s\n", nacionalidad);
    }
}
