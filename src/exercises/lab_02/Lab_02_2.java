package exercises.lab_02;

import java.util.Scanner;

public class Lab_02_2 {
    public static void main(String[] args) {
        // Allow user to input a number, print out it’s an odd or even number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.printf("%d is a even number", number);
        }
        else {
            System.out.printf("%d is a odd number", number);
        }
    }
}
