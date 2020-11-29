
public class Course implements Learnable {
    private String code;
    private String title;
    private Course preRequisite;

    public Course (String code, String title, Course preRequisite) {
        // judge whether the preRequisite is null
        if (preRequisite == null) {
            System.out.println("pre-requisite cannot be null");
            // if null quit
            return;
        }
        this.code = code;
        this.title = title;
        this.preRequisite = preRequisite;
    }

    public String getCode() {
        // return code
        return code;
    }

    public String getTitle() {
        // retturn title
        return title;
    }

    @Override
    public Course getPreRequisite() {
        // return preRequisite
        return preRequisite;
    }

    public boolean isRequired() {
        return true;
    }

    public static void testCourse() {
        // with null constructor
        Course c = new Course("100", "Hello", null);
        // not null constructor
        Course c2 = new Course("1000", "H", c);
        // test method
        System.out.println(c2.getCode() == "1000");
        System.out.println(c2.getTitle() == "H");
        System.out.println(c2.getPreRequisite());

    }


}
