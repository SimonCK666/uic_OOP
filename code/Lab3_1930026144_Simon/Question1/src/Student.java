
public class Student {
    private int id;
    
    public Student(int id) {
        // set the id to this object
        this.id = id;
    }

    public int getID() {
        // return the id number
        return id;
    }

    public static void testStudent() {
    	// create a new object
        Student test = new Student(1930026144);
        // test the id number
        System.out.println(test.getID() == 1930026144);
    }
}


// This question needs only one tests.