class Point{
	protected int x, y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point{
	String color;
	
	public ColorPoint() {
		super();
		color = "BLACK";
	}
	public ColorPoint(int a, int b) {
		super(a, b);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color+"색의 ("+x+", "+y+")의 점";
	}
}

public class ColorPointUser {

	public static void main(String[] args) {
		ColorPoint zeropoint = new ColorPoint();
		System.out.println(zeropoint.toString()+"입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}

}
