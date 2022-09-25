package Homeworks.S1Hw1.src;

public class Hygiene extends Goods{
    Integer qtyInPackage;

    public Hygiene(String name, Double price, Integer quantity, String unit, Integer qtyInPackage) {
        super(name, price, quantity, unit);
        this.qtyInPackage = qtyInPackage;
    }

    public Hygiene() {
    }

    @Override
    public String toString() {
        return super.toString() + ", qtyInPackage=" + this.qtyInPackage;
    }
}
