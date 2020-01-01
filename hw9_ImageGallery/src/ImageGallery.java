import java.io.File;
import java.util.Vector;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ImageGallery extends JFrame{
	private File f = new File("images/");
	private File[] subfiles  = f.listFiles();
	private Vector<ImageIcon> v = new Vector<ImageIcon>();
	private int size = subfiles.length;
	private int t = 3;
	private JLabel l;
	private JRadioButton left = new JRadioButton("left", true);
	private JRadioButton right = new JRadioButton("right");
	public ImageGallery(){
		setTitle("¾ä°¶");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < size; i++)
			v.add(new ImageIcon(subfiles[i].getPath()));
		l = new JLabel(v.get(t));
		
		Container c = getContentPane();
		JPanel panel = new JPanel();
		ButtonGroup group = new ButtonGroup();
		group.add(left);
		group.add(right);
		panel.add(left);
		panel.add(right);
		c.add(panel, BorderLayout.NORTH);
		
		c.add(l, BorderLayout.CENTER);
		l.addMouseListener(new MyMouseListener());
		
		setSize(500, 400);
		setVisible(true);
	}

	public class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(left.isSelected()) {
				t--;
				if(t < 0)
					t = size -1;
				l.setIcon(v.get(t));
			}
			else if(right.isSelected()){
				t++;
				if(t > size - 1 )
					t = 0;
				l.setIcon(v.get(t));
			}
		}
	}
	public static void main(String[] args) {
		new ImageGallery();
	}
}
