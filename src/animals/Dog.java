
package animals;

public class Dog extends Mammal implements AnimalBehavior  {

    private String breed;

    public Dog() {
        this("Unknown", 0, 0.0, "Unknown", "Unknown");
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats dog food.");
    }

    @Override
    public String getVoice() {
        return "Woof woof!";
    }

    public void fetch() {
        System.out.println(getName() + " is fetching a ball.");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }
}
