package Semana09;

public class UsingVar {
    public static void main(String[] args) {
        var prom = 10.0;
        System.out.println("Variable prom: " + prom);

        int var = 1;
        System.out.println("Variable var: " + var);
        int k = -var;
        System.out.println("Variable k: " + k);

        var miArreglo = new int[10];
        for(int i=0;i<10;i++){
            miArreglo[i]=i*i;
        }

        for(int i:miArreglo){       // for each
            System.out.println(i);
        }
    }
}
