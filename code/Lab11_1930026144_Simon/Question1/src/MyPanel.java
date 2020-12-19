import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
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
				}
			}
		});
	}
}
