package lessons.lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDeclaration {
    public static void main(String[] args) {
        // CRUD - Create Read Update Delete
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 4, 2, 3, 4, 5));
        myList.add(6);
        myList.set(0, 10);
        for (int value : myList) {
            System.out.println(value);
        }
    }
}
