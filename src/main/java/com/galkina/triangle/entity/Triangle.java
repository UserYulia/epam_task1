package com.galkina.triangle.entity;

public class Triangle {

    private Point a, b, c;
    private double ab, bc, ac;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ab = calculateSide(a,b);
        ac = calculateSide(a,c);
        bc = calculateSide(b,c);
    }

    public double calculateSide(Point a1, Point a2){
        return Math.hypot(a1.getX() - a2.getX(), a1.getY() - a2.getY());
    }


    public double calcPerimeter(){
        return ab+ac+bc;
    }

    public double calcArea(){
        double p = calcPerimeter()/2;
        return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
    }

    public Point getA() {
        return a;
    }
    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }
    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }
    public void setC(Point c) {
        this.c = c;
    }

    public double getAb() {
        return ab;
    }

    public double getBc() {
        return bc;
    }

    public double getAc() {
        return ac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        return a.equals(triangle.a) && b.equals(triangle.b) && c.equals(triangle.c);

    }

    @Override
    public int hashCode() {
        int result = a.hashCode();
        result = 31 * result + b.hashCode();
        result = 31 * result + c.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", perimeter=" + String.format("%.2f", calcPerimeter()) +
                ", area=" + String.format("%.2f",calcArea()) +
                '}';
    }
}
