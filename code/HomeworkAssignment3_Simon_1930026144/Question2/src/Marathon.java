
public class Marathon extends Running {
    // first constructor
    public Marathon(int playerNumber, float length) {
        super(length);
    }
    // second constructor
    public Marathon(int playerNumber) {
        super(42.195f);
    }

    public static void testMarathon() {
        // test first constructor
        Marathon m = new Marathon(10, 42.195f);
        //test the methods
        System.out.println(m.getPlayerNumber() == 10);
        System.out.println(m.getLength() == 42.195f);
        System.out.println(m.isFun() == false);
        // test second constructor
        Marathon m2 = new Marathon(20);
        //test the methods
        System.out.println(m.getPlayerNumber() == 10);
        System.out.println(m.getLength() == 42.195f);
        System.out.println(m.isFun() == false);
    }
}
