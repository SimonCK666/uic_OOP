
public class Tennis extends Sport {
    public Tennis() {
        // tennis has two players
        super(2);
    }

    @Override
    public boolean isFun() {
        // tennis is fun
        System.out.println("Play this! It's fun.");
        return true;
    }

    public static void testTennis() {
        Tennis t = new Tennis();
        // test the methods
        System.out.println(t.getPlayerNumber() == 2);
        System.out.println(t.isFun() == true);
    }
}
