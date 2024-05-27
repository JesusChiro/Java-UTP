package Semana03;

public class Operadores {
    public static void main(String[] args) {
        double num1 = 5, num2 = 2, num3 = 3;
        double resultado;

        resultado = Math.pow(num1, num2);
        System.out.println("El resultado de 5 elevado al cuadrado es " + resultado);
        System.out.println("El resultado de num1 con el operador incremento " + ++num1);
        System.out.println("El resultado de num1 con el operador decremento " + --num1);
//        num1 += 10;
//        System.out.println("El resultado de num1 con el operador decremento " + num1);

        resultado = num1 % num3;
        System.out.println("El residuo de la división de 5/3 es: " + resultado);
    }
}
