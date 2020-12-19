import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	// set the position coordinate
	private int x;
	private int y;

	public MyPanel() {
		// add Mouse Listener
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// test the left mouse was clicked
				if (e.getButton() == e.BUTTON1) {
					// print the x, y message
					System.out.println("The X = " + e.getX());
					System.out.println("The Y = " + e.getY());

					// get the coordinates
					x = e.getX();
					y = e.getY();

					// repaint the point
					repaint();
				}
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		// clean the panel before drawing something on it
		super.paintComponent(g);
		// draw a red square of size q point on the panel
		// set color
		g.setColor(Color.red);
		// draw the point
		g.drawRect(x, y, 1, 1);
	}
}
