
public class LivingThing  {
    private String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void testLivingThing() {
        // create a new object
        LivingThing l = new LivingThing("Nini");

        // test method
        System.out.println(l.getName() == "Nini");
    }
}
