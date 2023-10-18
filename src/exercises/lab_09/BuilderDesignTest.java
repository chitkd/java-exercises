package exercises.lab_09;


import java.util.*;

import static exercises.lab_09.AnimalWithBuilder.Builder;

public class BuilderDesignTest {
    public static void main(String[] args) {


        // Chaining method
        // . | Dot notation
        AnimalWithBuilder dog = new Builder()
                .setName("Dog")
                .setFlyable(false)
                .setSpeed(60)
                .build();

        AnimalWithBuilder tiger = new Builder()
                .setName("Tiger")
                .setFlyable(false)
                .setSpeed(100)
                .build();

        AnimalWithBuilder horse = new Builder()
                .setName("Horse")
                .setFlyable(false)
                .setSpeed(75)
                .build();

        AnimalWithBuilder falcon = new Builder()
                .setName("Falcon")
                .setFlyable(true)
                .setSpeed(0)
                .build();

        AnimalWithBuilder eagle = new Builder()
                .setName("Eagle")
                .setFlyable(true)
                .setSpeed(0)
                .build();

        AnimalWithBuilder snake = new Builder()
                .setName("Snake")
                .setFlyable(false)
                .setSpeed(0)
                .build();

        // Immutable
        List<AnimalWithBuilder> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(falcon);
        animalList.add(eagle);
        animalList.add(snake);

        // Filter the animal list to get non-flyable animals and allow them to join the racing contest
        List<AnimalWithBuilder> noFlyableAnimalList = AnimalController.filterNoFlyableAnimal(animalList);

        // Get the winner of the racing contest and print its information
        AnimalWithBuilder winnerAnimal = AnimalController.getWinnerAnimal(noFlyableAnimalList);
        System.out.println("Winner is " + winnerAnimal.getName() + " with speed: " + winnerAnimal.getSpeed());
    }
}
