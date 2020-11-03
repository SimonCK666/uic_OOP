public class Teacher extends Person {
    private String position;

    public Teacher(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }
    
    public Teacher(String name) {
        this(name, 100, "Professor");
    }

    public String getPosition() {
        return position;
    }

    @Override // Asks Java to check for overriding errors.
    public String getInfo() { // Overrides the inherited getInfo().
        return "Student "+ getName() + " is " + getAge() +" and is " + position;
    }
}

