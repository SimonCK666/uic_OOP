
public class Shape {
    // declear the variables
    private double x;
    private double y;

    public Shape(double x, double y) {
        // create the constructor
        this.x = x;
        this.y = y;
    }

    public double getX() {
        // return x
        return x;
    }

    public double getY() {
        // return y
        return y;
    }

    public double area() {
        System.out.println("An unknow shape has an unknown area.");
        return -1.0;
    }

    public static void testShape() {
        // create new object
        Shape s = new Shape(2.3, 3.0);
        // test methods
        System.out.println(s.getX() == 2.3);
        System.out.println(s.getY() == 3.0);
        System.out.println(s.area() == -1.0);
    }
}
