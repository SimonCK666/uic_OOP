import java.util.ArrayList;

public class ManyShapes {
    private ArrayList<Shape> allShapes;

    public ManyShapes() {
    	// the constructor
        this.allShapes = new ArrayList<Shape>();
    }

    public void addShape(Shape object) {
    	// add the Shape
        this.allShapes.add(object);
    }

    public void listAllShapes() {
        int num = allShapes.size();
        // print the result
        for (int i = 0; i < num; i++) {
            System.out.println("Shape has area " + allShapes.get(i).area());
        }
    }

    public static void testManyShapes() {
        ManyShapes m = new ManyShapes();
        // test the mehtods
        m.addShape(new Circle(1.2, 3.4, 4.0));
        m.addShape(new Dot(1.2, 3.4));
        m.addShape(new Rectangle(1.2, 3.4, 4.0, 5.0));
        m.addShape(new Shape(1.2, 3.4));
        m.addShape(new Square(1.2, 3.4, 5.0));
        m.listAllShapes();
    }
}
