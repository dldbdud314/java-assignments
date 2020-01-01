import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RelocateCircle extends JFrame{
	private MyPanel panel = new MyPanel();
	public RelocateCircle() {
		setTitle("�� ���ġ��Ű��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RelocateCircle();
	}
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("��������.jpg");
		private Image img = icon.getImage();
		private int x = 50;
		private int y = 50;
		public MyPanel() {
			addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this);
			g.fillOval(x, y, 40, 40);
		}
	}
}
