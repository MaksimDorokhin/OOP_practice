package Seminars.S2T1Figures.Figures;

import Seminars.S2T1Figures.Figures.Base.Polygon;

public class Rectangle extends Polygon {

    public int getA() {
        return sides[0];
    }

    public int getB() {
        return sides[1];
    }
    public Rectangle(int a, int b) {
        super(new int[] {a, b, a, b});
    }

    @Override
    public Double area() {
        return (sides[0] * sides[1]) * 1.0;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder("Rectangle properties:\n");
        info.append(super.getInfo());
        return info;
    }
}
