
public class Bird extends Animal {
    private double altitude;

    public Bird(String name, double weight, double altitude) {
        super(name, weight);
        this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public static void testBird() {
        Bird b = new Bird("Lili", 2.0, 100);

        System.out.println(b.getName() == "Lili");
        System.out.println(b.getWeight() == 2.0);
        System.out.println(b.getAltitude() == 100);
    }
}
