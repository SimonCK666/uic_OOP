import java.awt.BorderLayout;
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

//		JPanel p = new JPanel();
//		this.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40)); // Layout manager for the frame. and left-justify rows
																	// of comonents
		
		JPanel p = new JPanel();
		this.add(p); // Add panel to the frame.
		// Layout manager for the panel.
		// 2 rows, 2 columns, 20 pixels hgap, 10 pixels vgap.
		// p.setLayout(new GridLayout(0, 0, 20, 40));
		// use the BorderLayout layout
		p.setLayout(new BorderLayout(20, 40));
		
		/* Question 4 */
		/*
		 * 1. if the column is 5 and the row is 5, there will display only one button
		 * 2. the program does not use the number of rows that I specified
		 * 3. the program does not use the number of columns that I specified
		 * 4. if I use the mouse to resize the frame, the layout will change
		 * 5. if I set the column and row to 0, it will show an error in the consule
		 */
		
		// p.setLayout(new GridLayout(1, 1, 20, 40));

		// Create a button with the text "hello".
		JButton b = new JButton("hello b");
		// Add the button to the frame.
		this.add(b, BorderLayout.PAGE_START);

		// Create a button with the text "hello".
		JButton c = new JButton("hello c");
		// Add the button to the frame.
		this.add(c, BorderLayout.PAGE_END);

		/*
		 * if I just add two buttons with different text, these two buttons will cover
		 * each other, and it just displays a button which called the last time
		 */

		/*
		 * if I add twice the same button object, it will display four buttons in one
		 * line and with horizontal gap of 20 pixels and vertical gap of 40
		 */

		/* Question 3 */
		JLabel l = new JLabel("Enter your name: ");
		JTextField tx = new JTextField("Type Text Here");
		JCheckBox cb = new JCheckBox("I agree");
		JRadioButton rb = new JRadioButton("Yes");
		JComboBox<String> cb1 = new JComboBox<String>(new String[] { "Red", "Green", "Blue" });
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[] { 2, 7, -3, 24 });
		
		// add these components
		this.add(l, BorderLayout.LINE_START);
		this.add(tx, BorderLayout.LINE_END);
		this.add(cb, BorderLayout.CENTER);
		this.add(rb);
		this.add(cb1);
		this.add(cb2);
		
		this.setVisible(true); // if comment the setVisible() method, the window will not display
		this.setLocationRelativeTo(null); // the window will display in the center of my screen
	}
}