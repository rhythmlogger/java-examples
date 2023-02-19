package frame.elements;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TextActionJFrame extends JFrame {

	private static final long serialVersionUID = 2;

	public TextActionJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setLayout(new GridLayout(1,5));
//		this.setBackground(Color.green); //panel위에 추가안해서 그런지 색이 적용이안됨..ㅠ
//		this.getContentPane().setBackground(getBackground());
		this.add(new JButtonLabelPanel());
		this.add(new EmptyPanel());
		this.add(new JButtonLabelPanel());
		this.add(new JPanel());
		this.add(new JButtonLabelPanel());
		this.setVisible(true);
	}
}
