
public class Square extends Rectangle{
    private double size;

    public Square(double x, double y, double size) {
        super(x, y, size, size);
    }

    public static void testSquare() {
        Square s = new Square(1, 2, 3);

        System.out.println(s.getX() == 1);
        System.out.println(s.getY() == 2);
        System.out.println(s.area() == 3 * 3);
    }
    
}

// teh Square class do not need its own area method