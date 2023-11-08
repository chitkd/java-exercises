package exercises.lab_12;

import java.security.SecureRandom;

public class Horse extends AnimalWithBuilder implements AnimalRace{

    private static final float MIN_SPEED = 15;
    private static final float MAX_SPEED = 24;

    public Horse(Builder builder) {
        super(builder);
        this.type = "Horse";
        this.leg = 4;
        this.speed = speed();
    }

    @Override
    public float speed() {
        return MIN_SPEED + new SecureRandom().nextFloat() * (MAX_SPEED-MIN_SPEED);
    }
}
