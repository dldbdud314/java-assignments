import javax.swing.*;
import java.awt.*;
public class VibratingLabel extends JFrame{
	public VibratingLabel(){
		setTitle("�����ϴ� �� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("���� ���̺�");
		label.setSize(100, 40);
		label.setLocation(100, 100);
		c.add(label);
		
		setSize(500, 400);
		setVisible(true);
		
		VibratingLabelThread t = new VibratingLabelThread(label);
		t.start();
	}
	public static void main(String[] args) {
		new VibratingLabel();
	}
}
