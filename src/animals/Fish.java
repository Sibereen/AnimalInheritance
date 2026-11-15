
package animals;

import java.security.DigestException;

public class Fish extends Animal {

    private String waterType;

    public Fish() {
        this("Unknown", 0, 0.0, "Unknown");
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, int age) {
        super(name, age);
        this.waterType = "Unknown";
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats aquatic food.");
    }

    @Override
    public String getVoice() {
        return "Fish makes no audible sound.";
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() +
                ", waterType='" + waterType + "'}";
    }
}