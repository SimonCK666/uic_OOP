
public class Dot extends Shape {
    public Dot(double x, double y) {
        super(x, y);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    // override the toString method
    public String toString() {
        return "Dot has area " + area();
    }

    public static void testDot() {
        Dot d = new Dot(2, 3);
        // test the methods
        System.out.println(d.getX() == 2);
        System.out.println(d.getY() == 3);
        System.out.println(d.area() == 0);
    }
}
