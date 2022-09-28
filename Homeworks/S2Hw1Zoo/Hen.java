package Homeworks.S2Hw1Zoo;

public class Hen extends Birds{

    public Hen(int height, Double weight, String eyesColor) {
        super(height, weight, eyesColor, 1);
    }

    @Override
    public String makeSound() {
        return "Co-co-co-co!!!!";
    }
}
