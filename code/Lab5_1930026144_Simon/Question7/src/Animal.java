import java.util.jar.Attributes.Name;

public class Animal extends LivingThing {
    private double weight;

    public Animal(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void testAnimal() {
        Animal a = new Animal("Marry", 2.0);

        System.out.println(a.getName() == "Marry");
        System.out.println(a.getWeight() == 2.0);

        // reset the weight
        a.setWeight(3.0);
        System.out.println(a.getWeight() == 3.0);
    }
}


/*

Answer Questions:
1. the variables name, weight, the methods getName, getWeight can be moved to the Animal class
2. the method feed must stay in these class need use inheritance to modify them
3. can use a cat object as the pet of a student

*/
