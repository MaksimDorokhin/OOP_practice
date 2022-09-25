package Homeworks.S1Hw1.src;

public class Milk extends Drinks{
    String fat;
    String shelfLife;

    public Milk(String name, Double price, Integer quantity, String unit, String volume, String fat, String shelfLife) {
        super(name, price, quantity, unit, volume);
        this.fat = fat;
        this.shelfLife = shelfLife;
    }

    public Milk() {
    }

    @Override
    public String toString() {
        return super.toString() + ", fat='" + this.fat
                                + "', shelLife='" + this.shelfLife + '\'';
    }
}
