package exercises.lab_03;

import java.util.Scanner;

public class Lab_03_4_Method1 {
    public static void main(String[] args) {
        // Input an integer array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the length of the first integer array: ");
        int len1 = scanner.nextInt();
        int[] intArray1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            System.out.printf("Please input intArray[ %d ]: ", i);
            intArray1[i] = scanner.nextInt();
        }

        System.out.println("Please input the length of the second integer array: ");
        int len2 = scanner.nextInt();
        int[] intArray2 = new int[len2];
        for (int i = 0; i < len2; i++) {
            System.out.printf("Please input intArray[ %d ]: ", i);
            intArray2[i] = scanner.nextInt();
        }

        // Merge 2 SORTED integer array into one SORTED array
        int[] resultArray = new int[len1 + len2];
        int index = 0;
        for (int i = 0; i < intArray1.length;i++) {
            for (int j = 0; j < intArray2.length; j++) {
                if (intArray2[j] < intArray1[i]) {
                    int temp = intArray1[i];
                    intArray1[i] = intArray2[j];
                    intArray2[j] = temp;
                }
            }
            resultArray[index++] = intArray1[i];
        }

        for (int i = 0; i < intArray2.length; i++) {
            for (int j = i + 1; j < intArray2.length; j++) {
                if (intArray2[j] < intArray2[i]) {
                    int temp = intArray2[i];
                    intArray2[i] = intArray2[j];
                    intArray2[j] = temp;
                }
            }
        }

        for (int i = 0; i < intArray2.length; i++) {
            resultArray[index++] = intArray2[i];
        }

        System.out.println("The array after sorted: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.printf("%d  ", resultArray[i]);
        }

    }
}
