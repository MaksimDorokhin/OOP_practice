package Homeworks.S5Hw1Calc.Base;

import java.util.List;

import Homeworks.S5Hw1Calc.Models.SumModel;
import Homeworks.S5Hw1Calc.Interfaces.IChoosingAction;
import Homeworks.S5Hw1Calc.Interfaces.IModel;
import Homeworks.S5Hw1Calc.Models.DifModel;
import Homeworks.S5Hw1Calc.Models.DivModel;
import Homeworks.S5Hw1Calc.Models.ProdModel;

public class ChoseModelFactory implements IChoosingAction {

    @Override
    public IModel chooseModel(String sign, List<Double> operandList) {
        IModel myAction = null;
        switch (sign) {
            case "*" -> myAction = new ProdModel();
            case "/" -> myAction = new DivModel();
            case "+" -> myAction = new SumModel();
            case "-" -> myAction = new DifModel();
        }
        myAction.setX(operandList.get(0));
        myAction.setY(operandList.get(1));
        return myAction;
    }

}

