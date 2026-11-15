
package animals;

public class Pigeon extends Bird implements AnimalBehavior  {

    private String species;

    public Pigeon() {
        this("Unknown", 0, 0.0, "Unknown", "Unknown");
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats grains and seeds.");
    }

    @Override
    public String getVoice() {
        return "Coo coo!";
    }

    public void returnHome() {
        System.out.println(getName() + " is returning home.");
    }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() +
                ", species='" + species + "'}";
    }
    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon flies.");
    }
}
