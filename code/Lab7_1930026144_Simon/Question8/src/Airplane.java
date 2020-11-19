
public class Airplane implements Flyer {
    private String name;

    public Airplane(String name) {
        // create the constructor
        this.name = name;
    }

    @Override
    public String getName() {
        // getName method
        return name;
    }

    @Override
    public boolean canFly() {
        // canFly method
        return true;
    }

    // test method
    public static void testAirplane() {
        Airplane a = new Airplane("Lalala");

        System.out.println(a.getName() == "Lalala");
        System.out.println(a.canFly() == true);
    }

}
