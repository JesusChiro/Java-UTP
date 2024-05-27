package Semana08;

public class OperadorIncremento {

    public static void main(String[] args) {
        int i = 1;
        i++;
        System.out.println("(i++ > 1): " + (i > 1));
        System.out.println(i);

        i = 1;
        ++i;
        System.out.println("(++i > 1): " + (i > 1));
        System.out.println(i);

        // for(int j=1; j<=10; j++){
        //     System.out.println(j);
        // }

    }
}
