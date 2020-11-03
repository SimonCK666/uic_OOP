
public class Student {
    private Assignment myAssignment;
    private boolean honest = true;
    private String name;

    public Student(String name, boolean honest) {
        this.name = name;
        this.honest = honest;
        myAssignment = null;
    }

    public Assignment getAssignment() {
        return myAssignment;
    }

    public void writeAssignment(Assignment a) {
        if (honest == true) {
            myAssignment = a;
        }
    }

    public void copyAssignment(Assignment a) {
        // copy the assignment
        if (honest == false) {
            if (a.getName() != this.getName()) { 
                this.myAssignment = a;
            }
        }
    }

    public String getName() {
        return name;
    }

    public static void testStudent() {
        // creat a new object
        Code c = new Code();
        Assignment b = new Assignment(c, true, "Simon");
        Student s = new Student("Jim", true);
        System.out.println(s.getAssignment() == null);
        // write assignment
        s.writeAssignment(b);
        System.out.println(s.getAssignment() == b);
        System.out.println(s.getName() == b.getName());
        // test the second constructor
        Student s1 = new Student("Bill", false);
        // copy assignment
        s1.copyAssignment(b);
        System.out.println(s1.getAssignment() == b);
        System.out.println(s1.getName() != b.getName());
    }
}
