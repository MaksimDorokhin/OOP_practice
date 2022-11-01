package Homeworks.S4Hw1JSON;

import java.io.IOException;

import Homeworks.S4Hw1JSON.Classes.Cat;
import Homeworks.S4Hw1JSON.JSONManager.JSONmanager;

public class Program {

    public static void main(String[] args) throws IOException {
        JSONmanager m = new JSONmanager("Homeworks/S4Hw1JSON/data/file.json");
        String myString = "Hello world!";
        m.write(myString, true);
        int myNumber = 28;
        m.write(myNumber, true);
        Cat myCat = new Cat("Dexter", 36, 5, "black&white");
        m.write(myCat, true);

        var out = m.read("var");

        if (out.getClass().getSimpleName().equals(String.class.getSimpleName())) {
            String outStr = m.read(String.class.getSimpleName());
            System.out.printf("It's a %s class:\n", outStr.getClass().getSimpleName());
            System.out.println(outStr);
        } else if (out.getClass().getSimpleName().equals(Integer.class.getSimpleName())) {
            Integer outInt = m.read(Integer.class.getSimpleName());
            System.out.printf("It's a %s class:\n", outInt.getClass().getSimpleName());
            System.out.println(outInt);
        } else if (out.getClass().getSimpleName().equals(Cat.class.getSimpleName())) {
            Cat outCat = m.read(Cat.class.getSimpleName());
            System.out.printf("It's a %s class:\n", outCat.getClass().getSimpleName());
            System.out.println(outCat);
        }
    }
}