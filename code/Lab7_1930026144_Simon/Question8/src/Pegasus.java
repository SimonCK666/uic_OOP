
public class Pegasus extends Bird {
    public Pegasus(String name) {
        // create the constructor
        super(name, 0);
    }

    @Override
    public int getLegs() {
        // override the getLegs method
        return 4;
    }

    @Override
    public int getNumOfEggs() {
        // override the getNumOfEggs method
        System.out.println("Pegasi do not lay eggs!");
        return 0;
    }

    @Override
    public boolean canFly() {
        // override the canFly method
        return true;
    }

    public static void testPegasus() {
        Pegasus p = new Pegasus("Lalala");
        // test the methods
        System.out.println(p.getName() == "Lalala");
        System.out.println(p.getLegs() == 4);
        System.out.println(p.canFly() == true);
        System.out.println(p.getNumOfEggs() == 0);
    }
}
