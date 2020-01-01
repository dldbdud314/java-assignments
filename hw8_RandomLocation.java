import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RandomLocation extends JFrame{
	private JLabel label = new JLabel("C");
	public RandomLocation() {
		setTitle("클릭 연습용 응용 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(label);
		label.setSize(15, 15);
		label.setLocation(100, 100);
		label.addMouseListener(new MyMouseListener());
		
		setSize(500, 400);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int xBound = (int)(Math.random()*(getWidth()-label.getWidth()));
			int yBound = (int)(Math.random()*(getHeight()-label.getHeight()));
			
			label.setLocation(xBound, yBound);
		}
	}
	public static void main(String[] args) {
		new RandomLocation();
	}
}
