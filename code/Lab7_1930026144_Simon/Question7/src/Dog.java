
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    public static void testDog() {
        Dog d = new Dog("Lalala");
        // test the method
        System.out.println(d.getName() == "Lalala");
        System.out.println(d.getLegs() == 4);
        System.out.println(d.canFly() == false);
    }
}
