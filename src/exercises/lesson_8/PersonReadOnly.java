package exercises.lesson_8;

public class PersonReadOnly {
    private String name;
    private int age;

    public PersonReadOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        PersonReadOnly teo = new PersonReadOnly("Teo", 18);
        teo.getAge();
    }
}
