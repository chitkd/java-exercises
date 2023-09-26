package exercises.lab_03;

import java.util.Scanner;

public class Lab_03_3 {
    public static void main(String[] args) {
        // Input an integer array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the length of the integer array: ");
        int len = scanner.nextInt();
        int[] intArray = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.printf("Please input intArray[ %d ]: ", i);
            intArray[i] = scanner.nextInt();
        }

        // Sort an integer array from min to max
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[i]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println("The array after sorted: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%d  ", intArray[i]);
        }


    }
}
