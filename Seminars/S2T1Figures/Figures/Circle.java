package Seminars.S2T1Figures.Figures;

import Seminars.S2T1Figures.Figures.Base.Figure;
import Seminars.S2T1Figures.Interfaces.IArea;
import Seminars.S2T1Figures.Interfaces.ILengthable;

public class Circle extends Figure implements ILengthable, IArea {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double circleLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void getInfo() {
        System.out.println("Circle properties:");
        System.out.printf("Radius: %d; ", radius);
        System.out.printf("Circle length: %f; ", circleLength());
        System.out.printf("Area: %f.\n", area());
    }
}
