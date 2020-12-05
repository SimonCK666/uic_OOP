import javax.swing.JFrame;
public class JFrameTest1 {
    public static void main(String[] args) {
        // A JFrame is a top-level window with a title and a border.
        JFrame f = new JFrame("Frame Title");
        f.setSize(400, 300);
        // Closing the window terminates the program. Do not forget
        // this otherwise the program might keep running even after
        // the window is closed!
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make the window visible to the user.
        f.setVisible(true);
        // The window is empty!
    }
        
}
