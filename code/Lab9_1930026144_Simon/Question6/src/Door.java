
public class Door {
    private boolean isOpen;

    public Door() {
        // create the constructor
        this.isOpen = false;
    }

    public boolean isOpen() {
        // isOpen method
        return isOpen;
    }

    public void open() {
        // set the door open
        isOpen = true;
    }

    public void close() {
        // set the door close
        isOpen = false;
    }

    public static void testDoor() {
        Door d = new Door();
        // test methods
        System.out.println(d.isOpen == false);
        // set to open
        d.open();
        System.out.println(d.isOpen == true);
        // set to close
        d.close();
        System.out.println(d.isOpen == false);
    }
}
