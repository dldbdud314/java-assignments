//Professor.java
public class Professor implements Comparable <Professor>{
	String name;
	String position;
	
	public Professor(String name, String position) {
		this.name = name;
		this.position = position;
	}
	public String toString() {
		return (position+": "+name);
	}
	public String getPos() {
		return position;
	}
	public int compareTo(Professor a) {
		if(position=="교수"&&a.getPos()=="교수")
			return 0;
		else if(position=="교수"&&a.getPos()=="부교수")
			return 1;
		else if(position=="교수"&&a.getPos()=="조교수")
			return 1;
		else if(position=="부교수"&&a.getPos()=="교수")
			return -1;
		else if(position=="부교수"&&a.getPos()=="부교수")
			return 0;
		else if(position=="부교수"&&a.getPos()=="조교수")
			return 1;
		else if(position=="조교수"&&a.getPos()=="교수")
			return -1;
		else if(position=="조교수"&&a.getPos()=="부교수")
			return -1;
		else if(position=="조교수"&&a.getPos()=="조교수")
			return 0;
		return 0;
	}
}
