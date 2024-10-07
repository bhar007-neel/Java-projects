/**
 *Parrot  class extending Bird
 * */
class Parrot extends Bird{
    /**
     * parrot constructor that calls super and prints "parrot constructer called"
     */
    public Parrot(){
        super();
        System.out.println("Parrot constructor called");
    }

    /**
     * @param name parrot constructor that calls super and prints "parrot constructer called"
     */
    public Parrot(String name){
        super(name);
        System.out.println("Parrot constructor with name called");
    }

    /**
     * override method makeSound()
     */

    @Override
    public void makeSound() {
        System.out.println("Squawk!!");;
    }
    /**
     * override method getAnimalType()
     * @return Parrot
     */

    @Override
    public String getAnimalType() {
        return "Parrot";
    }
}
