
package animals;

public class Blowfish extends Fish implements AnimalBehavior {

    private boolean poisonous;

    public Blowfish() {
        this("Unknown", 0, 0.0, "Unknown", true);
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, int age, boolean poisonous) {
        super(name, age);
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats small aquatic animals.");
    }

    @Override
    public String getVoice() {
        return "Blowfish makes no audible sound.";
    }

    public void inflate() {
        System.out.println(getName() + " inflates its body.");
    }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() +
                ", poisonous=" + poisonous + "}";
    }
    @Override
    public void sleep() {
        System.out.println("Blowfish is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }
}
