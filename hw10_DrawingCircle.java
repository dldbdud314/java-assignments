import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
public class DrawingCircle extends JFrame{
	private MyPanel panel = new MyPanel();
	private Vector<Circle> v = new Vector<Circle>();
	public DrawingCircle() {
		setTitle("원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600, 500);
		setVisible(true);
	}
	public class Circle{
		private int x, y, radius;
		public Circle(int x, int y, int r) {
			this.x = x;
			this.y = y;
			radius = r;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public int getRadius() {
			return radius;
		}
	}
	public class MyPanel extends JPanel{
		//private int firstX, firstY, lastX, lastY, rad;
		private int x, firstX, y, firstY, rad;
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					firstX = e.getX();
					firstY = e.getY();
				}
				public void mouseReleased(MouseEvent e) {
					v.add(new Circle(firstX, firstY, rad));
				}
			});
			addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					rad = (int)Math.sqrt((firstX-x)*(firstX-x)-(firstY-y)*(firstY-y));
					getParent().repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			for(int i = 0; i < v.size(); i++) {
				Circle vc = v.get(i);
				g.drawOval(vc.getX()-vc.getRadius(), vc.getY()-vc.getRadius(), vc.getRadius()*2, vc.getRadius()*2);
			}
			g.drawOval(firstX-rad, firstY-rad, rad*2, rad*2);
		}
	}
	public static void main(String[] args) {
		new DrawingCircle();
	}
}
