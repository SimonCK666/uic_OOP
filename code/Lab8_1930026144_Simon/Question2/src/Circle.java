
public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
        // create the constructor
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double newRadius) {
        this.radius = newRadius;
    }

    public static void testCircle() {
        Circle c = new Circle(1, 1, 2.0);
        // test the method
        System.out.println(c.getX() == 1);
        System.out.println(c.getY() == 1);
        System.out.println(c.area() == Math.PI * 2 * 2);
        // resize the circle
        c.resize(3.0);
        System.out.println(c.area() == Math.PI * 3 * 3);
    }
}
