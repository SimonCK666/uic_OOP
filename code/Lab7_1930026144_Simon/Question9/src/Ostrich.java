
public class Ostrich extends Bird{
    public Ostrich(String name) {
        // create the constructor
        super(name, 10);
    }

    @Override
    // override the canFly method
    public boolean canFly() {
        return false;
    }

    public static void testOstrich() {
        Ostrich o = new Ostrich("Lalala");
        // test the method
        System.out.println(o.getName() == "Lalala");
        System.out.println(o.getNumOfEggs() == 10);
        System.out.println(o.canFly() == false);
        System.out.println(o.getLegs() == 2);
    }
}
