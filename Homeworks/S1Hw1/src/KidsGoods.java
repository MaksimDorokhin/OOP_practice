package Homeworks.S1Hw1.src;

public class KidsGoods extends Goods{
    Integer minAge;
    String hypoallergenic;

    public KidsGoods(String name, Double price, Integer quantity, String unit, Integer minAge, String hypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public KidsGoods() {
    }

    @Override
    public String toString() {
        return super.toString() + ", qtyInPackage='" + this.minAge + ", hypoallergenic='"
                                                    + this.hypoallergenic + '\'';
    }
}
