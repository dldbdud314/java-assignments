package 방명록만들기;
import java.awt.*;
import javax.swing.*;

public class VisitorsRegister extends JFrame{
	public VisitorsRegister() {
		setTitle("방명록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JTextArea txt = new JTextArea("입력하세요", 50, 40);
		JScrollPane scrollPane = new JScrollPane(txt);
		c.add(scrollPane, BorderLayout.CENTER);
		JPanel buttons = new JPanel();
		c.add(buttons, BorderLayout.SOUTH);
		buttons.add(new JButton("확인"));
		buttons.add(new JButton("취소"));
		
		setSize(500, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new VisitorsRegister();
	}
}
