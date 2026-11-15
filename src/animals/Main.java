
package animals;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = createAnimals();

        displayAnimals(animals);

        demonstrateSpecialBehaviors(animals);
    }

    private static Animal[] createAnimals() {

        Animal[] animals = new Animal[6];

        animals[0] = new Mammal("Elephant", 15, 5000.0, "Grey");
        animals[1] = new Bird("Eagle", 5);
        animals[2] = new Fish("Goldfish", 2, 0.2, "Freshwater");
        animals[3] = new Dog("Buddy", 4, "Golden Retriever");
        animals[4] = new Blowfish("Puffer", 3, true);
        animals[5] = new Pigeon("Rocky", 2, "Rock Pigeon");

        return animals;
    }

    private static void displayAnimals(Animal[] animals) {

        for (Animal animal : animals) {

            System.out.println(animal);
            animal.eat();

            System.out.println("Voice: " + animal.getVoice());
            System.out.println();
        }
    }

    private static void demonstrateSpecialBehaviors(Animal[] animals) {

        ((Mammal) animals[0]).giveBirth();
        ((Bird) animals[1]).fly();
        ((Fish) animals[2]).swim();
        ((Dog) animals[3]).fetch();
        ((Blowfish) animals[4]).inflate();
        ((Pigeon) animals[5]).returnHome();
    }
}
