package exercises.lab_07.lab_07_2;

import java.util.Arrays;

public class TestAnimalController {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        Animal winnerAnimal = AnimalController.getWinnerAnimal(Arrays.asList(horse, tiger, dog));
        System.out.println("Winner is " + winnerAnimal.getName() + " with speed: " + winnerAnimal.getSpeed());
    }
}
