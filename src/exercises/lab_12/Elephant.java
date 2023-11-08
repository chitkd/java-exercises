package exercises.lab_12;

import java.security.SecureRandom;

public class Elephant extends AnimalWithBuilder implements AnimalRace{
    private static final float MIN_STRIDE_LENGTH = 3;
    private static final float MAX_STRIDE_LENGTH = 4;
    private static final float RATE = 6;
    public Elephant(Builder builder) {
        super(builder);
        this.type = "Elephant";
        this.leg = 4;
        this.speed = speed();
    }

    @Override
    public float speed() {
        return RATE * (3 + new SecureRandom().nextFloat());
    }
}
