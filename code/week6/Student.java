public class Student extends Person {
    private String school;
    public Student() {
        this.school = "UIC";
    }
    public Student(String name, int age, String school) {
        super(name, age);  // Calls the constructor of Person.
        this.school = school;
    }
    public String getSchool() {
        return school;
    }

    @Override // Asks Java to check for overriding errors.
    public String getInfo() { // Overrides the inherited getInfo().
        return "Student "+ getName() + " is " + getAge() +" and at " + school;
    }

    public String getParentInfo() {
        return super.getInfo();
    }

}
