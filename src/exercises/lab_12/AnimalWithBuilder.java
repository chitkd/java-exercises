package exercises.lab_12;

public class AnimalWithBuilder {
    protected String name;
    protected String type;
    protected int leg;

    protected float speed;


    public AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.leg = builder.leg;
        this.speed = builder.speed;
    }

    public String getName() {
        return name;
    }

    public int getLeg() {
        return leg;
    }

    public String getType() {
        return type;
    }

    public float getSpeed() {
        return speed;
    }

    public static class Builder{
        private String name;
        private String type;
        private int leg;
        private float speed;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLeg(int leg) {
            this.leg = leg;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setSpeed(float speed) {
            this.speed = speed;
            return this;
        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }
    }
}
