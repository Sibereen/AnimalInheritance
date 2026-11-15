
package animals;

public class Bird extends Animal {

    private String featherColor;

    public Bird() {
        this("Unknown", 0, 0.0, "Unknown");
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age) {
        super(name, age);
        this.featherColor = "Unknown";
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats seeds and insects.");
    }

    @Override
    public String getVoice() {
        return "Tweet tweet!";
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString() +
                ", featherColor='" + featherColor + "'}";
    }
}
