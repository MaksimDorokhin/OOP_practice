package Homeworks.S5Hw1Calc.ModelsComplex;

import Homeworks.S5Hw1Calc.BaseComplex.CalcModelComplex;
import Homeworks.S5Hw1Calc.Complex.Complex;

public class DivModelComplex extends CalcModelComplex {
    protected Complex a;

    @Override
    public Complex result() {
        return new Complex((super.a.getX() * super.b.getX()) + (super.a.getY() * super.b.getY()) / (super.b.getX() * super.b.getX() + super.b.getY() * super.b.getY())
                + (super.a.getY() * super.b.getX()) + (super.a.getX() * super.b.getY()) / (super.b.getX() * super.b.getX() + super.b.getY() * super.b.getY()));
    }

    @Override
    public void setA(Complex a) {
        super.a = a;
    }

    @Override
    public void setB(Complex b) {
        super.b = b;
    }
    
}
