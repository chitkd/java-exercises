package exercises.lab_10;

import java.util.List;

public class AnimalController {
    public static Animal getWinnerAnimal(List<Animal> animalList) {
        // TODO: what if animalList is null or empty
        if (animalList.size() > 0) {
            Animal winnerAnimal = animalList.get(0);
            for (Animal animal : animalList) {
                if (animal.getSpeed() > winnerAnimal.getSpeed()) {
                    winnerAnimal = animal;
                }
            }
            return winnerAnimal;
        }
        else {
            throw new IllegalArgumentException("The animal list can't be empty");
        }
    }
}
