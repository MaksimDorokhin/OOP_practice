package Homeworks.S4Hw1JSON.Classes;

public class TestObject {
    private final String name;
    private final int article;
    private final int quantity;

    public TestObject(String name, int article, int quantity) {
        this.name = name;
        this.article = article;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getArticle() {
        return article;
    }

    public int getQuantity() {
        return quantity;
    }
}
