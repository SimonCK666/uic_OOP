import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame() {
		/*
		 * use the setTitle method to set the title, or call directly the constructor of
		 * the superclass JFrame with the title: super("MyFrame Title");
		 */
		this.setTitle("MyFrame Title"); // if comment out the setTitle method, the window will not display the title
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if comment out the setDefaultCloseOperation method, and
																// close the program, the program is still running

		/* Question 2 */
		JPanel p = new JPanel();
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40)); // Layout manager for the frame. and left-justify rows
																	// of comonents
		// p.setLayout(new GridLayout(1, 1, 20, 40));

		// Create a button with the text "hello".
		JButton b = new JButton("hello b");
		// Add the button to the frame.
		this.add(b);

		// Create a button with the text "hello".
		JButton c = new JButton("hello c");
		// Add the button to the frame.
		this.add(c);

		/*
		 * if I just add two buttons with different text, these two buttons will cover
		 * each other, and it just displays a button which called the last time
		 */

		/*
		 * if I add twice the same button object, it will display four buttons in one
		 * line and with horizontal gap of 20 pixels and vertical gap of 40
		 */ // end Question 2

		
		this.setVisible(true); // if comment the setVisible() method, the window will not display
		this.setLocationRelativeTo(null); // the window will display in the center of my screen
	}
}