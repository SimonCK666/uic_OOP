
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        // set the id to this object
        this.id = id;
        // judge the id number
        if (this.id < 0) {
            this.id = 0;
        } else {
            this.id = id;
        }
        // set the name to this name
        this.name = name;
    }

    public int getID() {
        // return the id number
        return id;
    }

    public String getName() {
        // return the name
        return name;
    }

    public void setName(String name) {
        // set the name
        this.name = name;
    }

    public static void testStudent() {
        // creat a new object
        Student test = new Student(-1930026144, "Simon");
        // test the id number
        System.out.println(test.getID() == 0);
        System.out.println(test.getName() == "Simon");
        // reset a name
        test.setName("John");
        // test the new name
        System.out.println(test.getName() == "John");
    }
}

// This question needs three tests