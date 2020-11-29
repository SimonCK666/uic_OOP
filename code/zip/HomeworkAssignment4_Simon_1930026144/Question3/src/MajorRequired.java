
public class MajorRequired extends Course {
    // create constructor
    public MajorRequired(String code, String title, Course preRequisite) {
        // extend the Course class
        super(code, title, preRequisite);
    }

    public static void testMajorRequired() {
        Course c = new Course("100", "H", null);
        MajorRequired mr = new MajorRequired("1000", "He", c);
        System.out.println(mr.getCode() == "1000");
        System.out.println(mr.getTitle() == "He");
        System.out.println(mr.getPreRequisite());
    }
}
