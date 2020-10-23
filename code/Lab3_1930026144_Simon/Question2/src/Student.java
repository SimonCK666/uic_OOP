
public class Student {
    private int id;
    
    public Student(int id) {
        // set the id to this object
        this.id = id;
        // judge the id number
        if (this.id < 0) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    public int getID() {
        // return the id number
        return id;
    }

    public static void testStudent() {
    	// create new objects
        Student test = new Student(1930026144);
        Student test2 = new Student(-1930026144);
        Student test3 = new Student(0);
        
        // test
        System.out.println(test.getID() == 1930026144);
        System.out.println(test2.getID() == 0);
        System.out.println(test3.getID() == 0);

    }
}


// This question needs three tests
