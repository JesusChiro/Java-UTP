package Semana09;

import java.util.Arrays;

public class ComparaArrays {
    public static void main(String[] args) {
        char[] letras = {'c','a','m','p','e','ó','n'};
        char[] letras2 = {'c','a','m','p','e','ó','n'};

        boolean iguales = Arrays.equals(letras, letras2);
        System.out.println(iguales?"Son iguales":"Son diferentes");
    }
}
