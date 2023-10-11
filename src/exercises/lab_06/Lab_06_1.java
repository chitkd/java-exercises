package exercises.lab_06;

import java.util.Scanner;

public class Lab_06_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String is: ");
        String string = scanner.nextLine();
        System.out.println("The minutes in total is: " + calculateTotalMinutes(string));
    }

    public static int calculateTotalMinutes(String timeString) {
        int totalMinutes = 0;
        String[] hourAndMinute = timeString.split("and");
        String hourString = hourAndMinute[0];
        String minuteString = hourAndMinute[1];

        int hour = convertToNumber(hourString);
        int minute = convertToNumber(minuteString);
        totalMinutes = hour * 60 + minute;
        return totalMinutes;
    }

    private static int convertToNumber(String string) {
        String time = string.replaceAll("[^0-9]", "");
        return Integer.parseInt(time);
    }
}
