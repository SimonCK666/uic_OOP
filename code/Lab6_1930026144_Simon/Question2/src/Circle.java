
public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius) {
    	// create the constructor
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
    	// calculus the area of circle
        return Math.PI * radius * radius;
    }

    public static void testCircle() {
        Circle c = new Circle(2, 3, 4);
        // test the Ineritant methods
        System.out.println(c.getX() == 2);
        System.out.println(c.getY() == 3);
        System.out.println(c.area() == Math.PI * 4 * 4);
    }

    
}
