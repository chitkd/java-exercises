package exercises.lab_09;

import exercises.lab_09.AnimalWithBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public static AnimalWithBuilder getWinnerAnimal(List<AnimalWithBuilder> animalList) {
        // TODO: what if animalList is null or empty
        if (animalList.size() > 0) {
            AnimalWithBuilder winnerAnimal = animalList.get(0);
            for (AnimalWithBuilder animal : animalList) {
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

    public static List<AnimalWithBuilder> filterNoFlyableAnimal(List<AnimalWithBuilder> animalList){
        List<AnimalWithBuilder> noFlyableAnimalList = new ArrayList<>();
        if (animalList.size() > 0) {
            for (AnimalWithBuilder animal : animalList) {
                if (!animal.isFlyable()) {
                    noFlyableAnimalList.add(animal);
                }
            }
            return noFlyableAnimalList;
        }
        else {
            throw new IllegalArgumentException("The animal list can't be empty");
        }
    }
}
