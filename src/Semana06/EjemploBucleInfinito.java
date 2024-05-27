package Semana06;

public class EjemploBucleInfinito {
    public static void main(String[] args) {
//        int x = 100;
//
//        while(x > 0){
//            x -= 2;
//            System.out.println(x--);
//        }

//        int x = 100;
//
//        while(x > 0){
//            System.out.println(x--);
//        }

//        int x = 100;
//
//        while(x > 0){
//            x--;
//
//            if(x%2==0){
//                x++;
//            } else {
//                x--;
//            }
//            System.out.println(x);
//        }

        int x = 13;

        while (x > 0) {
            x /= 2; // x = x / 2;
            if (x % 2 == 0) {
                x++;
            }

            System.out.println(x);
            if (x == 1) break;
        }

    }
}
