package Homeworks.S2Hw1Zoo;

public class Program {
    public static void main(String[] args) {
        Birds hen = new Hen(30,2.5, "brown");
        System.out.println(hen.fly());
        System.out.println(hen.makeSound());
    }
}
