import java.util.Vector;
class VibratingFrameThread extends Thread{
	private VibratingFrame f;
	public VibratingFrameThread(VibratingFrame f) {
		this.f = f;
	}
	public void run() {
		Vector<Integer> xPoint = new Vector<Integer>(10);
		Vector<Integer> yPoint = new Vector<Integer>(10);
		for(int i = 0; i < xPoint.capacity(); i++) {
			xPoint.add(100+i);
			yPoint.add(100+i);
		}
		for(int i = 0; ; i++) {
			if(i == xPoint.size()) 
				i = 0;
			f.setLocation(xPoint.get(i), yPoint.get(i));
			f.repaint();
		}
	}
}
