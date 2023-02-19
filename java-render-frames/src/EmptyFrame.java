
import javax.swing.JFrame;

public class EmptyFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1;

	public EmptyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1500, 1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EmptyFrame();
	}
}