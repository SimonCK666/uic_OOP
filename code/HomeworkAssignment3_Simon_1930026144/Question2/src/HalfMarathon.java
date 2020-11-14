
public class HalfMarathon extends Marathon {
    public HalfMarathon() {
        super(99, 21.0975f);
    }

    public static void testHalfMarathon() {
        HalfMarathon hm = new HalfMarathon();
        // test method
        System.out.println(hm.getPlayerNumber() == 99);
        System.out.println(hm.getLength() == 21.0975f);;
        System.out.println(hm.isFun() == false);
    }
}
