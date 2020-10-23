public class Test {
    public char max(char a, char b) {
        return a > b ? a : b;
    }
    public int  max(int a, int b) {
        return a > b ? a : b;
    }
    public double max(double a, double b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("char: " + t.max('A', 'B'));
        System.out.println("integer: " + t.max(1, 2));
        System.out.println("double: " + t.max(1.0, 2.0));
    }
}
