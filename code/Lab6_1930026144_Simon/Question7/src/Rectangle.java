
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double x, double y, double width, double length) {
        // create the constructor
        super(x, y);
        this.width = width;
        this.length = length;
    }

    @Override
    // override the toStirng method
    public double area() {
        // override the area method
        return width * length;
    }
    
    @Override
    public String toString() {
        return "Rectangle has area " + area();
    }

    public static void testRectangle() {
        Rectangle r = new Rectangle(1, 2, 3, 4);
        // test the methods
        System.out.println(r.getX() == 1);
        System.out.println(r.getY() == 2);
        System.out.println(r.area() == 3 * 4);
    }
}
