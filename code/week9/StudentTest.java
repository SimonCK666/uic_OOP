public class StudentTest {
    public static void main(String[] args) {
        Student[] a; // Variable.
        a = new Student[3]; // Array object.
        System.out.println("length: " + a.length);
        // Creating all the array elements one by one:
        for(int i = 0; i < a.length; i++) {
            a[i] = new Student("Student " + i);
        }
        for(int i = 0; i < a.length; i++) {
            // a[i] is of type Student.
            System.out.println("name: " + a[i].getName());
        }

        System.out.println("-----------------");
        
        for(Student s: a) {
            System.out.println("name: " + s.getName());
        }
            
    }
        
}
