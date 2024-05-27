package Semana02;

public class EjemplosMath {
    public static void main(String[] args) {
        // Ejemplo de operaciones básicas con la clase Math
        double numero1 = 10.5;
        double numero2 = 5.3;

        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("Suma: " + Math.addExact((int) numero1, (int) numero2)); // Suma de enteros
        System.out.println("Resta: " + Math.subtractExact((int) numero1, (int) numero2)); // Resta de enteros
        System.out.println("Máximo: " + Math.max(numero1, numero2)); // Máximo entre dos números
        System.out.println("Mínimo: " + Math.min(numero1, numero2)); // Mínimo entre dos números
        System.out.println("Potencia: " + Math.pow(numero1, numero2)); // Potencia

        // Ejemplo de funciones trigonométricas
        double angulo = 45; // en grados
        double radianes = Math.toRadians(angulo);

        System.out.println("\nFunciones trigonométricas:");
        System.out.println("Seno de " + angulo + " grados: " + Math.sin(radianes));
        System.out.println("Coseno de " + angulo + " grados: " + Math.cos(radianes));
        System.out.println("Tangente de " + angulo + " grados: " + Math.tan(radianes));

        // Ejemplo de funciones exponenciales y logarítmicas
        double valor = 2.5;

        System.out.println("\nFunciones exponenciales y logarítmicas:");
        System.out.println("Exponencial de " + valor + ": " + Math.exp(valor));
        System.out.println("Logaritmo natural de " + valor + ": " + Math.log(valor));
        System.out.println("Logaritmo base 10 de " + valor + ": " + Math.log10(valor));

        // Ejemplo de funciones de redondeo
        double decimal = 3.75648;

        System.out.println("\nFunciones de redondeo:");
        System.out.println("Redondeo hacia abajo de " + decimal + ": " + Math.floor(decimal));
        System.out.println("Redondeo hacia arriba de " + decimal + ": " + Math.ceil(decimal));
        System.out.println("Redondeo estándar de " + decimal + ": " + Math.round(decimal));
    }
}

