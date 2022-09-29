package Homeworks.S2Hw1Zoo;

import Homeworks.S2Hw1Zoo.Abstract.Animal;

public abstract class Birds extends Animal {
    protected int flightAltitude;

    public Birds(int height, Double weight, String eyesColor, int flightAltitude) {
        super(height, weight, eyesColor);
        this.flightAltitude = flightAltitude;
    }

    public String fly() {
        return String.format("I fly at %d m!" , flightAltitude);
    }
}
