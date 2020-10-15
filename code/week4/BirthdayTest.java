public class BirthdayTest {
    public static void main(String[] args) {
        BirthdayTest test = new BirthdayTest();
        int date = 9;
        Birthday d1 = new Birthday(7, 7, 1997);
        Birthday d2 = new Birthday(1, 1, 2000);
        test.change1(date);
        test.change2(d1);
        test.change3(d2);

        System.out.println("date = " + date);
        d1.display();
        d2.display();
    }

    public void change1(int i) {
        i = 1234;
    }
    public void change2(Birthday b) {
        b = new Birthday(22, 2, 2004);
    }
    public void change3(Birthday b) {
        b.setDay(22);
    }
}
