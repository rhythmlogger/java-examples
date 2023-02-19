
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

class EmptyFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public EmptyFrame() {
		
		JTextArea page = new JTextArea("1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Document doc = null;
		try {
			doc = Jsoup.connect("https://virtualpiano.net").get();
			String html = doc.html();
			page.setText(html);
			panel.add(page);
			add(panel, BorderLayout.CENTER);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		setSize(1024, 768);
		setVisible(true);

	}

	public static void main(String[] args) {
		new EmptyFrame();
	}
}