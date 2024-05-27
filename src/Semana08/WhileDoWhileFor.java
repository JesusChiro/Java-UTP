package Semana08;

public class WhileDoWhileFor {
    public static void main(String[] args) {
        // Mostrar en pantalla los números pares del 1 al 100
        int contador=1;

        System.out.println("WHILE:");

        contador=1;
        while(contador<=100){
            if(contador % 2 == 0) System.out.print(contador + ", ");
            contador++;
        }

        System.out.print("\nDO-WHILE:\n");

        contador=1;
        do{
            if(contador % 2 == 0) System.out.print(contador + ", ");
            contador++;
        }while(contador<=100);

        System.out.print("\nFOR:\n");

        for(contador=2; contador<=100; contador+=2){
            System.out.print(contador + ", ");
        }






        int i = 0;
        boolean esMultiplode5=false;
        for(;!esMultiplode5;){
            if(i % 5 == 0) esMultiplode5 = true;
            i++;
        }

    }
}
