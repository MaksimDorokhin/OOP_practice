package Homeworks.S2Hw1Zoo.WildAnimals;

import Homeworks.S2Hw1Zoo.Abstract.Wild;
import Homeworks.S2Hw1Zoo.Interfaces.IpackLeader;

public class Wolf extends Wild implements IpackLeader {
    protected boolean packLeader;

    public Wolf(int height, int weight, String eyesColor, String habitat, String foundDate, boolean packLeader) {
        super(height, weight, eyesColor, habitat, foundDate);
        this.packLeader = packLeader;
    }

    @Override
    public String makeSound() {
        return "Wolf: Ouu-uu-u!";
    }

    @Override
    public boolean isPackLeader() {
        return packLeader;
    }
}
