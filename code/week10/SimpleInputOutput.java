/**
 * SimpleInputOutput
 */
import javax.swing.JOptionPane;
 public class SimpleInputOutput {
    public static void main(String[] args) {
        // Input:
        // If the user clicks on "cancel" then str will be null.
        // If the user types something in the dialog and clicks
        // on "OK" then str will be what the user typed.
        String str = JOptionPane.showInputDialog("Type some text:");
        // Output:
        JOptionPane.showMessageDialog(null, "str is: " + str);
    }
    
}