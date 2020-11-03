
public class Student {
    // define the variables
    private String name;
    private Animal pet;

    public Student(String name, Animal pet) {
        // define the constructor
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        // return name
        return name;
    }

    public Animal getPet() {
        // return pet
        return pet;
    }

    public static void testStudent() {
        Animal c = new Animal("May", 2.0);
        Student s = new Student("Simon", c);

        // test the methods
        System.out.println(s.getName() == "Simon");
        System.out.println(s.getPet() == c);
    }
}
