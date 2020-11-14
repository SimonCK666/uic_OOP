
public class Running extends Sport {
    private float length;

    public Running(float length) {
        // create the constructor
        super(10);
        this.length = length;
    }

    public float getLength() {
        // get length
        return length;
    }

    @Override
    public boolean isFun() {
        return false;
    }

    public static void testRunning() {
        Running r = new Running(1000);
        // test the methods
        System.out.println(r.getPlayerNumber() == 10);
        System.out.println(r.getLength() == 1000);
        System.out.println(r.isFun() == false);
    }
}
