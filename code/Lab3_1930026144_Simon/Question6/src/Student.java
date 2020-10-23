
public class Student {
	private int id;
    private String name;
    private char grade;
    private boolean sleeping;

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
        sleeping = true;
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void goToSleep() {
        if (grade > 'A' && grade < 'E') {
            grade += 1;
        } else {
            grade = 'F';
        }
    }

    public void weakUp() {
        this.sleeping = !sleeping;
    }

    public static void testStudent() {
        // create a new object
        Student test = new Student(-1930026144, "Simon");
        // test the id number
        System.out.println(test.getID() == 0);
        System.out.println(test.getName() == "Simon");
        // reset a name
        test.setName("John");
        // test the new name
        System.out.println(test.getName() == "John");
        // set a grade
        test.setGrade('A');
        System.out.println(test.getGrade() == 'A');
        // test the isSleeping
        System.out.println(test.isSleeping() == true);
        // test the weakUp
        test.weakUp();
        System.out.println(!test.isSleeping());
    }
}

// this question needs six tests