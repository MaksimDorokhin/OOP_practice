package Homeworks.S2Hw1Zoo;

import Homeworks.S2Hw1Zoo.Abstract.Birds;
import Homeworks.S2Hw1Zoo.Abstract.Domestic;
import Homeworks.S2Hw1Zoo.Abstract.Wild;
import Homeworks.S2Hw1Zoo.Birds.Hen;
import Homeworks.S2Hw1Zoo.Birds.Stork;
import Homeworks.S2Hw1Zoo.DomesticAnimals.Cat;
import Homeworks.S2Hw1Zoo.DomesticAnimals.Dog;
import Homeworks.S2Hw1Zoo.WildAnimals.Tiger;
import Homeworks.S2Hw1Zoo.WildAnimals.Wolf;

public class Program {
    public static void main(String[] args) {

        Domestic dexter = new Cat(25, 5, "green",
                "Dexter", "mestizo", "Multifel 08.11.2021",
                "black&white", true);
        Domestic sphinxie = new Cat(30, 3, "brown",
                "Sphinxie", "Sphinx", "None",
                "black&white", false);
        Domestic doggie = new Dog(40, 9, "brown",
                "Sharik", "mongrel", "None",
                "gray", false);
        Wild tigrik = new Tiger(90, 200, "orange",
                "Far East", "15.04.2022");
        Wild volchek = new Wolf(90, 100, "blue",
                "Syberia", "20.06.2022", true);
        Birds henie = new Hen(30,2, "brown");
        Birds storkie = new Stork(80,3, "blue", 2500);

        Zoo zoo = new Zoo();
        zoo.addAnimal(dexter);
        zoo.addAnimal(sphinxie);
        zoo.addAnimal(doggie);
        zoo.addAnimal(tigrik);
        zoo.addAnimal(volchek);
        zoo.addAnimal(henie);
        zoo.addAnimal(storkie);

        ConsoleUI menu = new ConsoleUI(zoo);
        menu.run();
    }
}
