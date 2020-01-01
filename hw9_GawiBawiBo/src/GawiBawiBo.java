import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GawiBawiBo extends JFrame{
	private ImageIcon[] imgArray = new ImageIcon[3];
	private JButton gawiBtn;
	private JButton bawiBtn;
	private JButton boBtn;
	private JLabel me = new JLabel();
	private JLabel com = new JLabel();
	private JLabel winner = new JLabel("");
	public GawiBawiBo() {
		setTitle("가위바위보");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		imgArray[0] = new ImageIcon("gawi.jpg");
		imgArray[1] = new ImageIcon("bawi.jpg");
		imgArray[2] = new ImageIcon("bo.jpg");
		gawiBtn = new JButton(imgArray[0]);
		bawiBtn = new JButton(imgArray[1]);
		boBtn = new JButton(imgArray[2]);

		JPanel btnPanel = new JPanel();
		btnPanel.add(gawiBtn);
		btnPanel.add(bawiBtn);
		btnPanel.add(boBtn);
		MyMouseListener mml = new MyMouseListener();
		gawiBtn.addMouseListener(mml);
		bawiBtn.addMouseListener(mml);
		boBtn.addMouseListener(mml);
		
		c.add(btnPanel, BorderLayout.NORTH);
		btnPanel.setBackground(Color.GRAY);
		
		JPanel labelPanel = new JPanel();
		JLabel meTxt = new JLabel("me");
		JLabel comTxt = new JLabel("com");
		
		labelPanel.add(me);
		labelPanel.add(meTxt);
		labelPanel.add(com);
		labelPanel.add(comTxt);
		labelPanel.add(winner);
		
		c.add(labelPanel, BorderLayout.CENTER);
		labelPanel.setBackground(Color.YELLOW);
		
		setSize(500, 400);
		setVisible(true);
	}
	public class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			int x = (int)(Math.random()*3);
			if(b == gawiBtn)
				me.setIcon(imgArray[0]);
			else if(b == bawiBtn)
				me.setIcon(imgArray[1]);
			else
				me.setIcon(imgArray[2]);
			com.setIcon(imgArray[x]);
			
			if(me.getIcon() == com.getIcon())
				winner.setText("same!!!!");
			else {
				if(me.getIcon().equals(imgArray[0])) {
					if(com.getIcon().equals(imgArray[1]))
						winner.setText("computer!!!!");
					else
						winner.setText("me!!!!");
				}
				else if(me.getIcon().equals(imgArray[1])) {
					if(com.getIcon().equals(imgArray[0]))
						winner.setText("me!!!!");
					else
						winner.setText("computer!!!!");
				}
				else{
					if(com.getIcon().equals(imgArray[0]))
						winner.setText("computer!!!!");
					else
						winner.setText("me!!!!");
				}
			}
		}
	}
	public static void main(String[] args) {
		new GawiBawiBo();
	}
}
