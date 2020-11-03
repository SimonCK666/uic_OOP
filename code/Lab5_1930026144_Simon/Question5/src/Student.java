
public class Student {
    // define the variables
    private String name;
    private Bird pet;

    public Student(String name, Bird pet) {
        // define the constructor
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        // return name
        return name;
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
