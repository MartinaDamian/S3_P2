import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasArreglos {
    public static void main(String[] args) {
        //Es dinamico, almacena lo que yo quiera que almacena
        //No posee posicion unicamente contenido
        //Creacion de un ARRAYLIST
        List<String> ListaColores = new ArrayList<>();
        //collections
        String[] nombres = {"Arturo", "Daniel", "Pamela"};
        List<String> ListaNombres = Arrays.asList(nombres);

        //Adicion de elementos individuales
        ListaColores.add("Verde");
        ListaColores.add("Amarillo");
        //Construir lista a partir de otra lista
        List<String> ListaElementos = new ArrayList<>(ListaColores);
        //Adicion de elementos a otra coleccion
        ListaElementos.addAll(ListaNombres);

        //Desplegue de elementos de la lista
        System.out.println("Lista Nombre");
        ListaNombres.forEach();

    }
}
