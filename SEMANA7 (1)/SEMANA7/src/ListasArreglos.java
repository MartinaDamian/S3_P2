import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListasArreglos {
    public ListasArreglos() {
    }

    public static void main(String[] args) {
        List<String> ListaColores = new ArrayList();
        String[] nombres = new String[]{"Arturo", "Daniel", "Pamela"};
        List<String> ListaNombres = Arrays.asList(nombres);
        ListaColores.add("Verde");
        ListaColores.add("Amarillo");
        new ArrayList(ListaColores);

        List<String> ListaElementos = new ArrayList<>(ListaColores);
        ListaElementos.addAll(ListaNombres);

        System.out.println("Lista Nombre");
        ListaNombres.forEach(System.out::println);
        System.out.println("Lista Colores");
        ListaColores.forEach(System.out::println);
        System.out.println("Lista Elementos");
        ListaElementos.forEach(System.out::println);

        //Interaccion de elementos individuales
        ListIterator<String> iterador1 = ListaColores.listIterator();
        System.out.println("Recorrido con Iterador hacia adelante\n");
        while (iterador1.hasNext()){
            System.out.println("Color: " + iterador1.next());
        }

        System.out.println("Recorrido con Iterador hacia atras\n");
        while (iterador1.hasPrevious()){
            System.out.println("Color: " + iterador1.previous());
        }
        System.out.println("Recorrido con Iterador eliminacion dinamica");
        while (iterador1.hasNext()){
            if(iterador1.next().equals("Amarillo"));{ iterador1.remove();}
        }

        /*//Inicializacion con un nuevo iterador con elemento amarillo eliminado
        System.out.println("Lista de colores sin elemento eliminado");
        ListIterator<String> iterador3 = ListaColores.listIterator();
        System.out.println("Recorrido con Iterador hacia adelante\n");

        for(iterador3=ListaColores.listIterator(); iterador3.hasNext();){
            System.out.println("Color Amarillo = " + iterador3.next());
        }*/

        //Eliminacion Pamela
        ListIterator<String> iterador3 = ListaElementos.listIterator();
        System.out.println("Recorrido con Iterador hacia adelante\n");
        while (iterador3.hasNext()){
            System.out.println("Elemento = " + iterador3.next());
        }
        System.out.println("Recorrido con Iterador hacia atras\n");
        while (iterador3.hasPrevious()){
            System.out.println("Elemento = " + iterador3.previous());
        }
        System.out.println("Recorrido con Iterador eliminacion dinamica");
        while (iterador3.hasNext()){
            if(iterador3.next()=="Pamela");{
                System.out.println("Se encontro " + iterador3.next());
             iterador3.remove();
            }
        }
        System.out.println("Lista Elementos");
        ListaElementos.forEach(System.out::println);


    }
}
