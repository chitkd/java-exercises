package lessons.lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        // CRUD - Create Read Update Delete
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 4, 2, 3, 4, 5));
        myList.add(2);
        System.out.println(myList.indexOf(4));
        myList.remove(4);
        myList.remove(Integer.valueOf(5));
        myList.set(0, 1000);
        myList.contains(5);
        myList.isEmpty();
        myList.size();
    }
}
