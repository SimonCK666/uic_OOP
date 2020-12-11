
public class Start {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// call the MyFrame
				new MyFrame();
				new MyFrame();
				// if add the second MyFrame object, there are two windows displayed.
			}
		});
	}

}
