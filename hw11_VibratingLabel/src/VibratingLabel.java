import javax.swing.*;
import java.awt.*;
public class VibratingLabel extends JFrame{
	public VibratingLabel(){
		setTitle("진동하는 라벨 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("진동 레이블");
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
