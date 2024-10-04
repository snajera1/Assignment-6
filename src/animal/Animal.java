package animal; //Shows the package/folder the file is in

public class Animal { //Establishes the public class animal
    public int age; //Establishes the Animal class attributes
    public String gender;
    
    public Animal(int age, String gender) { //The Animal class constructor 
        this.age = age; //Establishes the attributes for the Animal class
        this.gender = gender;
    }
    public void isMammal() { //Declares the method isMammal() for class animal as a void method that returns nothing but prints a statement
        System.out.println("This is method .isMammal() from class Animal");
    }

    public void mate() { //Declares the void method mate() that returns nothing but prints a statement
        System.out.println("This is method.mate() from class Animal");
    }

    public int getAge() { //Declares the method getAge() that returns the age attribute for an Animal object
        return age;
    }

    public String getGender() { //Declares the method getGender() that returns the gender attribute for an Animal object
        return gender;
    }



}