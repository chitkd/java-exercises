package exercises.lab_07.lab_07_2;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static final int MAX_SPEED = 60;
    private static final String DEFAULT_NAME = "Dog";

    public Dog() {
        this.setSpeed(randomSpeed(MAX_SPEED));
        this.setName(DEFAULT_NAME);
    }
}
