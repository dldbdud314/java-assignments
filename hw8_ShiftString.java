import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ShiftString extends JFrame{
	private JLabel label = new JLabel("Love Java");
	public ShiftString() {
		setTitle("Left키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(label);
		label.addKeyListener(new MyKeyListener());
		label.setFocusable(true);
		label.requestFocus();
		
		setSize(400, 200);
		setVisible(true);
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT)
				label.setText(label.getText().substring(1)+label.getText().substring(0, 1));
		}
	}
	public static void main(String[] args) {
		new ShiftString();
	}
}
