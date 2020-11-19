
public class Magpie extends Bird {
    
    public Magpie(String name) {
        // create the constructor
        super(name, 6);
    }

    @Override
    public boolean canFly() {
        return true;
    }

    public static void testMagpie() {
        Magpie m = new Magpie("Lalala");
        // test the method
        System.out.println(m.getName() == "Lalala");
        System.out.println(m.getLegs() == 2);
        System.out.println(m.canFly() == true);
        System.out.println(m.getNumOfEggs() == 6);
    }
}
