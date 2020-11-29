public class Test1 {
    public static void main(String[] args) {
        int[] a; // Variable.
        a = new int[3]; // Array object.
        System.out.println("length: " + a.length);
        for(int i = 0; i < a.length; i++) {
            a[i] = 2 * i;
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
