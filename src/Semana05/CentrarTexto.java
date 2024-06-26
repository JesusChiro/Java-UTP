package Semana05;

public class CentrarTexto {
    public static void main(String[] args) {
        int ancho = 100;//Tamaño del campo a ocupar por la cadena
        String s = "12345678";//Texto
        int lonText = s.length();//longitud del texto
        //Se divide el ancho/2  y tamañoCampo/2
        //en este caso serian 5 y 2 se suman y da 5+2=7 sacamos la mitad del tamaño a ocupar
        int tamañoCampo = (ancho / 2) + (lonText / 2);

        //Se da el primer formateo a (s) con el tamañoCampo=7 lo que seria [***1234]
        //ponemos asteriscos por la izquierda para llenar el total del campo
        //String.format("%7s",s) Justifica el texto a la derecha rellenado con espacios
        String m = String.format("%" + tamañoCampo + "s", s);
        s = String.format("%" + tamañoCampo + "s", s).replace(" ", "*");

        System.out.print("[" + s + "] Primer formateo\n");
        System.out.print("|" + m + "|Primer formateo\n");
        //Se da el segundo formateo a (s) con ancho.Tenemos que s="***1234"=7
        //Con el segundo formato se quedaria s="***1234***"=10
        //ponemos asteriscos por la derecha para llenar el total del campo
        //String.format("%-10s",s) Justifica el texto a la izquierda rellenado con espacios
        s = String.format("%-" + ancho + "s", s).replace(" ", "*");
        m = String.format("%-" + ancho + "s", m);
        System.out.print("[" + s + "] Segundo formateo ");
        System.out.print("\n|" + m + "|Segundo formateo\n\n");
    }

}
