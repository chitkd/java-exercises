package exercises.lab_07.lab_07_2;

public class Horse extends Animal{
    private static final int MAX_SPEED = 75;
    private static final String DEFAULT_NAME = "Horse";

    public Horse() {
        this.name = DEFAULT_NAME;
        this.speed = this.randomSpeed(MAX_SPEED);
    }


}
