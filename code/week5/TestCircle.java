public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1.0, 2.0), 3.0);
        Circle c2 = new Circle(4.0);
        System.out.println("c1: (" + c1.getO().getX() + ", " + c1.getO().getY() + "), " + c2.getRadius());
        System.out.println("c2: (" + c2.getO().getX() + ", " + c1.getO().getY() + "), " + c2.getRadius());
        System.out.println("c1 area = " + c1.area());
        System.out.println("c1 area = " + c2.area());
        c1.setO(5.0, 6.0);
        c2.setRadius(7.0);
        System.out.println("c1: (" + c1.getO().getX() + ", " + c1.getO().getY() + "), " + c1.getRadius());
        System.out.println("c2: (" + c2.getO().getX() + ", " + c2.getO().getY() + "), " + c2.getRadius());
        System.out.println("c1 area = " + c1.area());
        System.out.println("c2 area = " + c2.area());
        Point p1 = new Point(6.0, 7.0);
        System.out.println(c1.contains(p1));
    }
}
