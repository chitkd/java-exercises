package exercises.lab_12;

import java.security.SecureRandom;
import java.util.*;

public class AnimalController {

    public static String guessWinnerAnnimalGame(){
        int guessTimes = 10 + new SecureRandom().nextInt(2);
        return getWinnerAnimalTypeAfterSomeTimes(guessTimes);
    }

    public static String getWinnerAnimalTypeAfterSomeTimes(int times) {

        List<AnimalWithBuilder> winnerList = new ArrayList();
        while (times > 0){
            System.out.println("----TIME: " + times);
            AnimalWithBuilder horse1 = new Horse(new AnimalWithBuilder.Builder().setName("horse1"));
            AnimalWithBuilder horse2 = new Horse(new AnimalWithBuilder.Builder().setName("horse2"));

            AnimalWithBuilder elephant1 = new Elephant(new AnimalWithBuilder.Builder().setName("elephant1"));
            AnimalWithBuilder elephant2 = new Elephant(new AnimalWithBuilder.Builder().setName("elephant2"));

            AnimalWithBuilder tiger1 = new Tiger(new AnimalWithBuilder.Builder().setName("tiger1"));
            AnimalWithBuilder tiger2 = new Tiger(new AnimalWithBuilder.Builder().setName("tiger2"));

            List<AnimalWithBuilder> animalList = new ArrayList<>();
            animalList.add(horse1);
            animalList.add(horse2);
            animalList.add(elephant1);
            animalList.add(elephant2);
            animalList.add(tiger1);
            animalList.add(tiger2);

            List<AnimalWithBuilder> fourLegsAnimalList = filterFourLegsAnimal(animalList);
            AnimalWithBuilder winnerAnimal = getWinnerAnimal(fourLegsAnimalList);
            System.out.println("=> WINNER is: " + winnerAnimal.type);
            winnerList.add(winnerAnimal);
            times--;
        }
        return getFinalWinnerAnimalType(winnerList);


        /*
        if (animalList.size() > 0) {
            List<AnimalWithBuilder> fourLegsAnimalList = filterFourLegsAnimal(animalList);
            while (times > 0){
                AnimalWithBuilder winnerAnimal = getWinnerAnimal(fourLegsAnimalList);
                winnerList.add(winnerAnimal);
                times--;
            }
            return getFinalWinnerAnimalType(winnerList);
        }
        else {
            throw new IllegalArgumentException("The animal list can't be empty");
        }
        */

    }

    public static List<AnimalWithBuilder> filterFourLegsAnimal(List<AnimalWithBuilder> animalList){
        List<AnimalWithBuilder> fourLegsAnimal = new ArrayList<>();
        if (animalList.size() > 0) {
            for (AnimalWithBuilder animal : animalList) {
                if (animal.leg == 4) {
                    fourLegsAnimal.add(animal);
                }
            }
            return fourLegsAnimal;
        }
        else {
            throw new IllegalArgumentException("The animal list can't be empty");
        }
    }

    public static AnimalWithBuilder getWinnerAnimal(List<AnimalWithBuilder> animalList) {
        // TODO: what if animalList is null or empty
        if (animalList.size() > 0) {
            AnimalWithBuilder winnerAnimal = animalList.get(0);
            for (AnimalWithBuilder animal : animalList) {
                System.out.println("Name: " + animal.name);
                System.out.println("Speed: " + animal.speed);
                if (animal.speed > winnerAnimal.speed) {
                    winnerAnimal = animal;
                }
            }
            return winnerAnimal;
        }
        else {
            throw new IllegalArgumentException("The animal list can't be empty");
        }
    }

    public static String getFinalWinnerAnimalType(List<AnimalWithBuilder> winnerAnimalList) {
        // TODO: what if animalList is null or empty
        if (winnerAnimalList.size() > 0) {
            List<String> animalTypeList = new ArrayList<>();
            Set<String> animalTypeSet = new HashSet<String>();
            HashMap<Integer, String> countWinnerAnimalEachType = new HashMap<Integer, String>();

            for (AnimalWithBuilder animal : winnerAnimalList) {
               animalTypeList.add(animal.type);
               animalTypeSet.add(animal.type);
            }

            int max = 0;
            for (String animalType : animalTypeSet) {
                int count = Collections.frequency(animalTypeList, animalType);
                if (count > max){
                    max = count;
                }
                System.out.println("Type: " + animalType + ", count: " + count);
                countWinnerAnimalEachType.put(count, animalType);
            }
            return findAnimalType(countWinnerAnimalEachType, max);
        }
        else {
            throw new IllegalArgumentException("The animal list can't be empty");
        }
    }

    private static String findAnimalType(HashMap<Integer, String> countWinnerAnimalEachType, int key){
        if (countWinnerAnimalEachType.size() > 0){
            return countWinnerAnimalEachType.get(key);
        }
        else {
            throw new IllegalArgumentException("The integer list can't be empty");
        }
    }
}
