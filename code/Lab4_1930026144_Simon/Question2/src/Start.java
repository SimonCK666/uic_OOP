
public class Start {
    public static String check(Student s) {
        if (s.isSleeping() == true) {
            return "sweet dreams";
        } else {
            return "need coffee";
        }
    }
    public static void main(String[] args) {
        // test the code
        Student.testStudent();
        // create a new object
        Student s = new Student(1234567890);
        String str = check(s);
        // test the check method
        System.out.println(str == "need coffee");
    }
}

// the check method need be static