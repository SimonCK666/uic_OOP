import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	// create the my frame and panel
	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();

		// create my panel
		MyPanel mp = new MyPanel();

		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		// use the border layout manger
		BorderLayout bl = new BorderLayout();
		this.setLayout(bl);
		p.setLayout(fl);

		// test
//		p.setBackground(Color.GREEN);
//		mp.setBackground(Color.BLUE);

		// make this in the top
		this.add(p, bl.PAGE_START);
		// add the MyPanel Component
		this.add(mp, bl.CENTER);

		// Create a button with the text "hello".
		JButton b = new JButton("Reset");
		// Add the button to the frame.
		p.add(b);

		// Create a button with the text "hello".
		JButton c = new JButton("right");
		// Add the button to the frame.
		p.add(c);
		
		// Question 5
		// add an action listener for button b
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// clear all points
				mp.clearAllPoints();
			}
		});

		this.setVisible(true);
	}
}
