
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends EmptyFrame {
	private static final long serialVersionUID = 1L;
	private static Map<String, PointLabel> map = new HashMap<String, PointLabel>();
	private static ArrayList<PointLabel> list = new ArrayList<>();

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());;
		JPanel panel = new JPanel();;
		panel.setSize(1000,500);
		setSize(1000, 500);
		PointLabel p1 = new PointLabel(100, 100, "p1");
		PointLabel p2 = new PointLabel(200, 100, "p2");
		PointLabel p3 = new PointLabel(300, 100, "p3");
		PointLabel p4 = new PointLabel(400, 100, "p4");
		PointLabel p5 = new PointLabel(500, 100, "p5");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		for (int i = 0; i < list.size(); i++) {
			PointLabel p = list.get(i);
			map.put("p" + (i + 1), p);
			p.setLocation(p.getX(), p.getY());
			System.out.println(p);
			panel.add(p);
			add(panel, BorderLayout.CENTER);
		}
		setVisible(true);
	}

}
