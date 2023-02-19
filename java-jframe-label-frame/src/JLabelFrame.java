import javax.swing.JLabel;


public class JLabelFrame extends EmptyFrame {
	public JLabelFrame(){
		JLabel helloLabel = new JLabel("Hello, world!");
		this.add(helloLabel);
		setVisible(true);
	}
}
