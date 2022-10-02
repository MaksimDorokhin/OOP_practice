package Homeworks.S2Hw1Zoo.Birds;

import Homeworks.S2Hw1Zoo.Abstract.Birds;

public class Stork extends Birds {

    public Stork(int height, int weight, String eyesColor, int flightAltitude) {
        super(height, weight, eyesColor, flightAltitude);
    }

    @Override
    public String makeSound() {
        return "Stork: Clack-clack-clack!";
    }

    @Override
    public String fly() {
        return "Stork: " + super.fly();
    }
}
