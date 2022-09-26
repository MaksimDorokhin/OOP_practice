package Seminars.S2T1Figures.Figures;

import Seminars.S2T1Figures.Figures.Base.Polygon;

public class Triangle extends Polygon {

    public int getA() {
        return sides[0];
    }

    public int getB() {
        return sides[1];
    }

    public int getC() {
        return sides[2];
    }

    public Triangle(int a, int b, int c) {
        super(new int[] {a, b, c});
    }

    @Override
    public Double area() {
        double p = (sides[0] + sides[1] + sides[2]) / 2.0;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public void getInfo() {
        System.out.println("Triangle properties:");
        super.getInfo();
    }
}
