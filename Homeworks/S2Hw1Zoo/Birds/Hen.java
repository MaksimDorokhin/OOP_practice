package Homeworks.S2Hw1Zoo.Birds;

import Homeworks.S2Hw1Zoo.Abstract.Birds;

public class Hen extends Birds {

    public Hen(int height, Double weight, String eyesColor) {
        super(height, weight, eyesColor, 1);
    }

    @Override
    public String makeSound() {
        return "Hen: Co-co-co-co!!!!";
    }

    @Override
    public String fly() {
        return "Hen: " + super.fly();
    }
}
