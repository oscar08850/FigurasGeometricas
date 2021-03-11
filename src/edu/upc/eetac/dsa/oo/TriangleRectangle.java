package edu.upc.eetac.dsa.oo;

public class TriangleRectangle extends Figura{

    private double b;
    private double h;

    public TriangleRectangle(double b, double h){
        this.b = b;
        this.h = h;
    }


    @Override
    public double area() {
        return (this.getB() * this.getH())/2;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
