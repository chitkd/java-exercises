package lessons.lesson_4;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoopLearning {
    public static void main(String[] args) {
        /*
         * Allow user to have 3 guesses from 0-9
         * If: matched -> Hooray!
         * Else: Good luck!...
         * */
        int guessingTime = 0;
        final int MAX_GUESSTING_TIME = 3;
        int randomNumber = new SecureRandom().nextInt(10);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int userInputNumber = scanner.nextInt();

            if (userInputNumber == randomNumber) {
                System.out.println("Hooray!");
                break;
            }
            guessingTime++;
        } while (guessingTime < MAX_GUESSTING_TIME);

        if (guessingTime == MAX_GUESSTING_TIME) {
            System.out.println("Good luck next time!");
        }
    }
}
