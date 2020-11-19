
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // the getLegs method should be an abstract method
    public abstract int getLegs();

    // the canFlgymethod should be an abstract method
    public abstract boolean canFly();

    public static void testAnimal() {
        // The Animal class can not be tested
    }
}
