package exercises.lab_06;

import java.util.Scanner;

public class Lab_06_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your string! ");
        String string = scanner.nextLine();
        System.out.println("The result after extracting digit character from the String is: " + extractDigit(string));
    }

    private static long extractDigit(String string) {
        long number = 0;
        char[] characterArray = string.toCharArray();
        String digits = "";
        for (char character : characterArray) {
            if (Character.isDigit(character)) {
                digits += character;
            }
        }
        number = Long.valueOf(digits);
        return number;
    }

}
