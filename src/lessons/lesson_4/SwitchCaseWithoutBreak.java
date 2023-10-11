package lessons.lesson_4;

import java.util.Scanner;

public class SwitchCaseWithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInputNumber = scanner.nextInt();

        switch (userInputNumber) {
            case 2:
            case 3:
            case 4:
                System.out.println("Weekdays!");
                break;
            case 7:
                System.out.println("Weekends!");
                break;
            default:
                System.out.println("Oh no");
        }
    }
}
