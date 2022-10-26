package Homeworks.S5Hw1Calc.Models;

import Homeworks.S5Hw1Calc.Base.CalcModel;

public class SumModel extends CalcModel{

    @Override
    public double result() {
        return x + y;
    }

    @Override
    public void setX (double value) {
        super.x = value;    
    }

    @Override
    public void setY(double value) {
        super.y = value;   
    }


    
}
