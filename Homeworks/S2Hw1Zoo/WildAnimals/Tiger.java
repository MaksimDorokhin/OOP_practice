package Homeworks.S2Hw1Zoo.WildAnimals;

import Homeworks.S2Hw1Zoo.Abstract.Wild;

public class Tiger extends Wild {

    public Tiger(int height, Double weight, String eyesColor, String habitat, String foundDate) {
        super(height, weight, eyesColor, habitat, foundDate);
    }

    @Override
    public String makeSound() {
        return "Tiger: Rrr-r-r!";
    }
}
