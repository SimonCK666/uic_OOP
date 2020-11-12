import java.util.ArrayList;

public class ManyShapes {
    private ArrayList<Shape> allShapes;

    public ManyShapes() {
    	// the constructor
        this.allShapes = new ArrayList<Shape>();
    }

    public void addShape(Shape object) {
    	// add Shape method
        this.allShapes.add(object);
    }

    public void listAllShapes() {
        int num = allShapes.size();
        // judge the situation
        for (int i = 0; i < num; i++) {
            if (allShapes.get(i) instanceof Circle) {
                System.out.println("Circle has area " + allShapes.get(i).area());
            } else if (allShapes.get(i) instanceof Dot) {
                System.out.println("Dot has area " + allShapes.get(i).area());
            } else if (allShapes.get(i) instanceof Rectangle) {
                System.out.println("Rectangle has area " + allShapes.get(i).area());
            } else if (allShapes.get(i) instanceof Square) {
                System.out.println("Square has area " + allShapes.get(i).area());
            } else if (allShapes.get(i) instanceof Shape) {
            	System.out.println("Shape has area " + allShapes.get(i).area());
            }
        }
    }

    public static void testManyShapes() {
    	// create the new object
        ManyShapes m = new ManyShapes();
        // test the methods
        m.addShape(new Circle(1.2, 3.4, 4.0));
        m.addShape(new Dot(1.2, 3.4));
        m.addShape(new Rectangle(1.2, 3.4, 4.0, 5.0));
        m.addShape(new Shape(1.2, 3.4));
        m.addShape(new Square(1.2, 3.4, 5.0));
        m.listAllShapes();
    }
}
