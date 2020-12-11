import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
/* use the setTitle method to set the title, or call
   directly the constructor of the superclass JFrame with
   the title: super("MyFrame Title");*/
		this.setTitle("MyFrame Title");   // if comment out the setTitle method, the window will not display the title
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // if comment out the setDefaultCloseOperation method, and close the program, the program is still running  
		this.setVisible(true);  // if comment the setVisible() method, the window will not display
		this.setLocationRelativeTo(null);  // the window will display in the center of my screen
	}
}