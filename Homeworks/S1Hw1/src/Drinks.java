package Homeworks.S1Hw1.src;

public class Drinks extends Goods{
    String volume;

    public Drinks(String name, Double price, Integer quantity, String unit, String volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    public Drinks() {
    }

    @Override
    public String toString() {
        return super.toString() + ", volume='" + this.volume + '\'';
    }
}
