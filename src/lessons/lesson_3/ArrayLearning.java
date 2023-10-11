package lessons.lesson_3;

public class ArrayLearning {
    public static void main(String[] args) {
        int[] myIntArra = new int[5];
        for (int index = 0; index <= myIntArra.length; index++) {
            System.out.println(myIntArra[index]);
        }

        for (int i = 0; i < myIntArra.length; i++) {
            System.out.println(myIntArra[i]);
        }
        // Enhanced for loop
        for (int num : myIntArra){
            System.out.println(num);
        }
    }
}
