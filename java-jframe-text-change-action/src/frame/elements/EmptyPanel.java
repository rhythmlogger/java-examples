package frame.elements;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

//빈 패널 
public class EmptyPanel extends JPanel {

	private static final long serialVersionUID = 1;

	public EmptyPanel() {
		this.setBackground(Color.green);
		setLayout(new BorderLayout());
	}
}
