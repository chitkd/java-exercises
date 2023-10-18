package exercises.lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static final int MAX_SPEED = 60;
    private static final String DEFAULT_NAME = "Dog";

    public Dog() {
        this.name = DEFAULT_NAME;
        this.speed = this.randomSpeed(MAX_SPEED);
    }

    @Override
    int randomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
