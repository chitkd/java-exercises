package exercises.lesson_8;

public class PersonWriteOnly {
    private String name;
    private int age;

    public PersonWriteOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        PersonWriteOnly teo = new PersonWriteOnly("Teo", 18);
        teo.setAge(19);
    }
}
