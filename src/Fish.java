public class Fish extends Animal {
    private int sizeInFeet;

    public Fish(int age, String gender, int sizeInFeet) {
        super(age, gender);
        this.sizeInFeet = sizeInFeet;
    }
    
    private void canEat() {
        System.out.println("This is method .canEat() from class Fish.");
    }

    public static void main(String[] args) throws Exception {
        Animal animal = new Animal(8, "m");
        Fish fish = new Fish(2, "f", 3);
        Zebra zebra = new Zebra(4, "m", true);

        animal.isMammal();
        animal.mate();
        fish.canEat();
        zebra.run();
    }
}
