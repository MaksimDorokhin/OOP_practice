package Homeworks.S5Hw1Calc.Views;

import java.io.IOException;
import java.util.Scanner;

import Homeworks.S5Hw1Calc.Base.ChoseModelFactory;
import Homeworks.S5Hw1Calc.BaseComplex.ChoseModelComplexFactory;
import Homeworks.S5Hw1Calc.Interfaces.ILogger;
import Homeworks.S5Hw1Calc.Logging.SimpleLogger;
import Homeworks.S5Hw1Calc.Presenters.Presenter;
import Homeworks.S5Hw1Calc.Presenters.PresenterComplex;

public class UIView {
    public Scanner sc = new Scanner(System.in);

    public void consoleUICalc() throws IOException {
        ILogger logger = new SimpleLogger();
        logger.getLog();
        logger.log(UIView.class.getSimpleName(), "consoleUICalc", "the calculator starts");
        Presenter pres = new Presenter(new View(), new ChoseModelFactory(), logger);
        PresenterComplex presComplex = new PresenterComplex(new ViewComplex(), new ChoseModelComplexFactory(), logger);
        System.out.println("Menu:\n1 - Classic calc;\n2 - Complex calc;\n0 - exit.");
        boolean loop = true;
        while (loop) {
            System.out.println("Enter the command from the menu or enter 0 to quit: ");
            int myChoice = sc.nextInt();
            switch (myChoice) {
                case 1 -> {
                    logger.log(UIView.class.getSimpleName(), "consoleUICalc", "a common regime is initialised");
                    pres.buttonClick();
                }
                case 2 -> {
                    logger.log(UIView.class.getSimpleName(), "consoleUICalc", "a complex regime is initialised");
                    presComplex.buttonClickComplex();
                }
                case 0 -> {
                    sc.close();
                    loop = false;
                }
            }
        }
        logger.log(UIView.class.getSimpleName(), "consoleUICalc", "the calculator finishes");
    }
}
