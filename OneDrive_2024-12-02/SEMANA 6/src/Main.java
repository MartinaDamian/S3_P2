//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Declaracion de arreglos
        int[] numeros = new int[3];

        System.out.println(numeros[0]);
        //inicializacion de arrelogs
        numeros[0]=1;
        numeros[1]=2;
        //numeros[1]= Integer.valueOf("2");//
        //numeros[1]=(int) 2L;
        //numeros[2]=3;
        numeros[2]=-1;

        int i = numeros[0];
        int j = numeros[1];


        int k= numeros[numeros.length-1];
        System.out.println("i= " + i);
        System.out.println("j= " + j);
        System.out.println("k= " + k);
        String[] productos = new String[3];
        productos[0]="Memoria";
        productos[1]="Samsung S-3";
        productos[2]="MacBok Air";

        System.out.println("SIN ORDENAR");
        for (int m = 0; m <3 ; m++){
            System.out.println("Productos" + m + " = " + productos[m]);}

        System.out.println("ORDENADO");
        Arrays.sort(productos);//ordena un vector
        for (int m = 0; m <3 ; m++){
        System.out.println("Productos" + m + " = " + productos[m]);}

    }
}