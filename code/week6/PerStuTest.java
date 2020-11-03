import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class PerStuTest {
    public static void main(String arg[]){
        Person p = new Person("Alice", 22);
        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's age: " + p.getAge());
        System.out.println("Person's info: " + p.getInfo());
        //System.out.println("Person's school: " + p.getSchool());
        Student s = new Student("Alice", 22, "UIC");
        System.out.println("Student's name: " + s.getName());
        System.out.println("Student's age: " + s.getAge());
        System.out.println("Student's school: " + s.getSchool());
        System.out.println("Student's info: " + s.getInfo());
        System.out.println("parent's info: " + s.getParentInfo());

        Teacher t = new Teacher("philli");
        System.out.println("Teacher's name: " + t.getName());
        System.out.println("Teacher's Age: " + t.getAge());
        System.out.println("Teacher's position: " + t.getPosition());
        System.out.println("Teacher's Age:" + t.getInfo());
    }
}
