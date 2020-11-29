
public class Base implements Learnable {
    private String code;
    private String title;

    // create constructor
    public Base(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        // return code
        return code;
    }

    public String getTitle() {
        // return title
        return title;
    }

    @Override
    public Base getPreRequisite() {
        // return this constructor
        return this;
    }

    public static void testBase() {
        Base b = new Base("100", "H");
        // test the methods
        System.out.println(b.getCode() == "100");
        System.out.println(b.getTitle() == "H");
        System.out.println(b.getPreRequisite());
    }
}
