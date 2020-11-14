
public class Sport {
    private int playerNumber;

    public Sport(int playerNumber) {
        // create the constructor
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        // get player number
        return playerNumber;
    }

    public boolean isFun() {
        // is fun method
        System.out.println("Do not play this! It's boring.");
        return false;
    }

    public static void testSport() {
        Sport s = new Sport(4);
        // test the methods
        System.out.println(s.getPlayerNumber() == 4);
        System.out.println(s.isFun() == false);
    }
}
