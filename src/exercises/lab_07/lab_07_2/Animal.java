package exercises.lab_07.lab_07_2;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private int speed;

    public Animal() {
    }

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static int randomSpeed(int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed);
    }
}
