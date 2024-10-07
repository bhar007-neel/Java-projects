/**
 * Abstract class that implement SoundMaker
 * this class  has a constructor that initialises Animal() and Animal(name)
 * it also has its abstract method to get number of animals and type of animal
 *
 */
public abstract class Animal implements SoundMaker{  //Animal class that implements SoundMaker
    // total number of animals
    protected static int numberOfAnimals=0;
    // Name of animal represented by a String
    protected String name;

    /**
     * Constructor that initialises the Animal class
     * That increments number of animals whenever it is called
     *  prints out - "Animal constructor created"
     * */
    public Animal(){ // Default Contructor Animal
        numberOfAnimals ++;
        System.out.println("Animal Constructor called");
        name="Unknown Animal";
    }

    /**
     *
     * @param name name of the animal
     * increments the animal
     * prints - Animaal constructor with name caled
     */
    public Animal(String name){  //constructor with parameter
        this.name= name;
        numberOfAnimals++;
        System.out.println("Animal Constructor with name called");


    }
    /**
       abstract methods to get animal type and number of Animals
     */
    public abstract String getAnimalType();  //get animal method
    public abstract int getNumberOfAnimals();  //get number of animals method





}














