package exercises.lab_07.lab_07_2;

import java.util.List;

public class AnimalController {
    public static Animal winnerAnimal(List<Animal> animalList){
        Animal winnerAnimal = animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.getSpeed() > winnerAnimal.getSpeed()){
                winnerAnimal = animal;
            }
        }
        return winnerAnimal;
    }
}
