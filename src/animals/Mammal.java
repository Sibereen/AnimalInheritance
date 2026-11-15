package animals;

public class Mammal extends Animal {

    private String furColor;

    public Mammal() {
        this("Unknown", 0, 0.0, "Unknown");
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, int age) {
        super(name, age);
        this.furColor = "Unknown";
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats plants or meat.");
    }

    @Override
    public String getVoice() {
        return "Mammal sound";
    }

    public void giveBirth() {
        System.out.println(getName() + " gives birth to live young.");
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() +
                ", furColor='" + furColor + "'}";
    }
}