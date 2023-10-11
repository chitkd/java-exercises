package exercises.lab_06;

import java.util.Scanner;

public class Lab_06_2 {
    public static void main(String[] args) {
        int time = 3;
        String myPassword = "password123";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input your password! ");
            String password = scanner.nextLine();
            System.out.println("DEFAULT: " + password);
            System.out.println("input: " + myPassword);
            if (password.equals(myPassword)) {
                System.out.println("Congrats!!!");
                break;
            }
            time--;
        } while (time > 0);
    }


}
