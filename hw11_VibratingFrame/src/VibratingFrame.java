import javax.swing.*;
import java.awt.*;
public class VibratingFrame extends JFrame{
	public VibratingFrame() {
		setTitle("�����ϴ� ������ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 200);
		setVisible(true);
		
		VibratingFrameThread t = new VibratingFrameThread(this);
		t.start();
	}
	public static void main(String[] args) {
		new VibratingFrame();
	}

}
