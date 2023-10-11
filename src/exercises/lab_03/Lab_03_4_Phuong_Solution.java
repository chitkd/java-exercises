package exercises.lab_03;

import java.util.Scanner;

public class Lab_03_4_Phuong_Solution {
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

        // Merge 2 SORTED integer array into one array
        int[] resultArray = new int[len1 + len2];
        int ctM = 0;
        int ct1 = 0;
        int ct2 = 0;

        while (ctM < resultArray.length) {
            if (ct1 == intArray1.length) {
                resultArray[ctM++] = intArray2[ct2++];
            } else if (ct2 == intArray2.length) {
                resultArray[ctM++] = intArray1[ct1++];
            } else if (intArray1[ct1] > intArray2[ct2]) {
                resultArray[ctM++] = intArray2[ct2++];
            } else {
                resultArray[ctM++] = intArray1[ct1++];
            }
        }

        System.out.println("The array after sorted: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.printf("%d  ", resultArray[i]);
        }



    }
}
