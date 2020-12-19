import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	// set the position coordinate
	
	// Question 2
//	private int x;
//	private int y;

	// Question 3
	// the point ArrayList
	ArrayList<Point> points;
	
	public MyPanel() {
		// create new ArrayList
		points = new ArrayList<Point>();
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
					
					// Question 2
//					x = e.getX();
//					y = e.getY();
					
					// Question 3
					Point p = e.getPoint();
					// add p to the ArrayList
					points.add(p);
					

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
		
		// Question 2
//		g.drawRect(x, y, 1, 1);
		
		// Question 3
		for (int i = 0; i < points.size(); i++) {
			// Question 3
			// draw the points in the panel
			g.drawRect((int)points.get(i).getX(), (int)points.get(i).getY(), 1, 1);
		}
		
		// Question 4
		// draw a line
		for (int i = 1; i < points.size(); i++) {
			g.drawLine((int)points.get(i - 1).getX(), (int)points.get(i - 1).getY(), (int)points.get(i).getX(), (int)points.get(i).getY());
		}
	}
	
	// clear all points
	public void clearAllPoints() {
		points.clear();
		repaint();
	}
	
	// undo the last point
	public void undoPoint() {
		points.remove(points.size() - 1);
		repaint();
	}
}
