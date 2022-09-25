package Homeworks.S1Hw1.src;

public class Goods {
    String name;
    Double price;
    Integer quantity;
    String unit;

    public Goods(String name, Double price, Integer quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return  "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", quantity=" + this.quantity +
                ", unit='" + this.unit + '\'';
    }
}
