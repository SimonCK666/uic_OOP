import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		// super method
		super.paintComponent(g);
		
		g.drawString("hello",
				(int)Math.round(Math.random() * this.getWidth()),
				(int)Math.round(Math.random() * this.getHeight()));
				
	}
}
