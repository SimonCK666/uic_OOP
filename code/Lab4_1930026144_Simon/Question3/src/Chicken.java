
public class Chicken {
    private double weight;
    private boolean sleeping;

    public Chicken(double weight) {
        // the constructor function
        this.weight = weight;
    }

    public double getWeight() {
        // retrun weight
        return weight;
    }

    public boolean isSleeping() {
        sleeping = true;
        // retrun sleep
        return sleeping;
    }

    public void fallAsleep() {
        // let chicken fall asleep
        if (sleeping == false) {
            sleeping = true;
        }
    }

    public void wakeUp() {
        // let chicken wake up
        if (sleeping == true) {
            sleeping = false;
        }
    }

    public static void testChicken() {
        Chicken c = new Chicken(2.3);

        System.out.println(c.getWeight() == 2.3);
        System.out.println(c.isSleeping() == true);
        c.wakeUp();
        System.out.println(c.isSleeping() == false);
        // should do nothing because the chicken is already awake
        c.wakeUp();
        System.out.println(c.isSleeping() == false);
        c.fallAsleep();
        System.out.println(c.isSleeping() == true);
        // should do nothing because the chicken is already sleeping
        c.fallAsleep();
        System.out.println(c.isSleeping() == true);
    }
}
