
public class Student extends LivingThing {
    // define the variables
    private Bird pet;

    public Student(String name, Bird pet) {
        // define the constructor
        super(name);
        this.pet = pet;
    }

    public Bird getPet() {
        // return pet
        return pet;
    }

    public static void testStudent() {
        Bird c = new Bird("Lili", 2.0, 100);
        Student s = new Student("Simon", c);

        // test the methods
        System.out.println(s.getName() == "Simon");
        System.out.println(s.getPet() == c);
    }
}
