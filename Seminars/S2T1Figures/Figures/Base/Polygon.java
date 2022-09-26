package Seminars.S2T1Figures.Figures.Base;

import Seminars.S2T1Figures.Interfaces.IPerimeterable;

public abstract class Polygon extends Figure implements IPerimeterable {
    protected int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
    }

    @Override
    public void getInfo() {
        System.out.print("Sides:");
        for (int item: sides) {
            System.out.print(" " + item);
        }
        System.out.printf("; Perimeter: %f; ", perimeter());
        System.out.printf("Area: %f.\n", area());
    }

    @Override
    public Double perimeter() {
        int sum = 0;
        for (int item: sides) {
            sum = sum + item;
        }
        return sum * 1.0;
    }
}
