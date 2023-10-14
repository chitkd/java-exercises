package exercises.lesson_8;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0){
            throw new IllegalArgumentException("Age can't be less than ZERO");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
