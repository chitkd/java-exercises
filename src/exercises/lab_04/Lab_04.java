package exercises.lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Lab_04 {
    public static void main(String[] args) {
        /* Generate an ArrayList with random numbers (not fixed numbers) those are less than 1000
        After that, have a menu (can use while loop) to have below options

        =====MENU=====
        1. Print all numbers
        2. Print maximum value
        3. Print minimum value
        4. Search number
        Option 4: We allow user to input a number to search,
        if that number is existing in arraylist,
        we print the number and its index. Otherwise,
        print that number is not in the list
         */

        int arrayLength = new SecureRandom().nextInt(10) + 1;
        int upperBound = 1000;
        System.out.println("Array Length is: " + arrayLength);
        List<Integer> randomArrayList = randomArrayListLessThanUpperBound(arrayLength, upperBound);
        System.out.println("The array list is: " + randomArrayList.toString());
        boolean isContinuing = true;
        int userOption;
        do {
            printGameMenu();
            System.out.println("Please input your option!");
            userOption = inputANumber();
            switch (userOption) {
                case 1:
                    System.out.println("All numbers in the array: ");
                    printAllNumbers(randomArrayList);
                    break;
                case 2:
                    System.out.println("The maximum value in the array is " + printMaximumValue(randomArrayList));
                    break;
                case 3:
                    System.out.println("The minimum value in the array is " + printMinimumValue(randomArrayList));
                    break;
                case 4:
                    System.out.println("Please input one number to search: ");
                    int searchNumber = inputANumber();
                    List<Integer> indexList = searchNumber(searchNumber, randomArrayList);
                    if (indexList.size() > 0){
                        System.out.println("The indexes of " + searchNumber + " in the list: ");
                        System.out.println(indexList.toString());
                    }
                    else {
                        System.out.println(searchNumber + " is not in the list");
                    }
                    break;
                default:
                    isContinuing = false;
            }
        } while (isContinuing);

    }

    private static int printMinimumValue(List<Integer> arrayList) {
        int min = arrayList.get(0);
        for (Integer number : arrayList) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    private static int printMaximumValue(List<Integer> arrayList) {
        int max = arrayList.get(0);
        for (Integer number : arrayList) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    private static void printAllNumbers(List<Integer> arrayList) {
        System.out.println(arrayList);
    }

    private static List<Integer> searchNumber(int searchNumber, List<Integer> arrayList) {
        List<Integer> indexList = new ArrayList<>();
        for (int index = 0; index < arrayList.size(); index++) {
            if (arrayList.get(index) == searchNumber)
            {
                indexList.add(index);
            }
        }
        return indexList;
    }

    private static void printGameMenu() {
        System.out.println("=====MENU=====\n" +
                "1. Print all numbers\n" +
                "2. Print maximum value\n" +
                "3. Print minimum value\n" +
                "4. Search number");
    }

    public static List<Integer> randomArrayListLessThanUpperBound(int arrayLength, int upperBound){
        List<Integer> resultList = new ArrayList<>(arrayLength);
        int number=0;
        for (int index = 0; index < arrayLength; index++) {
            resultList.add(index, new SecureRandom().nextInt(upperBound));
        }
        return resultList;
    }

    public static int inputANumber() {
        return (new Scanner(System.in).nextInt());
    }
}
