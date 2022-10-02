package Homeworks.S2Hw1Zoo.DomesticAnimals;

import Homeworks.S2Hw1Zoo.Abstract.Domestic;
import Homeworks.S2Hw1Zoo.Interfaces.IbeeingTrained;
import Homeworks.S2Hw1Zoo.Interfaces.ItrainingAvailability;

public class Dog extends Domestic implements IbeeingTrained, ItrainingAvailability {
    protected boolean trainingAvailability;

    public Dog(int height, int weight, String eyesColor, String nickname,
               String breed, String vaccinated, String woolColor, boolean trainingAvailability) {
        super(height, weight, eyesColor, nickname, breed, vaccinated, woolColor);
        this.trainingAvailability = trainingAvailability;
    }

    @Override
    public String makeSound() {
        return super.nickname + ": Woof-woof!";
    }

    @Override
    public String train() {
        return super.nickname + " is beeing trained";
    }
    @Override
    public String tender() {
        return super.nickname + " is wagging his tail";
    }

    @Override
    public boolean hasTrainingAvailability() {
        return trainingAvailability;
    }
}