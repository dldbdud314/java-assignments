package ���ϸ����;
import java.awt.*;
import javax.swing.*;

public class VisitorsRegister extends JFrame{
	public VisitorsRegister() {
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JTextArea txt = new JTextArea("�Է��ϼ���", 50, 40);
		JScrollPane scrollPane = new JScrollPane(txt);
		c.add(scrollPane, BorderLayout.CENTER);
		JPanel buttons = new JPanel();
		c.add(buttons, BorderLayout.SOUTH);
		buttons.add(new JButton("Ȯ��"));
		buttons.add(new JButton("���"));
		
		setSize(500, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new VisitorsRegister();
	}
}
