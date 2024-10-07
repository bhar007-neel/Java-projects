/**
 * Class birds that extends Animal class
 */

public class Bird extends Animal{
    // counter for numberOfBirds
    protected static int numberOfBirds=0;

    /**
     * Bird contructor whenever instance is created for class bird
     * it initialises numberOfBirds
     * prints- Bird Constructer called
     */
    public Bird(){
        super();
        numberOfBirds++;
        System.out.println("Bird constructer called");

    }

    /**
     *
     * @param name specify the name of the bird whenever the instance is created
     */
    public Bird(String name){
        super(name);
        numberOfBirds++;
        System.out.println("Bird constructor with name called");

    }

    /**
     * override method makeSound()
     */
    public void makeSound(){
        System.out.println("Bird Sound");

    }

    /**
     * override method getAnimalType()
     * @return bird
     */
    public String getAnimalType(){
        return "bird";

    }

    /**
     * method getNumberOfBirds()
     * @return numberOfBirds
     */
    public static int getNumberOfBirds() {
        return numberOfBirds;
    }

    /**
     * override method getNumberOfAnimals()
     * @return numberOfAnimals
     */
    @Override
    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }
}
