
public abstract class Shape {
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

    public void move(double dx, double dy) {
        // move the central point of the shape by the amounts dx and dy
        x += dx;
        y += dy;
    }

    public abstract double area();

    public abstract void resize(double newSize);
    
    public static void testShape() {
        
    } // cannot have the test method
}
