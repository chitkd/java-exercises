package exercises.lab_12;

import java.security.SecureRandom;

public class Tiger extends AnimalWithBuilder implements AnimalRace{
    private static final float MIN_WEIGHT = 250;
    private static final float MAX_WEIGHT = 400;
    private static final float RATE = 0.06F;

    public Tiger(Builder builder) {
        super(builder);
        this.type = "Tiger";
        this.leg = 4;
        this.speed = speed();
    }

    @Override
    public float speed() {
        return RATE * (MIN_WEIGHT + new SecureRandom().nextFloat() * (MAX_WEIGHT - MIN_WEIGHT));
    }
}
