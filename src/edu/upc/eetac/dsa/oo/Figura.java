package edu.upc.eetac.dsa.oo;

public abstract class Figura implements Comparable<Figura>{

    public abstract double area(); //Area() lo implementaran las subclases

    //devuelve <0, 0 , >0
    public int compareTo(Figura f) {
        return (int)(f.area()-this.area());
    }

}
