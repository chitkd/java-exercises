package lessons.lesson_2;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++;

        //prefix  > right operand > assign
        System.out.println("a = " + a);
    }
}
