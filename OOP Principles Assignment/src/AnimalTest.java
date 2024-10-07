import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        // ArrayLists for each type of animal
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Mammal> mammals = new ArrayList<>();
        ArrayList<Bird> birds = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Parrot> parrots = new ArrayList<>();

        // Adding instances to each list
        animals.add(new Mammal());
        animals.add(new Bird());
        animals.add(new Dog("Colly"));
        animals.add(new Dog("jonny"));





        // Adding to the mammal list
        mammals.add(new Mammal());
        mammals.add(new Mammal());
        mammals.add(new Mammal("Tiger"));
        mammals.add(new Mammal("Beagle"));

        // Adding to the bird list
        birds.add(new Bird());
        birds.add(new Bird());
        birds.add(new Bird("Polly"));
        birds.add(new Bird("Robin"));


        // Adding to the dogs list
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog("Polly"));
        dogs.add(new Dog("Robin"));

        // Adding to the parrot list
        parrots.add(new Parrot());
        parrots.add(new Parrot());
        parrots.add(new Parrot("Polly"));
        parrots.add(new Parrot("Robin"));
        System.out.println("\n");


        // Making sounds
        System.out.println("Animals making sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }
        System.out.println("\n");

        System.out.println("Mammals making sounds:");
        for (Mammal mamu: mammals) {
            mamu.makeSound();
        }
        System.out.println("\n");
        System.out.println("Birds making sounds:");
        for (Bird Birdu : birds) {
            Birdu.makeSound();
        }
        System.out.println("\n");
        System.out.println("Dogs making sounds:");
        for (Dog Dogi : dogs) {
            Dogi.makeSound();
        }
        System.out.println("\n");
        System.out.println("Parrots making sounds:");
        for (Parrot peeku : parrots) {
            peeku.makeSound();
        }

        System.out.println("\n");

        // Print total counts
        System.out.println("Total number of animals: " + Animal.numberOfAnimals);
        System.out.println("Total number of mammals: " + Mammal.getNumberOfMammals());
        System.out.println("Total number of birds: " + Bird.getNumberOfBirds());
    }
}
