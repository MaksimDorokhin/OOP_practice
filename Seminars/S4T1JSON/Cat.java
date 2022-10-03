package Seminars.S4T1JSON;

import Homeworks.S2Hw1Zoo.Abstract.Domestic;
import Homeworks.S2Hw1Zoo.Interfaces.Ihairiness;

public class Cat {
    protected int height;
    protected int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "height=" + height +
                ",weight=" + weight;
    }
}