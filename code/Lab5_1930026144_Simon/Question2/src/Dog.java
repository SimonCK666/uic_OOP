
public class Dog {
    // define the variable
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        // declear the constructor
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        // return name
        return name;
    }

    public double getWeight() {
        // return weight
        return weight;
    }

    public void feed() {
        // feed the dog
        weight += 2.0;
    }

    public static void testDog() {
        Dog d = new Dog("Woof", 2.0);
        System.out.println(d.getName() == "Woof");
        System.out.println(d.getWeight() == 2.0);
        d.feed();
        // The name is still the same but the weight increased by 2.0:
        System.out.println(d.getName() == "Woof");
        System.out.println(d.getWeight() == 4.0);
    }
        
}
