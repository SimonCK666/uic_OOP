import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT)); // Layout manager for the frame.
		this.add(new JButton("hello")); // Add button to the frame.
		JPanel p = new JPanel();
		p.setBackground(Color.BLUE);
		this.add(p); // Add panel to the frame.
		// Layout manager for the panel.
		// 2 rows, 2 columns, 20 pixels hgap, 10 pixels vgap.
		p.setLayout(new GridLayout(2, 2, 20, 10));
		// Create four buttons and add them to the panel (not the frame).
		// The four buttons always stay together even when you resize.
		for (int i = 0; i < 4; i++) {
			p.add(new JButton("B" + (i + 1)));
		}
		this.setVisible(true);
	}
}