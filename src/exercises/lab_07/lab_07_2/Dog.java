package exercises.lab_07.lab_07_2;
public class Dog extends Animal {
    private static final int MAX_SPEED = 60;
    private static final String DEFAULT_NAME = "Dog";

    public Dog() {
        this.name = DEFAULT_NAME;
        this.speed = this.randomSpeed(MAX_SPEED);
    }
}
