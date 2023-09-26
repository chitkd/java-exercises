package exercises.lab_02;

import java.util.Scanner;

public class Lab_02_1 {
    public static void main(String[] args) {
        /* Get input from user about height(m) and weight(kg) then calculate BMI
            + Underweight: BMI < 18.5
            + Normal weight: 18.5 <= BMI < 25
            + Overweight: 25 <= BMI < 30
            + Obesity: BMI >= 30
            BMI = weight / (height x 2)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height(m): ");
        double height = scanner.nextFloat();
        System.out.println("Please input your weight(kg): ");
        double weight = scanner.nextFloat();
        double bmi = weight / Math.pow(height, 2.0);

        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi < 25) {
            System.out.println("You are Normal weight");

        } else if (bmi < 30) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You are Obesity");
        }
    }
}
