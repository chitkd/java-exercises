package exercises.lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private final int MAX_SPEED = 100;
    private static final String DEFAULT_NAME = "Tiger";
    public Tiger() {
        this.name = DEFAULT_NAME;
        this.speed = this.randomSpeed(MAX_SPEED);
    }

    @Override
    int randomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }
}
