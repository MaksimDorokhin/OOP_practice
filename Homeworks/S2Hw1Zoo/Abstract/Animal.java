package Homeworks.S2Hw1Zoo.Abstract;

public abstract class Animal {
    protected int height;
    protected Double weight;
    protected String eyesColor;

    public Animal(int height, Double weight, String eyesColor) {
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    }

    public Animal() {
    }

    public int getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
