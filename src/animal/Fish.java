package animal; //Shows the package/folder the file is in

public class Fish extends Animal { //Establishes the Fish class as a subclass of Animal
    private int sizeInFeet; //Establishes the private sizeInFeet variable that is exclusive to the Fish subclass

    public Fish(int age, String gender, int sizeInFeet) { //Constructor for the fish subclass
        super(age, gender); //Imports the attributes from the Animal superclass
        this.sizeInFeet = sizeInFeet;
    }
    
    private void canEat() { //Declares void method canEat() that returns nothing but prints out a statement
        System.out.println("This is method .canEat() from class Fish.");
    }

    public static void main(String[] args) throws Exception { //The main class statement, where all the code is executed
        Animal animal = new Animal(8, "m"); //Creates an Animal object
        Fish fish = new Fish(2, "f", 3); //Creates a Fish object
        Zebra zebra = new Zebra(4, "m", true); // Creates a Zebra object

        animal.isMammal(); //Calls method isMammal() with object animal
        animal.mate(); //Calls method mate() with object animal
        fish.canEat(); //Calls method canEat() with object fish
        zebra.run(); //Calls method run() with object zebra
    }
}
