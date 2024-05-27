package Semana08;

public class TorreNumeros {
    public static void main(String[] args) {
        final int _NUMERO_DE_DIAS_ = 8;
        int valor = 1;

        for(int i = 1; i<= _NUMERO_DE_DIAS_;i++){
            System.out.printf("%-" + _NUMERO_DE_DIAS_ + "d\n", valor);
            valor = valor * 10 + 1;
        }
    }
}
