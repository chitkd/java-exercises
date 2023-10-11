package exercises.lab_03;

import java.util.Scanner;

public class Lab_03_1 {
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

        // Count how many odd, even number(s) in an integer array
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        //System.out.printf("The number of even numbers: %d\n", evenCount);
        System.out.println("The number of even numbers: \n" + evenCount);
        System.out.printf("The number of odd numbers: %d", oddCount);
    }
}
