package lesson_2;

import java.util.Scanner;

public class MultipleElse {
    public static void main(String[] args) {
        final int MINIMUM_AGE = 18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int userAge = scanner.nextInt();

        if (userAge < MINIMUM_AGE) {
            System.out.println("Khong ban!");
            if (userAge <= 12) {
                System.out.println("Calling 911");
            }
        } else if (userAge <= 55) {
            System.out.println("Unlimited");
        } else {
            System.out.println("Sell 2 bottles");
        }

    }
}
