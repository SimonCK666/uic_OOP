
public class Dot extends Shape {
    public Dot(double x, double y) {
    	// create the constructor
        super(x, y);
    }

    @Override
    public double area() {
    	// override the area methods
        return 0;
    }

    public static void testDot() {
        Dot d = new Dot(2, 3);
        // test the methods
        System.out.println(d.getX() == 2);
        System.out.println(d.getY() == 3);
        System.out.println(d.area() == 0);
    }
}
