
public class Code {
    // Define the variables
    private boolean canRun;
    private boolean canComplie;
    private int lines;

    public Code() {
        // declear the variables
        canComplie = false;
        canRun = false;
        lines = 0;
    }

    public Code(boolean canComplie, boolean canRun, int lines) {
        // declear the variables
        this.canComplie = canComplie;
        this.canRun  = canRun;
        this.lines = lines;
    }

    public boolean complie() {
        // return canComplie
        return canComplie;
    }

    public boolean run() {
        // return canRun
        return canRun;
    }

    public void debug() {
        // judge the code
        if (canRun == false) {
            canRun = true;
        }
        if (canComplie == false) {
            canComplie = true;
        }
    }

    public void coding(int lines) {
        this.lines = lines;
    }

    public int countLines() {
        // return lines
        return lines;
    }

    public static void testCode() {
        Code c = new Code();
        // test the original code
        System.out.println(c.complie() == false);
        System.out.println(c.run() == false);
        System.out.println(c.countLines() == 0);
        // test debug
        c.debug();
        c.coding(20);
        System.out.println(c.complie() == false);
        System.out.println(c.run() == false);
        System.out.println(c.countLines() == 20);
        // test the second constructor
        Code d = new Code(false, false, 20);
        System.out.println(d.complie() == false);
        System.out.println(d.run() == false);
        System.out.println(d.countLines() == 20);
        // test debug
        d.debug();
        d.coding(10);
        System.out.println(d.complie() == false);
        System.out.println(d.run() == false);
        System.out.println(d.countLines() == 10);
        
    }
}
