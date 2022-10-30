package Homeworks.S5Hw1Calc.BaseComplex;

import java.util.List;

import Homeworks.S5Hw1Calc.Complex.Complex;
import Homeworks.S5Hw1Calc.Interfaces.IChoosingComplexFactory;
import Homeworks.S5Hw1Calc.Interfaces.IModelComplex;
import Homeworks.S5Hw1Calc.ModelsComplex.DifModelComplex;
import Homeworks.S5Hw1Calc.ModelsComplex.DivModelComplex;
import Homeworks.S5Hw1Calc.ModelsComplex.ProdModelComplex;
import Homeworks.S5Hw1Calc.ModelsComplex.SumModelComplex;

public class ChoseModelComplexFactory implements IChoosingComplexFactory {

    @Override
    public IModelComplex chooseModelComplex(String sign, List<Complex> operandList) {
        IModelComplex myAction = null;
        switch(sign) {
            case "*" -> myAction = new ProdModelComplex();
            case "/" -> myAction = new DivModelComplex();
            case "+" -> myAction = new SumModelComplex();
            case "-" -> myAction = new DifModelComplex();
        }
        
        myAction.setA(operandList.get(0));
        myAction.setB(operandList.get(1));
        return myAction;
    }
    
}

