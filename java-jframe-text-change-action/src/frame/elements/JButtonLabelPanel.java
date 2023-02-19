package frame.elements;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//패널위에 버튼과 Label이 있음
//Action event 추가
public class JButtonLabelPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 3;
	private JButton actionButton;
	private JLabel helloLabel;

	public JButtonLabelPanel() {
		helloLabel = new JLabel("Hello, world!");
		setLayout(new FlowLayout());

		actionButton = new JButton("클릭하면 Good! 으로 변경");
		this.add(actionButton);
		this.setBackground(Color.yellow);
		this.add(helloLabel);
		actionButton.addActionListener(this); //동작되는 원리는 잘모르겠지만, 패널 클릭시 연결해주는 작업같아요
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand()); //시스템 콘솔에 출력합니다
		helloLabel.setText("Good!"); //패널에 있는 레이블 텍스트를 Good로 변경합니다. 감사합니다
	}
}
