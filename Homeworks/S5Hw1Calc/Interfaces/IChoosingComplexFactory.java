package Homeworks.S5Hw1Calc.Interfaces;

import java.util.List;

import Homeworks.S5Hw1Calc.Complex.Complex;

public interface IChoosingComplexFactory {
    IModelComplex chooseModelComplex(String sign, List<Complex> operandList);
}
