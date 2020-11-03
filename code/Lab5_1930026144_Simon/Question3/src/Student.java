
public class Student {
    // define the variables
    private String name;
    private Cat pet;

    public Student(String name, Cat pet) {
        // define the constructor
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        // return name
        return name;
    }

    public Cat getPet() {
        // return pet
        return pet;
    }

    public static void testStudent() {
        Cat c = new Cat("May", 2.0);
        Student s = new Student("Simon", c);

        System.out.println(s.getName() == "Simon");
        System.out.println(s.getPet() == c);
    }
}
