package exercises.lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {
    private static final int MAX_SPEED = 75;
    private static final String DEFAULT_NAME = "Horse";

    public Horse() {
        this.name = DEFAULT_NAME;
        this.speed = this.randomSpeed(MAX_SPEED);
    }

    @Override
    int randomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
