import javax.swing.*;
import java.util.Vector;
class VibratingLabelThread extends Thread{
	private JLabel label;
	private int x = 100;
	private int y = 100;
	public VibratingLabelThread(JLabel label) {
		this.label = label;
	}
	public void run() {
		Vector<Integer> xPoint = new Vector<Integer>(10);
		Vector<Integer> yPoint = new Vector<Integer>(10);
		int j = 0;
		for(int i = 0; i < xPoint.capacity(); i++) {
			j += 3;
			xPoint.add(x+j);
			yPoint.add(y+j);
		}
		for(int i = 0; ; i++) {
			if(i == xPoint.size()) 
				i = 0;
			label.setSize(100, 40);
			label.setLocation(xPoint.get(i), yPoint.get(i));
			label.repaint();
		}
	}
}
