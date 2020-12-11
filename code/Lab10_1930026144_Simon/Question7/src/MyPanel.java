import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		// super method
		super.paintComponent(g);
		
		/* Question 6 */
//		g.drawString("hello",
//				(int)Math.round(Math.random() * this.getWidth()),
//				(int)Math.round(Math.random() * this.getHeight()));
			
		/* Question 7 */
		
		// Draw the rectangle
		// setColor method
		g.setColor(Color.RED);
		// drawRect method
		g.drawRect(16, 20, 20, 20);
		g.drawRect(20, 16, 20, 20);
		// drawLine method
		g.drawLine(16, 20, 20, 16);
		g.drawLine(36, 40, 40, 36);
		g.drawLine(36, 20, 40, 16);
		g.drawLine(16, 40, 20, 36);
		
		// Drew the Cylinder
		g.setColor(Color.BLUE);
		g.drawOval(50, 16, 20, 4);
		g.drawOval(50, 36, 20, 4);
		g.drawLine(50, 18, 50, 38);
		g.drawLine(70, 18, 70, 38);
	}
}
