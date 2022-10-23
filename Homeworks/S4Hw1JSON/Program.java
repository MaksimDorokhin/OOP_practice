package Homeworks.S4Hw1JSON;

import Homeworks.S4Hw1JSON.Classes.FReader;
import Homeworks.S4Hw1JSON.Classes.TestObject;

import java.io.IOException;


public class Program {
    public static void main(String[] args) throws IOException {

        FReader reader = new FReader();

        reader.printFile();

        TestObject testObject = reader.getElementFromFile(TestObject.class.getSimpleName());
        System.out.println("Найден объект: testObject со следующими полями");
        System.out.printf("name = %s\narticle = %d\nquantity = %d\n", testObject.getName(),
                                                                 testObject.getArticle(),
                                                                 testObject.getQuantity());

        String s = reader.getElementFromFile(String.class.getSimpleName());
        System.out.printf("\nНайдена строка: %s\n",s);

        int number = reader.getElementFromFile(int.class.getSimpleName());
        System.out.printf("\nНайдено число: %d\n",number);
    }
}
