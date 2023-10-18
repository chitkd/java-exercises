package exercises.lab_09;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    protected String name;
    protected int speed;
    protected boolean isFlyable;


    protected AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.isFlyable = builder.isFlyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    public boolean isFlyable() {
        return isFlyable;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean isFlyable;

        // WRITE ONLY
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int maxSpeed) {
            if (maxSpeed == 0) {
                this.speed = 0;
            } else {
                this.speed = new SecureRandom().nextInt(maxSpeed);
            }
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            isFlyable = flyable;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }
}
