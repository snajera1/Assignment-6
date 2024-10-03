
public class Animal {
    public int age;
    public String gender;
    
    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }
    public void isMammal() {
        System.out.println("This is method .isMammal() from class Animal");
    }

    public void mate() {
        System.out.println("This is method.mate() from class Animal");
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }



}