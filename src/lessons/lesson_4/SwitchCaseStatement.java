package lessons.lesson_4;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInputNumber = scanner.nextInt();

        switch (userInputNumber){
            case 1:
                System.out.println("Giai nhat!!");
                //break;
            case 2:
                System.out.println("Giai nhi!!");
                //break;
            case 3:
                System.out.println("Gai ba!");
                //break;
            default:
                System.out.println("Cam on ban da tham gia chuong trinh");
        }
    }
}
