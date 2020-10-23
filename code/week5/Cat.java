public class Cat {
    private static int sId = 1;
    private String name;
    private int id;
    // Each cat automatically gets a new ID number.
    public Cat(String name) {
        this.name = name;
        id = sId++;
    }
    public void info() {
        System.out.println("My name is " + name + " No. " + id);
    }
    public static void main(String arg[]) {
        Cat bob = new Cat("bob");
        bob.info();
        Cat alice = new Cat("alice");
        alice.info();
    }
}
