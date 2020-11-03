
public class Assignment {
    // declear the variables
    private Code myCode = new Code();
    private int score;
    private boolean submitted;
    private String name;

    public Assignment(Code myCode, boolean submitted, String name) {
        // delcear the variables
        this.myCode = myCode;
        this.submitted = submitted;
        this.name = name;
        this.score = 0;
    }

    public void submit() {
        // submit method
        submitted = true;
    }

    public boolean isSubmitted() {
        // return submit
        return submitted;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        // return score
        return score;
    }

    public String getName() {
        // return name
        return name;
    }

    public Code getCode() {
        // return myCode
        return myCode;
    }

    public static void testAssignment() {
        // declear the objects
        Code aCode = new Code();
        Assignment a = new Assignment(aCode, false, "Simon");
        // test the methods
        System.out.println(a.getCode() == aCode);
        System.out.println(a.isSubmitted() == false);
        System.out.println(a.getName() == "Simon");
        System.out.println(a.getScore() == 0);
        a.setScore(100);
        // test the submit
        a.submit();
        System.out.println(a.getScore() == 100);
        System.out.println(a.isSubmitted() == true);
    }
}
