import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame{
	public Calculator() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();	
		
		JPanel north = new JPanel();
		JPanel south = new JPanel();
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(4, 4));
		c.add(north, BorderLayout.NORTH);
		c.add(south, BorderLayout.SOUTH);
		c.add(center, BorderLayout.CENTER);
		
		north.add(new JLabel("수식 입력"));
		north.add(new JTextField("             "));
		south.add(new JLabel("계산 결과"));
		south.add(new JTextField("             "));
		
		for(int i = 0; i < 10; i++)
			center.add(new JButton(Integer.toString(i)));
		center.add(new JButton("CE"));
		center.add(new JButton("계산"));
		center.add(new JButton("+"));
		center.add(new JButton("-"));
		center.add(new JButton("x"));
		center.add(new JButton("/"));	
		
		setSize(500, 350);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Calculator();
	}

}
