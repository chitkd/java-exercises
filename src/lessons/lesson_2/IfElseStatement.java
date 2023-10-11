package lessons.lesson_2;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter arrival time: ");
        int inputArrivalTime = scanner.nextInt();
        // Comparison operator: ==, !=, >, <, >=, <=
        boolean isHeOnTime = (inputArrivalTime <= 7);
        if(isHeOnTime){
            System.out.println("Let's talk");
        } else {
                System.out.println("Write a letter");
        }
    }
}
