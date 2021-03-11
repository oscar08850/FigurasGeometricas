package edu.upc.eetac.dsa.oo;

import java.util.Arrays;
import java.util.Comparator;


public class GestorClasses {

    public static void sort(Figura[] v){
        Arrays.sort(v);

        /*
        Arrays.sort(v, new Comparator<Figura>() {
            @Override
            public int compare(Figura o1, Figura o2) {
                //

                //
                return o1.compareTo(o2);
            }
        });

      //raro  Arrays.sort(v,(o1,o2)) ->

         */
    }




















    public static double suma (Figura[] v){
        double res = 0; //inicializo a 0 el resultado
        for (Figura f: v){
            res += f.area();
        }
        return res;
    }


    public static void main(String[] args) {
        Figura[] v = new Figura[5]; // v[0],v[1],v[2]...
        v[0] = new Cercle (5);
        v[1] = new Rectangle (2,1);
        v[2] = new Quadrat (2);
        v[3] = new Cercle (5);
        v[4] = new Quadrat(8);

        double r = GestorClasses.suma(v);

        System.out.println(r);

        //Desordenado??
        System.out.println(Arrays.asList(v));
        GestorClasses.sort(v);
        //Ordenado??
        System.out.println(Arrays.asList(v));
    }
}
