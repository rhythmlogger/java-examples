import java.awt.Color;

import javax.swing.JLabel;

public class PointLabel extends JLabel {
	
	private int x;
	private int y;
	private String text;
	
	public PointLabel(int x, int y, String text) {
		this.x = x;
		this.y = y;
		this.text = text;
	}
	private static final long serialVersionUID = 1L;

	public PointLabel() {
		setSize(100, 50);
		setText(text);
		setForeground(Color.black);
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
