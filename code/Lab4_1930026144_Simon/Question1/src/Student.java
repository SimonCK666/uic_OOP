
public class Student {
    private int ID;
    boolean sleeping;

    public Student(int ID) {
        // the construct function
        this.ID = ID;
    }

    public int getID() {
        // return ID
        return ID;
    }

    public boolean isSleeping() {
        // return the boolean value
    	sleeping = true;
        return sleeping;
    }

    public void fallAsleep() {
        // let the student fall asleep
        if (sleeping != true) {
            sleeping = true;
        }
    }

    public void wakeUp() {
        // let the student wake up
        if (sleeping == true) {
            sleeping = false;
        }
    }

    public static void testStudent() {
        Student s = new Student(1234567890);

        System.out.println(s.getID() == 1234567890);
        System.out.println(s.isSleeping() == false);
        // should do nothing because the student is already sleeping
        s.fallAsleep();
        System.out.println(s.isSleeping() == true);
        s.wakeUp();
        System.out.println(s.isSleeping() == false);
        // should do nothing because the student is already awake
        s.wakeUp();
        System.out.println(s.isSleeping() == false);
    }
}
