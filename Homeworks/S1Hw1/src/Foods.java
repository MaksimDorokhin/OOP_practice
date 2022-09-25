package Homeworks.S1Hw1.src;

public class Foods extends Goods{
    String shelfLife;

    public Foods(String name, Double price, Integer quantity, String unit, String shelfLife) {
        super(name, price, quantity, unit);
        this.shelfLife = shelfLife;
    }

    public Foods() {
    }

    @Override
    public String toString() {
        return super.toString() + ", shelfLife='" + this.shelfLife + '\'';
    }
}
