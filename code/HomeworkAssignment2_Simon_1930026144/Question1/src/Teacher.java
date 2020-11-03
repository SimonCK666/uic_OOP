
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public int grading(Student s) {
        // the grading methods
        if(s.getAssignment().isSubmitted() == false) {
            s.getAssignment().setScore(0);
            return 0;
        }
        else if(s.getName() != s.getAssignment().getName()) {
            s.getAssignment().setScore(0);
            return 0;
        }
        else if(s.getAssignment().getCode().complie() == false) {
            s.getAssignment().setScore(0);
            return 0;
        }
        else if(s.getAssignment().getCode().run() == false) {
            s.getAssignment().setScore(50);
            return 50;
        }
        else if(s.getAssignment().getCode().countLines() < 100) {
            s.getAssignment().setScore(80);
            return 80;
        }
        else {
            s.getAssignment().setScore(100);
            return 100;
        }
    }

    public static void testTeacher() {
        Teacher t = new Teacher("Simon");
        //create five new codes
        Code a = new Code(false, false, 10);
        Code b = new Code(false, false, 10);
        Code c = new Code(true, false, 10);
        Code d = new Code(true, true, 10);
        Code e = new Code(true, true, 110);
        // creat new objects
        // this one is not submitted
        Assignment a1 = new Assignment(a, false, "Jim");
        // these assignments are submitted
        Assignment a2 = new Assignment(b, true, "Bill");
        Assignment a3 = new Assignment(c, true, "Simon");
        Assignment a4 = new Assignment(d, true, "Tom");
        Assignment a5 = new Assignment(e, true, "Amber");
        // creat new objects
        Student s1 = new Student("Jim", true);
        s1.writeAssignment(a1);
        Student s2 = new Student("Bill", true);
        s2.writeAssignment(a2);
        Student s3 = new Student("Simon", true);
        s3.writeAssignment(a3);
        Student s4 = new Student("Tom", true);
        s4.writeAssignment(a4);
        Student s5 = new Student("Amber", true);
        s5.writeAssignment(a5);
        // set the false option
        Student s6 = new Student("Jack", false);
        s6.copyAssignment(a5);//copy assignment
        // this one is not submitted
        System.out.println(t.grading(s1) == 0);
        // on time but not compile
        System.out.println(t.grading(s2) == 0);
        // on time but can not run
        System.out.println(t.grading(s3) == 50);
        // on time, compile, run, but line number is less then 100
        System.out.println(t.grading(s4) == 80);
        // on time, compile, run, but line number lager or equal to 100
        System.out.println(t.grading(s5) == 100);
        System.out.println(t.grading(s6) == 0);

        
    }
}
