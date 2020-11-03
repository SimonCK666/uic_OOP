
public class Start {
    public static String check(Chicken c) {
        if (c.isSleeping() == true) {
            return "sweet dreams";
        } else {
            return "need coffee";
        }
    }
    // test the code
    public static void main(String[] args) {
        Chicken.testChicken();
        Chicken c = new Chicken(2.3);
        String str = check(c);
        System.out.println(str == "sweet dreams");
    }
}
