package edu.upc.eetac.dsa.oo;

public class Quadrat extends Rectangle {

    public Quadrat (double l){
        super(l,l);
    }

    @Override
    public String toString() {
        return "Quadrat{" + this.getL1() + "area: " + super.area();
    }
}
