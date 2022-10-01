package Homeworks.S2Hw1Zoo;

import Homeworks.S2Hw1Zoo.Abstract.Animal;
import Homeworks.S2Hw1Zoo.Abstract.Birds;
import Homeworks.S2Hw1Zoo.Abstract.Domestic;
import Homeworks.S2Hw1Zoo.Abstract.Wild;
import Homeworks.S2Hw1Zoo.Interfaces.Ihairiness;
import Homeworks.S2Hw1Zoo.Interfaces.IpackLeader;
import Homeworks.S2Hw1Zoo.Interfaces.ItrainingAvailability;

import java.util.LinkedList;


public class Zoo {
    private final LinkedList<Animal> zoo;

    public Zoo() {
        zoo = new LinkedList<>();
    }
    public LinkedList<Animal> getZoo() {
        return zoo;
    }
    public void addAnimal(Animal animal) {
        zoo.add(animal);
    }

    public void removeAnimal(int i) {
        if (i < 0 || i >= zoo.size())
            System.out.println("There is no animal at specified index!");
        else {
            System.out.printf("Animal %s at index %d was removed from zoo!\n", zoo.get(i).getClass().getSimpleName(), i);
            zoo.remove(i);
        }
    }

    public String getAnimalInfo(int i) {
        if (i < 0 || i >= zoo.size())
            return "There is no animal at specified index!";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("""
                            Information about %s at index %d:
                            Height: %d cm
                            Weight: %f kg
                            Eyes color: %s
                            """,
                    zoo.get(i).getClass().getSimpleName(), i,
                    zoo.get(i).getHeight(),
                    zoo.get(i).getWeight(),
                    zoo.get(i).getEyesColor()));

            if (zoo.get(i) instanceof Birds)
                sb.append(String.format("Flight altitude: %s m\n",
                        ((Birds) zoo.get(i)).getFlightAltitude()));

            else if (zoo.get(i) instanceof Domestic)
                sb.append(String.format("""
                            Nickname: %s
                            Breed: %s
                            Vaccinated: %s
                            Wool color: %s
                            """,
            ((Domestic) zoo.get(i)).getNickname(),
            ((Domestic) zoo.get(i)).getBreed(),
            ((Domestic) zoo.get(i)).getVaccinated(),
            ((Domestic) zoo.get(i)).getWoolColor()));

            else if (zoo.get(i) instanceof Wild)
                sb.append(String.format("""
                            Habitat: %s
                            Found date: %s
                            """,
                        ((Wild) zoo.get(i)).getHabitat(),
                        ((Wild) zoo.get(i)).getFoundDate()));

            if (zoo.get(i) instanceof Ihairiness)
                sb.append(String.format("Hairiness: %b\n",
                        ((Ihairiness) zoo.get(i)).hasHairiness()));
            if (zoo.get(i) instanceof ItrainingAvailability)
                sb.append(String.format("Training availability: %b\n",
                        ((ItrainingAvailability) zoo.get(i)).hasTrainingAvailability()));
            if (zoo.get(i) instanceof IpackLeader)
                sb.append(String.format("Pack leader: %b\n",
                        ((IpackLeader) zoo.get(i)).isPackLeader()));

            return sb.toString();
        }
    }

    public String makeSoundAtIndex(int i) {
        if (i < 0 || i >= zoo.size())
            return ("There is no animal with specified index!");
        else
            return zoo.get(i).makeSound();
    }

    public String makeAllSound () {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : zoo)
            sb.append(animal.makeSound()).append("\n");
        return sb.toString();
    }
}
