import java.util.Scanner;
import java.util.InputMismatchException;

public class Tarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean opcionValida = false;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Contador regresivo");
            System.out.println("2. Acumulador regresivo");
            System.out.println("3. Acumulador y contador");
            System.out.println("4. Validación de entrada numérica");
            System.out.println("5. Salir");

            // Asegurarse de que la opción sea válida
            while (!opcionValida) {
                System.out.print("Seleccione una opción: ");
                try {
                    opcion = scanner.nextInt();
                    if (opcion >= 1 && opcion <= 5) {
                        opcionValida = true;
                    } else {
                        System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 5.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    scanner.next(); // Limpiar el buffer
                }
            }

            switch (opcion) {
                case 1:
                    contadorRegresivo();
                    break;
                case 2:
                    acumuladorRegresivo();
                    break;
                case 3:
                    acumuladorYContador();
                    break;
                case 4:
                    validacionEntrada();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
            opcionValida = false; // Resetear la validación para la siguiente iteración
        } while (opcion != 5);
        scanner.close();
    }

    public static void contadorRegresivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elija el número desde que desee que se retroceda: ");
        int contador = scanner.nextInt();
        while (contador >= 0) {
            if (contador < 1) {
                System.out.println("0.");
            } else {
                System.out.print(contador + ", ");
            }
            contador--;
        }
        scanner.close();
    }

    public static void acumuladorRegresivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elija el número desde que desee que se cuente: ");
        int numero = scanner.nextInt();
        System.out.print(
                "Elija la cantidad que desee que vaya contando la progresion (debe ser menor o igual al primer número): ");
        int acumulador = scanner.nextInt();
        System.out.println("Los números en progresión regresiva en " + acumulador + " son:");
        while (numero >= 0) {
            if (numero < 1) {
                System.out.println("0.");
            } else {
                System.out.print(numero + ", ");
            }
            numero -= acumulador;
        }
        scanner.close();
    }

    public static void acumuladorYContador() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elija el número desde que desee que se cuente: ");
        int numero = scanner.nextInt();
        int acumulador = 0;
        int contador = 0;
        while (contador <= numero) {
            acumulador += contador;
            contador++;
        }
        System.out.println("Suma acumulada: " + acumulador);
        System.out.println("Número de iteraciones: " + contador);
        scanner.close();
    }

    public static void validacionEntrada() {
        Scanner scanner = new Scanner(System.in);
        double numero = 0;
        boolean esValido = false;
        while (!esValido) {
            System.out.print("Ingrese un número (entre 1 y 100): ");
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                if (numero >= 1 && numero <= 100) {
                    esValido = true;
                } else {
                    System.out.println("El número debe estar entre 1 y 100.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar el buffer
            }
        }
        System.out.println("Número válido ingresado: " + numero);
        scanner.close();
    }
}
