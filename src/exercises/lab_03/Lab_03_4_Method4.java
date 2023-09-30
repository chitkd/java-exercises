package exercises.lab_03;

import java.util.Scanner;

public class Lab_03_4_Method3 {
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
        while (ct1 < len1 && ct2 < len2){
            if (intArray1[ct1] < intArray2[ct2]){
                resultArray[ctM++] = intArray1[ct1++];
            } else{
                resultArray[ctM++] = intArray2[ct2++];
            }
        }

        while (ct1 < len1){
            resultArray[ctM++] = intArray1[ct1++];
        }

        while (ct2 < len2){
            resultArray[ctM++] = intArray2[ct2++];
        }


        /* While arr1 still has values && arr2 still has values
        if (arr1[ct1] < arr2[ct2])
            merged[ctM] = arr1[ct1];
            ct1++;
         else
            merged[ctM] = arr2[ct2];
            ct2++;
        ctM++;

        While ct1 < arr1Len
            Put all remaining element into merged array
        While ct2 < arr2Len
            Put all remaining element into merged array

         */

        System.out.println("The array after sorted: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.printf("%d  ", resultArray[i]);
        }

    }
}
