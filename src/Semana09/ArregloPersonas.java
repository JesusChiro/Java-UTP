package Semana09;

public class ArregloPersonas {
    public static void main(String[] args) {

        // Crear un arreglo a través de un inicializador
        String[] estudiantes = {"Alberto","Ayar", "Diego", "Eliseo", "Enoc", "Fabian","George"};

        System.out.println("Recorrido con FOR tradicional");
        for(int i=0; i < estudiantes.length; i++)
            System.out.println(estudiantes[i] + ", ");

        System.out.println("Recorrido con FOR-EACH");
        for(String nombre:estudiantes)
            System.out.println(nombre + ", ");
    }
}
