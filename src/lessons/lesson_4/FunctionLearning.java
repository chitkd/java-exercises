package lessons.lesson_4;

public class FunctionLearning {
    public static void main(String[] args) {
        boolean isContinuing = true;
        while (isContinuing){
            printGameMenu();
            int userOption = getUserOption();
            if (userOption == 0){

            } else if (userOption == 1) {

            }
            else {

            }
        }
    }

    // access modifier(public - class method?(static - OPTINAL) - return type (void - function Name(parameter1, p2) (OPTIONAL) {function's body}
    // Method signature | UNIQUE

    // a set of instructions to do a task
    // start with a verb - camelCase
    //meaningful / Express closet what it does
    private static void printGameMenu() {
        System.out.println("=== GAME MENU ===");
        System.out.println("1. Generator a random number");
        System.out.println("0. Exit");
    }

    public static int getUserOption() {
        return 0;
    }
}
