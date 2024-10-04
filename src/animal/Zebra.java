package animal; //Shows the package/folder the file is in

public class Zebra extends Animal { //Establishes the Zebra class as a subclass of Animal
    public boolean  is_wild; //Establishes the attribute exclusive to the zebra class

    public Zebra(int age, String gender, boolean is_wild) { //The constructor for the zebra class
        super(age, gender); //Imports the attributes from the Animal superclass
        this.is_wild = is_wild; //Specifying that the parameter in the constructor is the same as the class attribute declared earlier
    }

    public void run() { //Establishes a void method that returns nothing but prints out a statement
        System.out.println("This is method run() from class Zebra");
    }
}
