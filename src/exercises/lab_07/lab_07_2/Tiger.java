package exercises.lab_07.lab_07_2;

public class Tiger extends Animal{
    private final int MAX_SPEED = 100;
    private static final String DEFAULT_NAME = "Tiger";
    public Tiger() {
        this.name = DEFAULT_NAME;
        this.speed = this.randomSpeed(MAX_SPEED);
    }
}
