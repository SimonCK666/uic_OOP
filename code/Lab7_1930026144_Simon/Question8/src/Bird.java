
public abstract class Bird extends Animal {
    private int numOfEggs;

    public Bird(String name, int numOfEggs) {
        // create the constructor
        super(name);
        this.numOfEggs = numOfEggs;
    }

    public int getNumOfEggs() {
        // return number of the eggs
        return numOfEggs;
    }

    @Override
    public int getLegs() {
        // override the getLegs method
        return 2;
    }

    public static void testBird() {
        // can not test this Bird class
    }
}
