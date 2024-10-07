/**
 * Mammals class that extends Animal and implements abstract and interface methods
 *
 */


public  class Mammal extends Animal{  // Mammal class extending Animal
    // setting count for number of animals
    protected static int numberOfMammals=0;

    /**
     Mammal constructor thats uses super to call constructor of its parent's class
     increments the number of mammals
     prints- "Mammal constructor called"
     */
    public Mammal(){ //Mammal constructor
        super();
        numberOfMammals++;
        System.out.println("Mammal Constructer Called");


    }

    /**
     *
     * @param name thats specify the name of mammal called as it initilises a parameterised constructor
     * uses super to call parent's constructor
     *  prints- "Mammals constructor with name called"
     */
    public Mammal(String name){ //mammal constructor with parameter
        super(name);
        numberOfMammals++;
        System.out.println("Mammal constructor with name called");

    }

    /**
     * Method make sound that prints - "Mammal Sound"
     */
    public void makeSound(){
        System.out.println("Mammal Sound");
    } //sound method

    /**
     * Override getAnimalType()
     * @return "Mammal"
     */

    @Override
    public String getAnimalType() {
        return "Mammal";
    }  //amimal type method


    /**
     * method getNumberOfMammals()
     * @return numberOfMammals
     */

    public static int getNumberOfMammals(){
        return numberOfMammals;
    } //number of mammals method


    /**
     * Method getNumberOfAnimals()
     * @return number of Animals
     */
    public int getNumberOfAnimals(){
        return numberOfAnimals;
    } //number of animals method
}
