/**
 * Dog class extending Mammals
 */
public class Dog extends Mammal{
    /**
     * Dog constructor getting intialised whenever the instance are declared
     * it calls super to call the constructors of its parent that is Mammals
     * prints "Dog constructor called "
     */
    public Dog(){
        super();
        System.out.println("Dog Constructor called");


    }
    /**
     * Dog constructor getting intialised whenever the instance are declared with parameters
     * it calls super to call the constructors of its parent that is Mammals
     * prints "Dog constructor with name called "
     */

    public Dog(String name){
        super(name);
        System.out.println("Dog constructor with name called");
    }

    /**
     * implements makeSound method
     */
    public void makeSound(){
        System.out.println("Woof!!");
    }

    /**
     * implements getAnimalType method
     */
    public String getAnimalType(){
        return super.getAnimalType();
    }




}

