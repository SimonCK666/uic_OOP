
public class MajorElective extends Course {
    // create MajorElective constructor
    public MajorElective(String code, String title, Course preReuisite) {
        // extend Course constructor
        super(code, title, preReuisite);
    }
    
    public static void testMajorElective() {
        Course c = new Course("100", "H", null);
        MajorElective me = new MajorElective("1000", "He", c);
        // test methods
        System.out.println(me.getCode() == "1000");
        System.out.println(me.getTitle() == "He");
        System.out.println(me.getPreRequisite());
    }
}
