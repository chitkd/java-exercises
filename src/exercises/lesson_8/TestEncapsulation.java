package exercises.lesson_8;

public class TestEncapsulation {
    public static void main(String[] args) {
        Person teo = new Person("teo", -18);
        System.out.printf("My name is: %s\n and I'm %s years old", teo.getName(),  teo.getAge());
    }
}
