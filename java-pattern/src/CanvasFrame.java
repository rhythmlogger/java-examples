
import java.awt.BorderLayout;

public class CanvasFrame extends EmptyFrame{
	public CanvasFrame() {
		CanvasPanel canvasPanel = new CanvasPanel();
		setLayout(new BorderLayout());
		add(canvasPanel, BorderLayout.CENTER);
		setTitle("Canvas");
		setSize(1000,500);
	}
	public static void CanvasFrame(String []args) {
		new EmptyFrame();
	}
	
}
