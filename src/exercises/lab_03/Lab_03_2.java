package exercises.lab_03;

import java.util.Scanner;

public class Lab_03_2 {
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

        // Finding maximum value/minimum value from an integer array
        int min = intArray[0];
        int max = intArray[0];
        for (int i = 1; i < len; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.printf("The maximum value from the integer array is: %d\n", max);
        System.out.printf("The minimum value from the integer array is: %d\n", min);
    }
}
