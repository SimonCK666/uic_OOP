
public class Cat {
    // define the variable
    private String name;
    private double weight;

    public Cat(String name, double weight) {
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
    	// feed the cat
        weight += 1.0;
    }

    public static void testCat() {
        Cat c = new Cat("Meow", 2.0);

        System.out.println(c.getName() == "Meow");
        System.out.println(c.getWeight() == 2.0);
        c.feed();
        // The name is still the same but the weight increased by 1.0:
        System.out.println(c.getName() == "Meow");
        System.out.println(c.getWeight() == 3.0);

    }
}
