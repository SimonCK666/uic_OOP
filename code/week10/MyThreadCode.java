import javax.swing.JFrame;
/**
 * InnerMyThreadCode
 */
public class MyThreadCode implements Runnable {
    @Override
    public void run() {
        JFrame f = new JFrame("Frame Title");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
        
    public static void main(String[] args) {
        MyThreadCode m = new MyThreadCode();
        javax.swing.SwingUtilities.invokeLater(m);
    }
}
