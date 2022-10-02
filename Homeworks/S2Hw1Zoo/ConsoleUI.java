package Homeworks.S2Hw1Zoo;

import Homeworks.S2Hw1Zoo.Abstract.Birds;
import Homeworks.S2Hw1Zoo.Abstract.Domestic;
import Homeworks.S2Hw1Zoo.Birds.Hen;
import Homeworks.S2Hw1Zoo.Birds.Stork;
import Homeworks.S2Hw1Zoo.DomesticAnimals.Cat;
import Homeworks.S2Hw1Zoo.DomesticAnimals.Dog;
import Homeworks.S2Hw1Zoo.WildAnimals.Tiger;
import Homeworks.S2Hw1Zoo.WildAnimals.Wolf;

import java.util.Scanner;

public class ConsoleUI {
     Zoo zoo;

    public ConsoleUI(Zoo zoo) {
        this.zoo = zoo;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            System.out.println("""
                    Welcome to the zoo!
                    
                    Available commands list:
                    1 - Add the animal to the Zoo
                    2 - Delete the animal at specified index from the Zoo
                    3 - View information about the animal at specified index
                    4 - View information about all animals in the Zoo
                    5 - Let the animal at specified index make sound
                    6 - Let all the animals in the Zoo make sound
                    7 - Make the bird at the index fly on the specified height
                    8 - Let the domestic animal at the specified index show tender
                    9 - Train the domestic animal at the specified index
                    10 - Exit
                    
                    Please enter the command:""");
            int choice = inputNaturalNumber(in);
                switch (choice) {
                    case 1 -> inputAnimal(in);
                    case 2 -> {
                        System.out.println("\nInput index of animal to delete from the zoo: ");
                        zoo.removeAnimal(inputNaturalNumber(in));
                    }
                    case 3 -> {
                        System.out.println("\nInput index of animal to view information: ");
                        System.out.println(zoo.getAnimalInfo(inputNaturalNumber(in)));
                    }
                    case 4 -> System.out.println(zoo.getAllAnimalsInfo());
                    case 5 -> {
                        System.out.println("\nInput index of animal to make sound: ");
                        System.out.println(zoo.makeSoundAtIndex(inputNaturalNumber(in)));
                    }
                    case 6 -> System.out.println(zoo.makeAllSound());
                    case 7 -> {
                        System.out.println("\nInput index of bird to fly: ");
                        choice = inputNaturalNumber(in);
                        if (choice < zoo.getZoo().size() && zoo.getZoo().get(choice) instanceof Birds)
                            System.out.println(((Birds) zoo.getZoo().get(choice)).fly());
                        else
                            System.out.println("\nThere is no bird at the specified index!");
                    }
                    case 8 ->{
                        System.out.println("\nInput index of domestic animal to show tender ");
                        choice = inputNaturalNumber(in);
                        if (choice < zoo.getZoo().size() && zoo.getZoo().get(choice) instanceof Domestic)
                            System.out.println(((Domestic) zoo.getZoo().get(choice)).tender());
                        else
                            System.out.println("\nThere is no domestic animal at the specified index!");
                    }
                    case 9 ->{
                        System.out.println("\nInput index of domestic animal to train ");
                        choice = inputNaturalNumber(in);
                        if (choice < zoo.getZoo().size() && zoo.getZoo().get(choice) instanceof Dog)
                            System.out.println(((Dog) zoo.getZoo().get(choice)).train());
                        else
                            System.out.println("\nThere is no dog to train at the specified index!");
                    }
                    case 10 -> {
                        in.close();
                        return;
                    }

                }
            }
        }


    private void inputAnimal(Scanner in) {

        System.out.println("\nInput height: ");
        int height = inputNaturalNumber(in);
        System.out.println("\nInput weight: ");
        int weight = inputNaturalNumber(in);
        System.out.println("\nInput eyes color: ");
        String eyesColor = in.next();
        System.out.println("""
                What type of animal do you enter?
                1 - Domestic
                2 - Wild
                3 - Bird
                """);
        int choice = inputNaturalNumber(in);
        switch (choice) {
            case 1 -> {
                System.out.println("\nInput nickname: ");
                String nickname = in.next();
                System.out.println("\nInput breed: ");
                String breed = in.next();
                System.out.println("\nInput vaccines: ");
                String vaccinated = in.next();
                System.out.println("\nInput wool color: ");
                String woolColor = in.next();
                System.out.println("""
                        What type of domestic animal do you enter?
                        1 - Cat
                        2 - Dog
                        """);
                choice = inputNaturalNumber(in);
                switch (choice) {
                    case 1 -> {
                        System.out.println("\nDoes the cat have hair? ");
                        boolean hasHairiness = inputBoolean(in);
                        zoo.addAnimal(new Cat(height, weight, eyesColor, nickname,
                                breed, vaccinated, woolColor, hasHairiness));
                    }
                    case 2 -> {
                        System.out.println("\nIs training available for the dog? ");
                        boolean trainingAvailability = inputBoolean(in);
                        zoo.addAnimal(new Dog(height, weight, eyesColor, nickname,
                                breed, vaccinated, woolColor, trainingAvailability));
                    }
                    default -> System.out.println("\nIncorrect choice, returning to main menu...");
                }
            }
            case 2 -> {
                System.out.println("\nInput habitat: ");
                String habitat = in.next();
                System.out.println("\nInput date when animal was found: ");
                String foundDate = in.next();
                System.out.println("""
                        What type of wild animal do you enter?
                        1 - Tiger
                        2 - Wolf
                        """);
                choice = inputNaturalNumber(in);
                switch (choice) {
                    case 1 -> zoo.addAnimal(new Tiger(height, weight, eyesColor, habitat,
                            foundDate));
                    case 2 -> {
                        System.out.println("\nIs the wolf a pack leader? ");
                        boolean packLeader = inputBoolean(in);
                        zoo.addAnimal(new Wolf(height, weight, eyesColor, habitat,
                                foundDate, packLeader));
                    }
                    default -> System.out.println("\nIncorrect choice, returning to main menu...");
                }
            }
            case 3 -> {
                System.out.println("\nInput maximum flight altitude: ");
                int flightAltitude = inputNaturalNumber(in);
                System.out.println("""
                        What type of wild animal do you enter?
                        1 - Hen
                        2 - Stork
                        """);
                choice = inputNaturalNumber(in);
                switch (choice) {
                    case 1 -> zoo.addAnimal(new Hen(height, weight, eyesColor));
                    case 2 -> zoo.addAnimal(new Stork(height, weight, eyesColor, flightAltitude));
                    default -> System.out.println("\nIncorrect choice, returning to main menu...");
                }
            }
        }
    }
    int inputNaturalNumber(Scanner in) {
        int number = 0;
        boolean checkNegative = false;

        while (!checkNegative) {

            while (!in.hasNextInt()) {
                System.out.println("You've entered not a number, please repeat input!");
                in.next();
            }
            number = in.nextInt();

            if (number < 0)
                System.out.println("You've entered a negative, please repeat input!");
            else
                checkNegative = true;
        }
        return number;
    }

    boolean inputBoolean(Scanner in) {
        boolean bool;

        while (!in.hasNextBoolean()) {
            System.out.println("You've entered not a boolean, please repeat input!");
            in.next();
        }
        bool = in.nextBoolean();
        return bool;
    }
}
