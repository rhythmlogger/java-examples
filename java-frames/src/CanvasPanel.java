
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class CanvasPanel extends JPanel{
	public CanvasPanel() {
		setLayout(new BorderLayout());
		setSize(1000,500);
		setBackground(Color.black);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

	@Override
	public void paintAll(Graphics g) {
		super.paintAll(g);
	}
}
