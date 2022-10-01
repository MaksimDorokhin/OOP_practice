package Homeworks.S2Hw1Zoo.DomesticAnimals;

import Homeworks.S2Hw1Zoo.Abstract.Domestic;
import Homeworks.S2Hw1Zoo.Interfaces.Ihairiness;

public class Cat extends Domestic implements Ihairiness {
    protected boolean hasHairiness;

    public Cat(int height, Double weight, String eyesColor, String nickname,
               String breed, String vaccinated, String woolColor, boolean hasHairiness) {
        super(height, weight, eyesColor, nickname, breed, vaccinated, woolColor);
        this.hasHairiness = hasHairiness;
        if (!hasHairiness)
            super.woolColor = "None";
    }
    @Override
    public String makeSound() {
        return super.nickname + ": Meaow!";
    }

    @Override
    public String tender() {
        return super.nickname +"Murrr";
    }


    @Override
    public boolean hasHairiness() {
        return hasHairiness;
    }
}