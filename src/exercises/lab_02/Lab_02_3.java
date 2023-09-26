package exercises.lab_02;

import java.util.Scanner;

public class Lab_02_3 {
    public static void main(String[] args) {
        /* Get input from user about height(m) and weight(kg) then calculate BMI
            + BMI < 18.5 -> Should increase your weight
            + 18.5 <= BMI < 25 -> Should keep your current weight
            + 25 <= BMI -> Should decrease your weight
            BMI = weight / (height x 2)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height(m): ");
        double height = scanner.nextFloat();
        System.out.println("Please input your weight(kg): ");
        double weight = scanner.nextFloat();
        double bmi = weight / Math.pow(height, 2.0);
        double variation = 0;
        if (bmi < 18.5) {
            variation = Math.abs(weight - 18.5 * Math.pow(height, 2.0));
            System.out.println(variation);
            System.out.printf("You should increase your weight by %f kg", variation);
        } else if (bmi < 25) {
            System.out.println("You should keep your current weight");
        } else{
            variation = Math.abs(weight - 25 * Math.pow(height, 2.0));
            System.out.printf("You should decrease your weight by %f kg", variation);
        }
    }
}
